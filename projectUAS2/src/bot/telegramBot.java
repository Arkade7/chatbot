/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bot;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import login.login;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.telegrambots.meta.api.objects.User;


/**
 *
 * @author Asus
 */
public class telegramBot extends TelegramLongPollingBot{
    ResultSet resultSet;
    boolean verifikasi = false;
    login kon = new login("projectPBO_UAS");
    Connection con = (Connection) kon.getConnection();
    @Override
    public void onUpdateReceived(Update update) {
         if (update.hasMessage() && update.getMessage().hasText()) {
        SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
        message.setChatId(update.getMessage().getChatId().toString());
        String pesan = update.getMessage().getText();   
        User user = update.getMessage().getFrom();
        String member_id = user.getId().toString();
        String firstName = user.getFirstName();
        String lastName = user.getLastName();

        // Menyimpan informasi pengguna ke database
        try {
    String checkQuery = "SELECT COUNT(*) FROM member WHERE member_id = ?";
    PreparedStatement checkStatement = con.prepareStatement(checkQuery);
    checkStatement.setString(1, member_id);
    ResultSet resultSet = checkStatement.executeQuery();
    resultSet.next();
    int count = resultSet.getInt(1);
    if (count == 0) {
        try {
            String insertQuery = "INSERT INTO member (member_id, first_name, last_name,status) VALUES (?, ?, ?,?)";
            PreparedStatement insertStatement = con.prepareStatement(insertQuery);
            insertStatement.setString(1, member_id);
            insertStatement.setString(2, firstName);
            insertStatement.setString(3, lastName);
            insertStatement.setString(4, "user");
            insertStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
} catch (SQLException e) {
    e.printStackTrace();
}
        
        simpanPesanUser(update, user);
        try{
        String query = "SELECT * FROM keyword WHERE keyword = ?";
        PreparedStatement statement = con.prepareStatement(query);
        statement.setString(1, pesan);
        resultSet = statement.executeQuery();
        if(pesan.startsWith("/verifikasi")){           
            verifikasi = true;
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText("Apakah Anda bukan bot? (ya/tidak)");
            simpanPesanBot(message);
    }else if(pesan.startsWith("/help")){
        try {
        String queryHelp = "SELECT keyword FROM keyword";
        PreparedStatement statementHelp = con.prepareStatement(queryHelp);
        String help = ("/verifikasi \n /help");
        ResultSet resultSetHelp = statementHelp.executeQuery();

        // Kirim pesan ke setiap pengguna dengan ID yang diambil dari tabel member
        while (resultSetHelp.next()) {
            help = help + "\n" + resultSetHelp.getString("keyword");            
        }  
        message.setChatId(update.getMessage().getChatId().toString());
        message.setText(help);
        simpanPesanBot(message);
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }
        else if (resultSet.next()) {
            String jawaban = resultSet.getString("jawaban");
            message.setText(jawaban);
            simpanPesanBot(message);
        } else if (pesan.equalsIgnoreCase("ya") && verifikasi == true) {
        String updateQuery = "UPDATE member SET status = ? WHERE member_id = ?";
        PreparedStatement updateStatement = con.prepareStatement(updateQuery);
        updateStatement.setString(1, "member");
        updateStatement.setString(2, member_id);
        updateStatement.executeUpdate();
        message.setText("anda behasil mendaftar menjadi member");
        simpanPesanBot(message);        
    } else if (pesan.equalsIgnoreCase("tidak")  && verifikasi == true){
        message.setText("anda gagal mendaftar menjadi member");
        simpanPesanBot(message);      
    }
        
        
        else {
            message.setText("perintah tidak dimengerti \n silahkan ketik /help untuk daftar perintah");
            simpanPesanBot(message);
        };
            }catch (SQLException e) {
            // Tangani kesalahan SQL jika terjadi
            e.printStackTrace();}
        
        
        
        try {
            execute(message); // Call method to send the message
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        
        
            
    }}
   
    

    @Override
    public String getBotUsername() {
        // TODO
        return "D_Avedo_bot";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "6024820525:AAGd2Fn1hMi4ALyjSTbmoxh0NFSpiiZpdUo";
    }
    
   private void simpanPesanUser(Update update, User user){
       String pengirim = user.getId().toString();
       String pesanMasuk = update.getMessage().getText();
       String tanggal = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
       String insertQuery = "INSERT INTO history_user (id_pengirim, tanggal, pesan) VALUES (?, ?, ?)";
            PreparedStatement insertStatement;
             try {
                 insertStatement = con.prepareStatement(insertQuery);
                 insertStatement.setString(1, pengirim);
                 insertStatement.setString(2, tanggal);
                 insertStatement.setString(3, pesanMasuk);
                 insertStatement.executeUpdate();
             } catch (SQLException ex) {
                 Logger.getLogger(telegramBot.class.getName()).log(Level.SEVERE, null, ex);
             }
   }
   
   public void simpanPesanBot(SendMessage message){
       String insertBotQuery = "INSERT INTO history_bot (tanggal, pesan) VALUES (?, ?)";
       String tanggal = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
             try {
                 PreparedStatement insertBotStatement = con.prepareStatement(insertBotQuery);
                insertBotStatement.setString(1, tanggal);
                insertBotStatement.setString(2, message.getText());
                insertBotStatement.executeUpdate();
            
             } catch (SQLException ex) {
                 Logger.getLogger(telegramBot.class.getName()).log(Level.SEVERE, null, ex);
             }
   }
      
}




