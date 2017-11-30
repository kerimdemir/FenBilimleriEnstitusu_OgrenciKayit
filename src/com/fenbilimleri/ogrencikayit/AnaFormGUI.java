package com.fenbilimleri.ogrencikayit;

public class AnaFormGUI extends javax.swing.JFrame {

    public AnaFormGUI() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAnaForm = new javax.swing.JPanel();
        lblAnaFormFotografi = new javax.swing.JLabel();
        btnSistemeGiris = new javax.swing.JButton();
        btnSistemdenCikis = new javax.swing.JButton();
        btnKullaniciGirisi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ANA FORM");

        pnlAnaForm.setBackground(new java.awt.Color(255, 255, 204));

        lblAnaFormFotografi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FOTOGRAF.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlAnaFormLayout = new javax.swing.GroupLayout(pnlAnaForm);
        pnlAnaForm.setLayout(pnlAnaFormLayout);
        pnlAnaFormLayout.setHorizontalGroup(
            pnlAnaFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnaFormFotografi, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnlAnaFormLayout.setVerticalGroup(
            pnlAnaFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnaFormFotografi, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        );

        btnSistemeGiris.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSistemeGiris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrow.png"))); // NOI18N
        btnSistemeGiris.setText("Sisteme Giriş");
        btnSistemeGiris.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSistemeGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSistemeGirisActionPerformed(evt);
            }
        });

        btnSistemdenCikis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSistemdenCikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/X.png"))); // NOI18N
        btnSistemdenCikis.setText("Çıkış");
        btnSistemdenCikis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSistemdenCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSistemdenCikisActionPerformed(evt);
            }
        });

        btnKullaniciGirisi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKullaniciGirisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrow.png"))); // NOI18N
        btnKullaniciGirisi.setText("Kullanıcı Girisi");
        btnKullaniciGirisi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKullaniciGirisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciGirisiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("Ders Seçme Ekranı");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnSistemeGiris)
                        .addGap(55, 55, 55)
                        .addComponent(btnKullaniciGirisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSistemdenCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlAnaForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlAnaForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSistemeGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnKullaniciGirisi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSistemdenCikis))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSistemeGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSistemeGirisActionPerformed
       GirisFormGUI girisFormGUI = new GirisFormGUI();
       girisFormGUI.setVisible(true);
    }//GEN-LAST:event_btnSistemeGirisActionPerformed

    private void btnSistemdenCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSistemdenCikisActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnSistemdenCikisActionPerformed

    private void btnKullaniciGirisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciGirisiActionPerformed
        // TODO add your handling code here:
        
         KullaniciFormuGUI kullFormGUI = new KullaniciFormuGUI();
         kullFormGUI.setVisible(true);
        
    }//GEN-LAST:event_btnKullaniciGirisiActionPerformed

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
            java.util.logging.Logger.getLogger(AnaFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AnaFormGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKullaniciGirisi;
    private javax.swing.JButton btnSistemdenCikis;
    private javax.swing.JButton btnSistemeGiris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAnaFormFotografi;
    private javax.swing.JPanel pnlAnaForm;
    // End of variables declaration//GEN-END:variables
}
