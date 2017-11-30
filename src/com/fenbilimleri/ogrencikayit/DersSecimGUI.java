package com.fenbilimleri.ogrencikayit;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class DersSecimGUI extends javax.swing.JFrame {
  public int sayac=0;
    public DersSecimGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDers = new javax.swing.JPanel();
        txtOgrenciID = new javax.swing.JTextField();
        lblGelenOgrenciID = new javax.swing.JLabel();
        txtTARIH = new javax.swing.JTextField();
        lblDERSALMATARIHI = new javax.swing.JLabel();
        lblzorunlu1 = new javax.swing.JLabel();
        lblzorunlu2 = new javax.swing.JLabel();
        lblSecmeliDers = new javax.swing.JLabel();
        lblzorunlu3 = new javax.swing.JLabel();
        txtKredi = new javax.swing.JTextField();
        lblkredi = new javax.swing.JLabel();
        cbSecmeliDers = new javax.swing.JComboBox();
        lblzorunlu4 = new javax.swing.JLabel();
        cbZorunluDers1 = new javax.swing.JComboBox();
        cbZorunluDers2 = new javax.swing.JComboBox();
        cbZorunluDers3 = new javax.swing.JComboBox();
        cbZorunluDers4 = new javax.swing.JComboBox();
        btnOgrenciKaydet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DersSecimFormu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlDers.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtOgrenciID.setEnabled(false);
        txtOgrenciID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOgrenciIDActionPerformed(evt);
            }
        });

        lblGelenOgrenciID.setText("Ogrenci ID");

        txtTARIH.setEnabled(false);

        lblDERSALMATARIHI.setText("Ders Alma Tarihi");

        lblzorunlu1.setText("Zorunlu Ders 1");

        lblzorunlu2.setText("Zorunlu Ders 2");

        lblSecmeliDers.setText("Secmeli Ders");

        lblzorunlu3.setText("Zorunlu Ders 3");

        txtKredi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKrediKeyReleased(evt);
            }
        });

        lblkredi.setText("Toplam Kredi");

        cbSecmeliDers.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbSecmeliDersPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cbSecmeliDers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbSecmeliDersKeyReleased(evt);
            }
        });

        lblzorunlu4.setText("Zorunlu Ders 4");

        cbZorunluDers1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbZorunluDers1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cbZorunluDers1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbZorunluDers1KeyReleased(evt);
            }
        });

        cbZorunluDers2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbZorunluDers2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cbZorunluDers2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbZorunluDers2KeyReleased(evt);
            }
        });

        cbZorunluDers3.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbZorunluDers3PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cbZorunluDers3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbZorunluDers3KeyReleased(evt);
            }
        });

        cbZorunluDers4.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbZorunluDers4PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cbZorunluDers4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbZorunluDers4KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlDersLayout = new javax.swing.GroupLayout(pnlDers);
        pnlDers.setLayout(pnlDersLayout);
        pnlDersLayout.setHorizontalGroup(
            pnlDersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDersLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(pnlDersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblzorunlu2)
                            .addComponent(lblzorunlu1)
                            .addComponent(lblzorunlu3)
                            .addComponent(lblzorunlu4)
                            .addComponent(lblSecmeliDers))
                        .addGap(57, 57, 57)
                        .addComponent(cbZorunluDers1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlDersLayout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(cbZorunluDers3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDersLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlDersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDersLayout.createSequentialGroup()
                                .addComponent(lblkredi)
                                .addGap(57, 57, 57)
                                .addComponent(txtKredi, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                            .addComponent(cbSecmeliDers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbZorunluDers4, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbZorunluDers2, javax.swing.GroupLayout.Alignment.TRAILING, 0, 309, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDersLayout.createSequentialGroup()
                                .addGroup(pnlDersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGelenOgrenciID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDERSALMATARIHI, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(60, 60, 60)
                                .addGroup(pnlDersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTARIH, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                    .addComponent(txtOgrenciID, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))))))
                .addContainerGap())
        );

        pnlDersLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbSecmeliDers, txtKredi, txtOgrenciID, txtTARIH});

        pnlDersLayout.setVerticalGroup(
            pnlDersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOgrenciID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGelenOgrenciID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDERSALMATARIHI)
                    .addComponent(txtTARIH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pnlDersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbZorunluDers1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblzorunlu1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbZorunluDers4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblzorunlu2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbZorunluDers2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblzorunlu3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblzorunlu4)
                    .addComponent(cbZorunluDers3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pnlDersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSecmeliDers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSecmeliDers))
                .addGap(38, 38, 38)
                .addGroup(pnlDersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkredi)
                    .addComponent(txtKredi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnOgrenciKaydet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOgrenciKaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Speech-Bubble-add.png"))); // NOI18N
        btnOgrenciKaydet.setText("Kaydet");
        btnOgrenciKaydet.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOgrenciKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOgrenciKaydetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(488, 488, 488)
                .addComponent(btnOgrenciKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlDers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOgrenciKaydet)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection baglanti = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;


private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    baglanti = oraclebaglantisi.Baglan();
    acilirderslerisecmeliderslerledoldur();
    acilirderslerizorunluderslerledoldur();
    txtOgrenciID.setText(KullaniciFormuGUI.ogr_id.toString());
    


}//GEN-LAST:event_formWindowOpened

