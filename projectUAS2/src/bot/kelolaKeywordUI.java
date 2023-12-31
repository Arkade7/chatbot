/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bot;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import login.login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.validation.constraints.Null;

/**
 *
 * @author Asus
 */
public class kelolaKeywordUI extends javax.swing.JFrame {
    public void tampilkan_data() throws SQLException{
        try{
            DefaultTableModel keyword = (DefaultTableModel)tblKeyword.getModel();   
            keyword.setRowCount(0);
            String sql = "select * from keyword";
            login kon = new login("projectPBO_UAS");
            Connection con = (Connection) kon.getConnection();
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
            ResultSet resultset = statement.executeQuery(); 
            while (resultset.next()){
                keyword.addRow(new Object[]{resultset.getInt(1),resultset.getString(2),resultset.getString(3)});
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        
    }
    /**
     * Creates new form AdminUI
     */
    public kelolaKeywordUI() {
        initComponents();
    try {
        tampilkan_data();
    } catch (SQLException ex) {
        Logger.getLogger(kelolaKeywordUI.class.getName()).log(Level.SEVERE, null, ex);
    }}
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblKeyword = new javax.swing.JTable();
        tambahBTN = new javax.swing.JButton();
        hapusBTN = new javax.swing.JButton();
        simpanBTN = new javax.swing.JButton();
        keywordField = new javax.swing.JTextField();
        jawabanField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        batalBTN = new javax.swing.JButton();
        kembaliBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 350));
        setPreferredSize(new java.awt.Dimension(500, 350));

        tblKeyword.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "keyword", "jawaban"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKeyword.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                tblKeywordMouseWheelMoved(evt);
            }
        });
        jScrollPane1.setViewportView(tblKeyword);

        tambahBTN.setText("tambah");
        tambahBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBTNActionPerformed(evt);
            }
        });

        hapusBTN.setText("hapus");
        hapusBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBTNActionPerformed(evt);
            }
        });

        simpanBTN.setText("simpan");
        simpanBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBTNActionPerformed(evt);
            }
        });

        keywordField.setEditable(false);
        keywordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keywordFieldActionPerformed(evt);
            }
        });

        jawabanField.setEditable(false);
        jawabanField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jawabanFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("keyword");

        jLabel2.setText("jawaban");

        batalBTN.setText("batal");
        batalBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalBTNActionPerformed(evt);
            }
        });

        kembaliBTN.setText("kembali");
        kembaliBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keywordField)
                            .addComponent(jawabanField))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tambahBTN)
                        .addGap(18, 18, 18)
                        .addComponent(hapusBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kembaliBTN)
                        .addGap(44, 44, 44)
                        .addComponent(batalBTN)
                        .addGap(18, 18, 18)
                        .addComponent(simpanBTN)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(keywordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jawabanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(simpanBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(tambahBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hapusBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(batalBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kembaliBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hapusBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBTNActionPerformed
        keywordField.setEditable(true);
        jawabanField.setEditable(false);
    }//GEN-LAST:event_hapusBTNActionPerformed

    private void simpanBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBTNActionPerformed
        
        login kon = new login("projectPBO_UAS");
        Connection con = kon.getConnection();
        String keyword = keywordField.getText();
        String jawaban = jawabanField.getText();
        if(!keyword.isEmpty() && !jawaban.isEmpty()){
        try {
            // Buat query untuk memasukkan data ke tabel
            String query = "INSERT INTO keyword (keyword,jawaban) VALUES (?,?)";
            java.sql.PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, keyword);
            statement.setString(2, jawaban);

            // Eksekusi query
            
                    // Eksekusi query
        int rowsInserted = statement.executeUpdate();

        if (rowsInserted > 0) {
            // Jika data berhasil ditambahkan
            JOptionPane.showMessageDialog(null, "keyword berhasil ditambah");
        } else {
            // Jika tidak ada data yang berhasil ditambahkan
            JOptionPane.showMessageDialog(null, "keyword gagal ditambah");
        }

        // Tutup statement
        statement.close();
    } catch (SQLException e) {
        // Tangani kesalahan SQL jika terjadi
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan dalam menambahkan data");
    }
} else if (!keyword.isEmpty()) {
    try {
        String sql = "DELETE FROM keyword WHERE keyword = ?";
        java.sql.PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1, keyword);
        int rowsDeleted = statement.executeUpdate();

        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus dari tabel keyword");
        } else {
            JOptionPane.showMessageDialog(null, "Tidak ada data yang dihapus");
        }

        // Tutup statement
        statement.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan dalam menghapus data");
    }}
            try {
                tampilkan_data();
            } catch (SQLException ex) {
                Logger.getLogger(kelolaKeywordUI.class.getName()).log(Level.SEVERE, null, ex);
            }
    keywordField.setText("");
    jawabanField.setText("");        
    }//GEN-LAST:event_simpanBTNActionPerformed

    private void jawabanFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jawabanFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jawabanFieldActionPerformed

    private void keywordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keywordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keywordFieldActionPerformed

    private void tambahBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBTNActionPerformed
        keywordField.setEditable(true);
        jawabanField.setEditable(true);
    }//GEN-LAST:event_tambahBTNActionPerformed

    private void batalBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalBTNActionPerformed
        keywordField.setEditable(false);
        jawabanField.setEditable(false);
        String keyword = keywordField.getText();
        String jawaban = jawabanField.getText();
        keywordField.setText("");
        jawabanField.setText("");
    }//GEN-LAST:event_batalBTNActionPerformed

    private void tblKeywordMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_tblKeywordMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tblKeywordMouseWheelMoved

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
            java.util.logging.Logger.getLogger(kelolaKeywordUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kelolaKeywordUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kelolaKeywordUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kelolaKeywordUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kelolaKeywordUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalBTN;
    private javax.swing.JButton hapusBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jawabanField;
    private javax.swing.JButton kembaliBTN;
    private javax.swing.JTextField keywordField;
    private javax.swing.JButton simpanBTN;
    private javax.swing.JButton tambahBTN;
    private javax.swing.JTable tblKeyword;
    // End of variables declaration//GEN-END:variables
}
