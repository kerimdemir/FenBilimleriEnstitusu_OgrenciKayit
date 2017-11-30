package com.fenbilimleri.ogrencikayit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class KullaniciFormuGUI extends javax.swing.JFrame {

    public static String ogr_id;
    public KullaniciFormuGUI() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblKullaniciAdi = new javax.swing.JLabel();
        lblParola = new javax.swing.JLabel();
        txtKullaniciAdi = new javax.swing.JTextField();
        btnKullaniciGirisi = new javax.swing.JButton();
        txtParola = new javax.swing.JPasswordField();
        lblParola1 = new javax.swing.JLabel();
        txtOgrenciID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("YÖNETİCİ GİRİŞ FORMU");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblKullaniciAdi.setText("Kullanıcı Adı");

        lblParola.setText("Parola");

        btnKullaniciGirisi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKullaniciGirisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Checkmark.png"))); // NOI18N
        btnKullaniciGirisi.setText("Giriş");
        btnKullaniciGirisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciGirisiActionPerformed(evt);
            }
        });

        lblParola1.setText("Ogrenci ID");

        txtOgrenciID.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblParola)
                    .addComponent(lblKullaniciAdi)
                    .addComponent(lblParola1))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnKullaniciGirisi))
                    .addComponent(txtParola, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtOgrenciID, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullaniciAdi)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblParola)
                    .addComponent(txtParola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblParola1)
                    .addComponent(txtOgrenciID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnKullaniciGirisi))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection baglanti = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        baglanti = oraclebaglantisi.Baglan();
        
          

    }//GEN-LAST:event_formWindowOpened

    private void btnKullaniciGirisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciGirisiActionPerformed
 String kullaniciGirisiSorguCumlesi = "SELECT * FROM OGRENCI "
                                    + "WHERE OGRENCIADISOYADI = ? AND OGRENCINUMARASI = ?";

        try {
            preparedStatement = baglanti.prepareStatement(kullaniciGirisiSorguCumlesi);
            preparedStatement.setString(1, txtKullaniciAdi.getText());
            preparedStatement.setString(2, txtParola.getText());

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Kullanıcı adı ve parolası doğrulandı.", "MESAJ",
                        JOptionPane.INFORMATION_MESSAGE);
                txtOgrenciID.setText(resultSet.getString("OGRENCIID"));
                
               ogr_id=txtOgrenciID.getText();
                this.setVisible(false);

                DersSecimGUI d = new DersSecimGUI();
                d.setVisible(rootPaneCheckingEnabled);


            } else {
                JOptionPane.showMessageDialog(null, "Kullanıcı adı ve parolası geçersiz.", "MESAJ",
                        JOptionPane.ERROR_MESSAGE);

            }







        } catch (Exception e) {
        }


    }//GEN-LAST:event_btnKullaniciGirisiActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       
        
        
            if (baglanti != null) {

                try {
                    baglanti.close();
                } catch (Exception e) {
                }

            }

            
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (Exception e) {
                }
            }


          
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (Exception e) {
                }
            }
            
            
            
            
          
            
        
    }//GEN-LAST:event_formWindowClosing

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KullaniciFormuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciFormuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciFormuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciFormuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new KullaniciFormuGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKullaniciGirisi;
    private javax.swing.JLabel lblKullaniciAdi;
    private javax.swing.JLabel lblParola;
    private javax.swing.JLabel lblParola1;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JTextField txtOgrenciID;
    private javax.swing.JPasswordField txtParola;
    // End of variables declaration//GEN-END:variables
}
