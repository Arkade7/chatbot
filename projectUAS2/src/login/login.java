/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.login to edit this template
 */
package login;

import bot.telegramBot;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

/**
 *
 * @author Asus
 */
public class login {

    String url, usr, pwd, dbn;
    public login (String dbn) {
    this.url = "jdbc:mysql://localhost/" + dbn;
    this.usr = "root";
    this.pwd = "";
    }
    public login (String host, String user, String pass,
    String dbn) {
    this.url = "jdbc:mysql://" + host + "/" + dbn;
    this.usr = user;
    this.pwd = pass;
    }
    public Connection getConnection() {
    Connection con = null;
    try {
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection(this.url, this.usr,
    this.pwd);
    } catch (ClassNotFoundException e) {
    System.out.println ("Error #1 : " + e.getMessage());
    System.exit(0);
    } catch (SQLException e) {
    System.out.println ("Error #2 : " + e.getMessage());
    System.exit(0);
    }
    return con;
    }
    public static void main(String[] args) {
        login kon = new login ("projectPBO_UAS");
        Connection c = kon.getConnection();
        loginUI2 login = new loginUI2();

        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new telegramBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        login = new loginUI2();
        // Menampilkan frame loginUI
        login.setVisible(true);}
    
}
