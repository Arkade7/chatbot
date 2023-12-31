/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bot;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login.login;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


/**
 *
 * @author Asus
 */
public class pesanUI extends javax.swing.JFrame {
    telegramBot telegramBot = new telegramBot();
    login kon = new login("projectPBO_UAS");
    Connection con = (Connection) kon.getConnection();
    public void tampilkan_data() throws SQLException{
        try{
            DefaultTableModel model = (DefaultTableModel)tblMember.getModel();   
            model.setRowCount(0);
            String sql = "select * from member";
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
            ResultSet resultset = statement.executeQuery(); 
            while (resultset.next()){
                model.addRow(new Object[]{resultset.getString(1),resultset.getString(2),resultset.getString(3)});
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        
    }

    /**
     * Creates new form pesanUI
     */
    public pesanUI() {
        initComponents();
        try {
            tampilkan_data();
        } catch (SQLException ex) {
            Logger.getLogger(pesanUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMember = new javax.swing.JTable();
        pesanField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        broadcastBTN = new javax.swing.JButton();
        personalBTN = new javax.swing.JButton();
        kembaliBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jButton3.setText("personal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "member id", "first name", "last name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMember);

        jLabel1.setText("pesan");

        jLabel2.setText("tujuan");

        broadcastBTN.setText("broadcast");
        broadcastBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broadcastBTNActionPerformed(evt);
            }
        });

        personalBTN.setText("personal");
        personalBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalBTNActionPerformed(evt);
            }
        });

        kembaliBTN.setText("kembali");
        kembaliBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliBTNActionPerformed(evt);
            }
        });

        jLabel3.setText("masukkan id yang ingin dituju");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addGap(7, 7, 7))
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(broadcastBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(personalBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kembaliBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pesanField))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kembaliBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(broadcastBTN)
                        .addComponent(personalBTN)))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void broadcastBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broadcastBTNActionPerformed
        String pesan = pesanField.getText();

    // Mengambil daftar ID pengguna dari tabel member
    try {
        String query = "SELECT member_id FROM member where status ='member'";
        PreparedStatement statement = (PreparedStatement) con.prepareStatement(query);

        // Eksekusi query
        ResultSet resultSet = statement.executeQuery();

        // Kirim pesan ke setiap pengguna dengan ID yang diambil dari tabel member
        while (resultSet.next()) {
            String idTelegram = resultSet.getString("member_id");
            SendMessage message = new SendMessage();
            message.setChatId(idTelegram);
            message.setText(pesan);

            try {
                new telegramBot().execute(message);
                telegramBot.simpanPesanBot(message);
                JOptionPane.showMessageDialog(null, "Pesan berhasil dikirim ke semua pengguna");
            } catch (TelegramApiException e) {
                JOptionPane.showMessageDialog(null, "Gagal mengirim pesan");
                e.printStackTrace();
            }
        }    
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_broadcastBTNActionPerformed

    private void personalBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalBTNActionPerformed
        String idTelegram = idField.getText();
        String pesan = pesanField.getText();

    // Kirim pesan ke ID Telegram menggunakan longpollingbot
        SendMessage message = new SendMessage();
        message.setChatId(idTelegram);
        message.setText(pesan);
        try {
        new telegramBot().execute(message);
        JOptionPane.showMessageDialog(null, "berhasil mengirim pesan");
        } catch (TelegramApiException e) {
        JOptionPane.showMessageDialog(null, "gagal mengirim pesan");
        e.printStackTrace();
}
    }//GEN-LAST:event_personalBTNActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void kembaliBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliBTNActionPerformed
        menu.menuUI nextPage = new menu.menuUI();
        nextPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_kembaliBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pesanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pesanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pesanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pesanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pesanUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton broadcastBTN;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kembaliBTN;
    private javax.swing.JButton personalBTN;
    private javax.swing.JTextField pesanField;
    private javax.swing.JTable tblMember;
    // End of variables declaration//GEN-END:variables
}