private void cbSecmeliDersPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbSecmeliDersPopupMenuWillBecomeInvisible
    SecmelikrediHesaplayanMetod();
}//GEN-LAST:event_cbSecmeliDersPopupMenuWillBecomeInvisible

private void cbSecmeliDersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbSecmeliDersKeyReleased
   
}//GEN-LAST:event_cbSecmeliDersKeyReleased

private void txtKrediKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKrediKeyReleased

}//GEN-LAST:event_txtKrediKeyReleased

private void btnOgrenciKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOgrenciKaydetActionPerformed
    kaydetDersNormalYolla2();
}//GEN-LAST:event_btnOgrenciKaydetActionPerformed

    private void txtOgrenciIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOgrenciIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOgrenciIDActionPerformed

    private void cbZorunluDers1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbZorunluDers1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
         try {
            preparedStatement = baglanti.prepareStatement("SELECT * FROM SECIM_ZORUNLU WHERE ZORUNLUDERSADI = ?");
            preparedStatement.setString(1, cbZorunluDers1.getSelectedItem().toString());
           
            resultSet = preparedStatement.executeQuery();
                
      
               while (resultSet.next()) {
                 int z1=0;
           z1=Integer.parseInt(resultSet.getString("ZORUNLUDERSKREDI"));
           sayac=sayac+z1;
        
            
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_cbZorunluDers1PopupMenuWillBecomeInvisible

    private void cbZorunluDers1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbZorunluDers1KeyReleased
        // TODO add your handling code here:
            ZorunlukrediHesaplayanMetod();
    }//GEN-LAST:event_cbZorunluDers1KeyReleased

    private void cbZorunluDers2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbZorunluDers2PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
             try {
            preparedStatement = baglanti.prepareStatement("SELECT * FROM SECIM_ZORUNLU WHERE ZORUNLUDERSADI = ?");
          
              preparedStatement.setString(1, cbZorunluDers2.getSelectedItem().toString());
             
            resultSet = preparedStatement.executeQuery();
                
              while (resultSet.next()) {
                 int z2=0;
           z2=Integer.parseInt(resultSet.getString("ZORUNLUDERSKREDI"));
           sayac=sayac+z2;
       
            
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_cbZorunluDers2PopupMenuWillBecomeInvisible

    private void cbZorunluDers2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbZorunluDers2KeyReleased
        // TODO add your handling code here:
            ZorunlukrediHesaplayanMetod();
    }//GEN-LAST:event_cbZorunluDers2KeyReleased

    private void cbZorunluDers3PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbZorunluDers3PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
             try {
            preparedStatement = baglanti.prepareStatement("SELECT * FROM SECIM_ZORUNLU WHERE ZORUNLUDERSADI = ?");
        
              preparedStatement.setString(1, cbZorunluDers3.getSelectedItem().toString());
            
            resultSet = preparedStatement.executeQuery();
               while (resultSet.next()) {
                 int z3=0;
           z3=Integer.parseInt(resultSet.getString("ZORUNLUDERSKREDI"));
           sayac=sayac+z3;
          
            
            }

        } catch (Exception e) {

        }
       
    }//GEN-LAST:event_cbZorunluDers3PopupMenuWillBecomeInvisible

    private void cbZorunluDers3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbZorunluDers3KeyReleased
        // TODO add your handling code here:
            ZorunlukrediHesaplayanMetod();
    }//GEN-LAST:event_cbZorunluDers3KeyReleased

    private void cbZorunluDers4PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbZorunluDers4PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
             try {
            preparedStatement = baglanti.prepareStatement("SELECT * FROM SECIM_ZORUNLU WHERE ZORUNLUDERSADI = ?");
         
              preparedStatement.setString(1, cbZorunluDers4.getSelectedItem().toString());
            resultSet = preparedStatement.executeQuery();
              while (resultSet.next()) {
                 int z4=0;
           z4=Integer.parseInt(resultSet.getString("ZORUNLUDERSKREDI"));
           sayac=sayac+z4;
          
            }

        } catch (Exception e) {

        }
       
    }//GEN-LAST:event_cbZorunluDers4PopupMenuWillBecomeInvisible

    private void cbZorunluDers4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbZorunluDers4KeyReleased
        // TODO add your handling code here:
          
    }//GEN-LAST:event_cbZorunluDers4KeyReleased

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
            java.util.logging.Logger.getLogger(DersSecimGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DersSecimGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DersSecimGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DersSecimGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new DersSecimGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOgrenciKaydet;
    private javax.swing.JComboBox cbSecmeliDers;
    private javax.swing.JComboBox cbZorunluDers1;
    private javax.swing.JComboBox cbZorunluDers2;
    private javax.swing.JComboBox cbZorunluDers3;
    private javax.swing.JComboBox cbZorunluDers4;
    private javax.swing.JLabel lblDERSALMATARIHI;
    private javax.swing.JLabel lblGelenOgrenciID;
    private javax.swing.JLabel lblSecmeliDers;
    private javax.swing.JLabel lblkredi;
    private javax.swing.JLabel lblzorunlu1;
    private javax.swing.JLabel lblzorunlu2;
    private javax.swing.JLabel lblzorunlu3;
    private javax.swing.JLabel lblzorunlu4;
    private javax.swing.JPanel pnlDers;
    private javax.swing.JTextField txtKredi;
    public javax.swing.JTextField txtOgrenciID;
    private javax.swing.JTextField txtTARIH;
    // End of variables declaration//GEN-END:variables

    private void acilirderslerisecmeliderslerledoldur() {

        try {
            preparedStatement = baglanti.prepareStatement("SELECT * FROM SECIM_SECMELI");
            resultSet = preparedStatement.executeQuery();

            cbSecmeliDers.addItem("");//İLK KAYDINIZ
            while (resultSet.next()) {
                String SECMELIDERSADI = resultSet.getString("SECMELIDERSADI");
                cbSecmeliDers.addItem(SECMELIDERSADI);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA1 : " + e, "MESAJ", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void acilirderslerizorunluderslerledoldur() {

        try {
            preparedStatement = baglanti.prepareStatement("SELECT * FROM SECIM_ZORUNLU");
            resultSet = preparedStatement.executeQuery();

            cbZorunluDers1.addItem("");//İLK KAYDINIZ
            cbZorunluDers2.addItem("");
            cbZorunluDers3.addItem("");
            cbZorunluDers4.addItem("");
            while (resultSet.next()) {
                String ZORUNLUDERSADI = resultSet.getString("ZORUNLUDERSADI");
                cbZorunluDers1.addItem(ZORUNLUDERSADI);
                cbZorunluDers2.addItem(ZORUNLUDERSADI);
                cbZorunluDers3.addItem(ZORUNLUDERSADI);
                cbZorunluDers4.addItem(ZORUNLUDERSADI);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA1 : " + e, "MESAJ", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void SecmelikrediHesaplayanMetod() {
        try {
            preparedStatement = baglanti.prepareStatement("SELECT * FROM SECIM_SECMELI WHERE SECMELIDERSADI = ?");
            preparedStatement.setString(1, cbSecmeliDers.getSelectedItem().toString());
            resultSet = preparedStatement.executeQuery();
                
             while (resultSet.next()) {
                 int a;
           a=Integer.parseInt(resultSet.getString("SECMELIDERSKREDI"));
           sayac=sayac+a;
           txtKredi.setText(String.valueOf(sayac));
            
            }

        } catch (Exception e) {

        }

    }
    
    private void ZorunlukrediHesaplayanMetod() {
        try {
            preparedStatement = baglanti.prepareStatement("SELECT * FROM SECIM_ZORUNLU WHERE ZORUNLUDERSADI = ?");
            preparedStatement.setString(1, cbZorunluDers1.getSelectedItem().toString());
              preparedStatement.setString(1, cbZorunluDers2.getSelectedItem().toString());
              preparedStatement.setString(1, cbZorunluDers3.getSelectedItem().toString());
              preparedStatement.setString(1, cbZorunluDers4.getSelectedItem().toString());
            resultSet = preparedStatement.executeQuery();
                
             while (resultSet.next()) {
           txtKredi.setText(resultSet.getString("ZORUNLUDERSKREDI"));

            
            }

        } catch (Exception e) {

        }

    }

    private void kaydetDersNormalYolla2() {

        try {

            String eklemeSorgusu = "INSERT INTO DERS  "
                    + "(DERSID ,DERSALMATARIHI ,ZORUNLUDERS1 ,ZORUNLUDERS2 ,"
                    + "ZORUNLUDERS3 ,ZORUNLUDERS4 ,SECMELIDERS1,TOPLAMKREDI,OGRENCIID)"
                    + "VALUES(?,?,?,?,?,?,?,?,?)";
            preparedStatement = baglanti.prepareStatement(eklemeSorgusu);

            preparedStatement.setString(1, txtOgrenciID.getText());
            preparedStatement.setString(2, txtTARIH.getText());
            preparedStatement.setString(3, cbZorunluDers1.getSelectedItem().toString());
            preparedStatement.setString(4, cbZorunluDers2.getSelectedItem().toString());
            preparedStatement.setString(5, cbZorunluDers3.getSelectedItem().toString());
            preparedStatement.setString(6, cbZorunluDers4.getSelectedItem().toString());
            preparedStatement.setString(7, cbSecmeliDers.getSelectedItem().toString());
            preparedStatement.setString(8, txtKredi.getText());
            preparedStatement.setString(9, txtOgrenciID.getText());

            preparedStatement.execute();

            dersFormunuTemizle();

            JOptionPane.showMessageDialog(null, "Kayıt başarıyla kaydedildi.", "MESAJ", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA3 :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);

        }

    }
    

    private void dersFormunuTemizle() {

        txtTARIH.setText(null);
        cbZorunluDers1.setSelectedIndex(0);
        cbZorunluDers2.setSelectedIndex(0);
        cbZorunluDers3.setSelectedIndex(0);
        cbZorunluDers4.setSelectedIndex(0);
        cbSecmeliDers.setSelectedIndex(0);
        txtKredi.setText("");
    }
}
