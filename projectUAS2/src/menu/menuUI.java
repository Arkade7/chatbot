/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu;

/**
 *
 * @author Asus
 */
public class menuUI extends javax.swing.JFrame {

    /**
     * Creates new form menuUI
     */
    public menuUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        kelolaMemberBTN = new javax.swing.JButton();
        kelolaKeywordBTN = new javax.swing.JButton();
        historyUserBTN = new javax.swing.JButton();
        pesanBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        logoutBTN = new javax.swing.JButton();
        historyBotBTN = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kelolaMemberBTN.setText("kelola member");
        kelolaMemberBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelolaMemberBTNActionPerformed(evt);
            }
        });

        kelolaKeywordBTN.setText("kelola interaksi bot");
        kelolaKeywordBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelolaKeywordBTNActionPerformed(evt);
            }
        });

        historyUserBTN.setText("history chat user");
        historyUserBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyUserBTNActionPerformed(evt);
            }
        });

        pesanBTN.setText("kirim pesan");
        pesanBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanBTNActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("MENU ADMIN");

        logoutBTN.setText("logout");
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });

        historyBotBTN.setText("history chat bot");
        historyBotBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyBotBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(historyBotBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kelolaMemberBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kelolaKeywordBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                        .addComponent(pesanBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(historyUserBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(kelolaMemberBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kelolaKeywordBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pesanBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(historyUserBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(historyBotBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutBTN)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kelolaKeywordBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelolaKeywordBTNActionPerformed
        bot.kelolaKeywordUI nextPage = new bot.kelolaKeywordUI();
        nextPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_kelolaKeywordBTNActionPerformed

    private void historyUserBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyUserBTNActionPerformed
        bot.historyUserUI nextPage = new bot.historyUserUI();
        nextPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_historyUserBTNActionPerformed

    private void kelolaMemberBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelolaMemberBTNActionPerformed
        bot.kelolaMemberUI nextPage = new bot.kelolaMemberUI();
        nextPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_kelolaMemberBTNActionPerformed

    private void pesanBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanBTNActionPerformed
        bot.pesanUI nextPage = new bot.pesanUI();
        nextPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_pesanBTNActionPerformed

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed

        dispose();
    }//GEN-LAST:event_logoutBTNActionPerformed

    private void historyBotBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyBotBTNActionPerformed
        bot.historyBotUI nextPage = new bot.historyBotUI();
        nextPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_historyBotBTNActionPerformed

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
            java.util.logging.Logger.getLogger(menuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton historyBotBTN;
    private javax.swing.JButton historyUserBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton kelolaKeywordBTN;
    private javax.swing.JButton kelolaMemberBTN;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JButton pesanBTN;
    // End of variables declaration//GEN-END:variables
}