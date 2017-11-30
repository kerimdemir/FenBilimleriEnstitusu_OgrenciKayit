package com.fenbilimleri.ogrencikayit;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

import net.proteanit.sql.DbUtils;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class YoneticiFormuGUI extends javax.swing.JFrame {

    public YoneticiFormuGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupEhliyet = new javax.swing.ButtonGroup();
        pnlAramaYap = new javax.swing.JPanel();
        txtAramaYapOgrenciAdiSoyadi = new javax.swing.JTextField();
        lblAramaYapOgrenciAdiSoyadi = new javax.swing.JLabel();
        lblAramaYapOgrencinumarasi = new javax.swing.JLabel();
        txtAramaYapOgrenciNumarasi = new javax.swing.JTextField();
        lblAramaYapMesaj = new javax.swing.JLabel();
        pnlOgrenci = new javax.swing.JPanel();
        txtOgrenciNumarasi = new javax.swing.JTextField();
        txtOgrenciAdiSoyadi = new javax.swing.JTextField();
        AdSoyad = new javax.swing.JLabel();
        Numara = new javax.swing.JLabel();
        btnogrenciSil = new javax.swing.JButton();
        btnogrenciGuncelle = new javax.swing.JButton();
        btnogrenciKaydet = new javax.swing.JButton();
        btnogrenciTemizle = new javax.swing.JButton();
        btnogrenciyazdir = new javax.swing.JButton();
        btnyedekle = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnyedektendon = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSonEklenen5Kayit = new javax.swing.JTextPane();
        btnDersSil = new javax.swing.JButton();
        btnDersGuncelle = new javax.swing.JButton();
        btnDersEkle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("YÖNETİCİ FORMU");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlAramaYap.setBackground(new java.awt.Color(204, 204, 204));
        pnlAramaYap.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtAramaYapOgrenciAdiSoyadi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAramaYapOgrenciAdiSoyadiKeyReleased(evt);
            }
        });

        lblAramaYapOgrenciAdiSoyadi.setText("Adı Soyadı");

        lblAramaYapOgrencinumarasi.setText("Numarası");

        txtAramaYapOgrenciNumarasi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAramaYapOgrenciAdiSoyadiKeyReleased(evt);
            }
        });

        lblAramaYapMesaj.setText("Mesaj");

        javax.swing.GroupLayout pnlAramaYapLayout = new javax.swing.GroupLayout(pnlAramaYap);
        pnlAramaYap.setLayout(pnlAramaYapLayout);
        pnlAramaYapLayout.setHorizontalGroup(
            pnlAramaYapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAramaYapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAramaYapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAramaYapLayout.createSequentialGroup()
                        .addGroup(pnlAramaYapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAramaYapOgrencinumarasi)
                            .addComponent(lblAramaYapOgrenciAdiSoyadi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAramaYapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAramaYapOgrenciNumarasi, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txtAramaYapOgrenciAdiSoyadi, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))
                    .addComponent(lblAramaYapMesaj))
                .addContainerGap())
        );
        pnlAramaYapLayout.setVerticalGroup(
            pnlAramaYapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAramaYapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAramaYapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAramaYapOgrenciAdiSoyadi)
                    .addComponent(txtAramaYapOgrenciAdiSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAramaYapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAramaYapOgrencinumarasi)
                    .addComponent(txtAramaYapOgrenciNumarasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblAramaYapMesaj)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlOgrenci.setBackground(new java.awt.Color(204, 204, 204));

        AdSoyad.setText(" Adı Soyadı");

        Numara.setText("Numarası");

        btnogrenciSil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnogrenciSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Person-white-x.png"))); // NOI18N
        btnogrenciSil.setText("Sil");
        btnogrenciSil.setEnabled(false);
        btnogrenciSil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnogrenciSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnogrenciSilActionPerformed(evt);
            }
        });

        btnogrenciGuncelle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnogrenciGuncelle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Person-white-warning.png"))); // NOI18N
        btnogrenciGuncelle.setText("Güncelle");
        btnogrenciGuncelle.setEnabled(false);
        btnogrenciGuncelle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnogrenciGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnogrenciGuncelleActionPerformed(evt);
            }
        });

        btnogrenciKaydet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnogrenciKaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Person-white-add.png"))); // NOI18N
        btnogrenciKaydet.setText("Kaydet");
        btnogrenciKaydet.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnogrenciKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnogrenciKaydetActionPerformed(evt);
            }
        });

        btnogrenciTemizle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnogrenciTemizle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Refresh.png"))); // NOI18N
        btnogrenciTemizle.setText("Temizle");
        btnogrenciTemizle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnogrenciTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnogrenciTemizleActionPerformed(evt);
            }
        });

        btnogrenciyazdir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnogrenciyazdir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List.png"))); // NOI18N
        btnogrenciyazdir.setText("Yazdır");
        btnogrenciyazdir.setEnabled(false);
        btnogrenciyazdir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnogrenciyazdir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnogrenciyazdirActionPerformed(evt);
            }
        });

        btnyedekle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnyedekle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue_external_drive_backup.png"))); // NOI18N
        btnyedekle.setText("Yedekle");
        btnyedekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyedekleActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Paper-add.png"))); // NOI18N
        jButton2.setText("Aç");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnyedektendon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnyedektendon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backup_non_mainstream_2008_icon_32.png"))); // NOI18N
        btnyedektendon.setText("Yedekten Dön");
        btnyedektendon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyedektendonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOgrenciLayout = new javax.swing.GroupLayout(pnlOgrenci);
        pnlOgrenci.setLayout(pnlOgrenciLayout);
        pnlOgrenciLayout.setHorizontalGroup(
            pnlOgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOgrenciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOgrenciLayout.createSequentialGroup()
                        .addComponent(btnogrenciSil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnogrenciGuncelle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnogrenciKaydet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnogrenciTemizle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnogrenciyazdir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlOgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnyedekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnyedektendon, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE))
                    .addGroup(pnlOgrenciLayout.createSequentialGroup()
                        .addGroup(pnlOgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdSoyad)
                            .addComponent(Numara))
                        .addGap(19, 19, 19)
                        .addGroup(pnlOgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOgrenciNumarasi)
                            .addComponent(txtOgrenciAdiSoyadi))))
                .addContainerGap())
        );

        pnlOgrenciLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnogrenciGuncelle, btnogrenciKaydet, btnogrenciSil, btnogrenciTemizle});

        pnlOgrenciLayout.setVerticalGroup(
            pnlOgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOgrenciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdSoyad)
                    .addComponent(txtOgrenciAdiSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlOgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOgrenciNumarasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Numara))
                .addGroup(pnlOgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOgrenciLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(pnlOgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnogrenciSil, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnogrenciGuncelle)
                            .addComponent(btnogrenciKaydet)
                            .addComponent(btnogrenciTemizle)
                            .addComponent(btnogrenciyazdir)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlOgrenciLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnyedekle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnyedektendon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(txtSonEklenen5Kayit);

        btnDersSil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDersSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Speech-Bubble-x.png"))); // NOI18N
        btnDersSil.setText("Sil");
        btnDersSil.setEnabled(false);
        btnDersSil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDersSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDersSilActionPerformed(evt);
            }
        });

        btnDersGuncelle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDersGuncelle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Questions.png"))); // NOI18N
        btnDersGuncelle.setText("Güncelle");
        btnDersGuncelle.setEnabled(false);
        btnDersGuncelle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDersGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDersGuncelleActionPerformed(evt);
            }
        });

        btnDersEkle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDersEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Speech-Bubble-add.png"))); // NOI18N
        btnDersEkle.setText("Seçilen Dersler");
        btnDersEkle.setEnabled(false);
        btnDersEkle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDersEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDersEkleActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        jSplitPane1.setDividerLocation(300);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jSplitPane1.setLeftComponent(jScrollPane1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTable2.setSelectionBackground(new java.awt.Color(255, 204, 204));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable2KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jSplitPane1.setRightComponent(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSplitPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlOgrenci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlAramaYap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(258, 258, 258))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDersSil, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDersGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDersEkle)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlOgrenci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(pnlAramaYap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDersGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDersEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDersSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection baglanti = null;
    ResultSet resultSet = null;
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    CallableStatement callableStatement = null;

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        baglanti = oraclebaglantisi.Baglan();
        tabloyuGuncelle();
        sonEklenen5kayit();

    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        tabloDetayiniAl();
        tabloyaDersleriGetir();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        tabloDetayiniAl();
        tabloyaDersleriGetir();
    }//GEN-LAST:event_jTable1KeyReleased

    private void txtAramaYapOgrenciAdiSoyadiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAramaYapOgrenciAdiSoyadiKeyReleased
        aramaYap();
    }//GEN-LAST:event_txtAramaYapOgrenciAdiSoyadiKeyReleased

    private void btnogrenciKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnogrenciKaydetActionPerformed
        //  kaydetNormalYolla();
        //  kaydetNormalYolla2();
        kaydetProsedurle();
        //  kaydetProsedurle2();
    }//GEN-LAST:event_btnogrenciKaydetActionPerformed

    private void btnogrenciTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnogrenciTemizleActionPerformed
        formuTemizle();
    }//GEN-LAST:event_btnogrenciTemizleActionPerformed

    private void btnogrenciGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnogrenciGuncelleActionPerformed
        // guncelleNormalYolla2();
        guncelleProsedurle2();
    }//GEN-LAST:event_btnogrenciGuncelleActionPerformed

    private void btnogrenciSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnogrenciSilActionPerformed
        // silNormalYolla2();
        silProsedurle();
    }//GEN-LAST:event_btnogrenciSilActionPerformed

    private void btnogrenciyazdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnogrenciyazdirActionPerformed
        try {

            String OGRENCIADISOYADI = txtAramaYapOgrenciAdiSoyadi.getText() + "%";
            String OGRENCINUMARASI = txtAramaYapOgrenciNumarasi.getText() + "%";

            String raporSorgusu = "SELECT  * FROM OGRENCI "
                    + "WHERE OGRENCIADISOYADI LIKE '" + OGRENCIADISOYADI + "' AND  OGRENCINUMARASI LIKE '" + OGRENCINUMARASI + "' ";

            JasperDesign jasperDesign = JRXmlLoader.load("RaporDeneme.jrxml");

            JRDesignQuery designQuery = new JRDesignQuery();
            designQuery.setText(raporSorgusu);
            jasperDesign.setQuery(designQuery);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, baglanti);
            JasperViewer.viewReport(jasperPrint, true);
        } catch (Exception e) {
  
        }

    }//GEN-LAST:event_btnogrenciyazdirActionPerformed

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

        if (statement != null) {
            try {
                statement.close();
            } catch (Exception e) {
            }
        }

        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (Exception e) {
            }
        }

        if (callableStatement != null) {
            try {
                callableStatement.close();
            } catch (Exception e) {
            }
        }


    }//GEN-LAST:event_formWindowClosing

private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
    detayDugmeleriniAktiflestir();
}//GEN-LAST:event_jTable2MouseClicked

private void jTable2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyReleased
    detayDugmeleriniAktiflestir();
}//GEN-LAST:event_jTable2KeyReleased

private void btnDersSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDersSilActionPerformed
    dersSilMetodu();

}//GEN-LAST:event_btnDersSilActionPerformed

private void btnDersGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDersGuncelleActionPerformed
    int satirNumarasi = jTable2.getSelectedRow();
//JOptionPane.showMessageDialog(rootPane, jTable2.getModel().getValueAt(satirNumarasi, 0).toString());

    DersDuzenleGUI ders = new DersDuzenleGUI();
    ders.txtOgrenciID.setText(jTable2.getModel().getValueAt(satirNumarasi, 0).toString());
    ders.setVisible(true);
}//GEN-LAST:event_btnDersGuncelleActionPerformed

    private void btnDersEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDersEkleActionPerformed

        int satirNumarasi = jTable1.getSelectedRow();
        //JOptionPane.showMessageDialog(rootPane, jTable1.getModel().getValueAt(satirNumarasi, 0).toString());

        DersSecimGUI secim = new DersSecimGUI();
        secim.txtOgrenciID.setText(jTable1.getModel().getValueAt(satirNumarasi, 0).toString());
        secim.setVisible(false);
        secim.setEnabled(false);

    }//GEN-LAST:event_btnDersEkleActionPerformed

    private void btnyedekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyedekleActionPerformed

         try {
                
       
        
        
        
    String sql=  "declare"+
  "h1   number;"+     
  "begin "+
    "  h1 := dbms_datapump.open (operation => 'EXPORT', job_mode => 'SCHEMA', job_name => 'scott1', version => 'COMPATIBLE');" +
    " dbms_datapump.set_parallel(handle => h1, degree => 1); "+
    " dbms_datapump.add_file(handle => h1, filename => 'EXPDAT.LOG', directory => 'DATA_PUMP_DIR', filetype => 3); "+
    " dbms_datapump.set_parameter(handle => h1, name => 'KEEP_MASTER', value => 0); "+
    " dbms_datapump.metadata_filter(handle => h1, name => 'SCHEMA_EXPR', value => 'IN(''SCOTT'')'); "+
    " dbms_datapump.set_parameter(handle => h1, name => 'ESTIMATE', value => 'BLOCKS'); "+
    " dbms_datapump.add_file(handle => h1, filename => 'EXPDAT%U' || to_char(sysdate, 'dd-mm-yyyy') || '.DMP', directory => 'DATA_PUMP_DIR', filetype => 1); "+
    " dbms_datapump.set_parameter(handle => h1, name => 'INCLUDE_METADATA', value => 1); "+
    " dbms_datapump.set_parameter(handle => h1, name => 'DATA_ACCESS_METHOD', value => 'AUTOMATIC'); "+
    " dbms_datapump.start_job(handle => h1, skip_current => 0, abort_step => 0);"+

"END;";

 
         Statement stmt = baglanti.prepareStatement(sql);
         stmt.execute(sql);
        } 
         
         catch (Exception e) {
                JOptionPane.showMessageDialog(null, "HATA2 :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_btnyedekleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  ImportXlsDokuman a=new ImportXlsDokuman();
         a.setVisible(true);
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnyedektendonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyedektendonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnyedektendonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {      //Nimbus
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(YoneticiFormuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YoneticiFormuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YoneticiFormuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YoneticiFormuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new YoneticiFormuGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdSoyad;
    private javax.swing.JLabel Numara;
    private javax.swing.JButton btnDersEkle;
    private javax.swing.JButton btnDersGuncelle;
    private javax.swing.JButton btnDersSil;
    private javax.swing.ButtonGroup btnGrupEhliyet;
    private javax.swing.JButton btnogrenciGuncelle;
    private javax.swing.JButton btnogrenciKaydet;
    private javax.swing.JButton btnogrenciSil;
    private javax.swing.JButton btnogrenciTemizle;
    private javax.swing.JButton btnogrenciyazdir;
    private javax.swing.JButton btnyedekle;
    private javax.swing.JButton btnyedektendon;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblAramaYapMesaj;
    private javax.swing.JLabel lblAramaYapOgrenciAdiSoyadi;
    private javax.swing.JLabel lblAramaYapOgrencinumarasi;
    private javax.swing.JPanel pnlAramaYap;
    private javax.swing.JPanel pnlOgrenci;
    private javax.swing.JTextField txtAramaYapOgrenciAdiSoyadi;
    private javax.swing.JTextField txtAramaYapOgrenciNumarasi;
    private javax.swing.JTextField txtOgrenciAdiSoyadi;
    private javax.swing.JTextField txtOgrenciNumarasi;
    private javax.swing.JTextPane txtSonEklenen5Kayit;
    // End of variables declaration//GEN-END:variables

    private void tabloyuGuncelle() {

        try {
            String tabloyuGuncelleSorgusu = "SELECT OGRENCIID, OGRENCIADISOYADI,OGRENCINUMARASI FROM OGRENCI "
                    + " ORDER BY OGRENCIID DESC";
            preparedStatement = baglanti.prepareStatement(tabloyuGuncelleSorgusu);
            resultSet = preparedStatement.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
        }

    }

    private void tabloDetayiniAl() {
        int satirNumarasi = jTable1.getSelectedRow();
        //KOLON SÜTUN
        txtOgrenciAdiSoyadi.setText(jTable1.getModel().getValueAt(satirNumarasi, 1).toString());
        txtOgrenciNumarasi.setText(jTable1.getModel().getValueAt(satirNumarasi, 2).toString());

        btnogrenciSil.setEnabled(true);
        btnogrenciGuncelle.setEnabled(true);
        btnDersEkle.setEnabled(true);
        btnogrenciyazdir.setEnabled(true);

    }

    private void aramaYap() {
        try {
            formuTemizle();
            //OGRENCI_ARA
            String aramaSorgusu = "SELECT  * FROM OGRENCI "
                    + "WHERE  OGRENCIADISOYADI LIKE ? AND   OGRENCINUMARASI LIKE ?";
            preparedStatement = baglanti.prepareStatement(aramaSorgusu);
            preparedStatement.setString(1, txtAramaYapOgrenciAdiSoyadi.getText() + "%");
            preparedStatement.setString(2, txtAramaYapOgrenciNumarasi.getText() + "%");

            resultSet = preparedStatement.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(resultSet));

            if (jTable1.getRowCount() > 0) {
                lblAramaYapMesaj.setText("Kayıtlar gösteriliyor.");
            } else {
                lblAramaYapMesaj.setText("Aranılan kayıt bulunamadı.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA2 :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void sonEklenen5kayit() {
        txtSonEklenen5Kayit.setText(null);
        try {

            preparedStatement = baglanti.prepareStatement("SELECT * FROM SON_EKLENEN_BES_KAYIT_VIEW");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                txtSonEklenen5Kayit.replaceSelection(resultSet.getInt("OGRENCIID")
                        + " " + resultSet.getString("OGRENCIADISOYADI")
                        + " " + resultSet.getString("OGRENCINUMARASI") + "\n");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA3 :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);

        }

    }

    private void kaydetNormalYolla() {
        try {

            String eklemeSorgusu
                    = "INSERT INTO OGRENCI (OGRENCIADISOYADI,OGRENCINUMARASI)"
                    + "VALUES('" + txtOgrenciAdiSoyadi.getText() + "',"
                    + "'" + txtOgrenciNumarasi.getText() + "')";

            preparedStatement = baglanti.prepareStatement(eklemeSorgusu);

            preparedStatement.execute();

            tabloyuGuncelle();
            sonEklenen5kayit();
            formuTemizle();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA4 :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);

        }

    }

    private void kaydetNormalYolla2() {
        try {
            String eklemeSorgusu = "INSERT INTO OGRENCI (OGRENCIADISOYADI,OGRENCINUMARASI)"
                    + "VALUES(?, ?)";
            preparedStatement = baglanti.prepareStatement(eklemeSorgusu);

            preparedStatement.setString(1, txtOgrenciAdiSoyadi.getText());
            preparedStatement.setString(2, txtOgrenciNumarasi.getText());

            preparedStatement.execute();

            tabloyuGuncelle();
            sonEklenen5kayit();
            formuTemizle();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA5 :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);

        }

    }

    private void formuTemizle() {
        txtOgrenciAdiSoyadi.setText(null);
        txtOgrenciNumarasi.setText(null);

    }

    private void kaydetProsedurle() {

        try {

            String eklemeSorgusu
                    = "{CALL OGRENCI_EKLE_PROCEDURE('" + txtOgrenciAdiSoyadi.getText() + "',"
                    + "'" + txtOgrenciNumarasi.getText() + "')}";

            callableStatement = baglanti.prepareCall(eklemeSorgusu);

            callableStatement.execute();

            tabloyuGuncelle();
            sonEklenen5kayit();
            formuTemizle();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA6 :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);

        }

    }

    private void kaydetProsedurle2() {

        try {

            String eklemeSorgusu = "{call OGRENCI_EKLE_PROCEDURE(?, ?)}";
            callableStatement = baglanti.prepareCall(eklemeSorgusu);
            callableStatement.setString(1, txtOgrenciAdiSoyadi.getText());
            callableStatement.setString(2, txtOgrenciNumarasi.getText());
            callableStatement.execute();

            tabloyuGuncelle();
            sonEklenen5kayit();
            formuTemizle();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA7 :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);

        }

    }

    private void guncelleNormalYolla2() {

        try {

            String guncellemeSorgusu = "UPDATE OGRENCI SET "
                    + " OGRENCIADISOYADI = ?, "
                    + " OGRENCINUMARASI = ? "
                    + " WHERE OGRENCIID = ? ";

            preparedStatement = baglanti.prepareStatement(guncellemeSorgusu);

            preparedStatement.setString(1, txtOgrenciAdiSoyadi.getText());
            preparedStatement.setString(2, txtOgrenciNumarasi.getText());

            int satirNumarasi = jTable1.getSelectedRow();
            //tablodaki o andaki sırası    //ilk kolon sütun
            preparedStatement.setString(3, jTable1.getModel().getValueAt(satirNumarasi, 0).toString());

            //GÜNCELLEMEYE ÖZEL
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Gücellenme işlemi\nbaşarılı olarak gerçekleştirildi.", "MESAJ",
                    JOptionPane.INFORMATION_MESSAGE);

            tabloyuGuncelle();
            sonEklenen5kayit();
            formuTemizle();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA7 MEYDA GELDİ\nLütfen bir kişi seçiniz.", "MESAJ", JOptionPane.ERROR_MESSAGE);

        }

    }

    private void guncelleProsedurle2() {
        try {

            String guncellemeSorgusu = "{CALL OGRENCI_GUNCELLE_PROCEDURE(?, ?, ?)}";

            callableStatement = baglanti.prepareCall(guncellemeSorgusu);

            callableStatement.setString(1, txtOgrenciAdiSoyadi.getText());
            callableStatement.setString(2, txtOgrenciNumarasi.getText());
            int satirNumarasi = jTable1.getSelectedRow();
            //tablodaki o andaki sırası                  //ilk kolon sütun
            callableStatement.setInt(3, Integer.parseInt(jTable1.getModel().getValueAt(satirNumarasi, 0).toString()));

        
            callableStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Gücellenme işlemi\nbaşarılı olarak gerçekleştirildi.", "MESAJ",
                    JOptionPane.INFORMATION_MESSAGE);

            tabloyuGuncelle();
            sonEklenen5kayit();
            formuTemizle();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA8 :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);

        }

    }

    private void silNormalYolla2() {

//        int gelenDeger = JOptionPane.showConfirmDialog(rootPane, "Emin misiniz?", "UYARI MESAJI", 
//               JOptionPane.WARNING_MESSAGE);
//      
//       if(gelenDeger == JOptionPane.YES_OPTION){
//       
//       }else if(gelenDeger == JOptionPane.NO_OPTION){
//       
//       }
        Object[] dugmeIsimleri = {" Evet Sil ",
            "Hayır Vazgeç"};
        int gelenDeger = JOptionPane.showOptionDialog(rootPane, "Emin misiniz?", "UYARI MESAJI",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                (new javax.swing.ImageIcon(getClass().getResource("/images/X.png"))),
                dugmeIsimleri,
                dugmeIsimleri[1]);

        if (gelenDeger == 0) {

            try {

                String silmeSorgusu = "DELETE FROM OGRENCI WHERE OGRENCIID = ?";

                preparedStatement = baglanti.prepareStatement(silmeSorgusu);

                int satirNumarasi = jTable1.getSelectedRow();
                //tablodaki o andaki sırası    //ilk kolon sütun
                preparedStatement.setString(1, jTable1.getModel().getValueAt(satirNumarasi, 0).toString());

                preparedStatement.execute();

                JOptionPane.showMessageDialog(null, "Silme işlemi\nbaşarılı olarak gerçekleştirildi.", "MESAJ",
                        JOptionPane.INFORMATION_MESSAGE);

                tabloyuGuncelle();
                sonEklenen5kayit();
                formuTemizle();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "HATA9 :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);

            }

        } else if (gelenDeger == 1) {

        }

    }

    private void tabloyaDersleriGetir() {
        try {
            String siparis_sorgusu = "SELECT * FROM DERS WHERE OGRENCIID = ?";
            int satirNumarasi = jTable1.getSelectedRow();
            preparedStatement = baglanti.prepareStatement(siparis_sorgusu);
            preparedStatement.setString(1, jTable1.getModel().getValueAt(satirNumarasi, 0).toString());
            resultSet = preparedStatement.executeQuery();

            jTable2.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA10 :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void detayDugmeleriniAktiflestir() {
        btnDersGuncelle.setEnabled(true);
        btnDersSil.setEnabled(true);

    }

    private void dersSilMetodu() {

        Object[] dugmeIsimleri = {" Evet Sil ",
            "Hayır Vazgeç"};
        int gelenDeger = JOptionPane.showOptionDialog(rootPane, "Emin misiniz?", "UYARI MESAJI",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                (new javax.swing.ImageIcon(getClass().getResource("/images/X.png"))),
                dugmeIsimleri,
                dugmeIsimleri[1]);

        if (gelenDeger == 0) {

            try {
                String silmeSorgusu = "DELETE FROM DERS WHERE DERSID = ?";

                preparedStatement = baglanti.prepareStatement(silmeSorgusu);

                int satirNumarasi = jTable2.getSelectedRow();
                //tablodaki o andaki sırası    //ilk kolon sütun
                preparedStatement.setString(1, jTable2.getModel().getValueAt(satirNumarasi, 0).toString());

                preparedStatement.execute();

                String eklemeSorgusu
                        = "INSERT INTO SILINMISKAYITLAR (DERSID,DERSALMATARIHI,ZORUNLUDERS1,ZORUNLUDERS2,ZORUNLUDERS3,ZORUNLUDERS4,SECMELIDERS1,TOPLAMKREDI,OGRENCIID)"
                        + "VALUES('" + jTable2.getModel().getValueAt(satirNumarasi, 0).toString() + "',"
                        + "'" + jTable2.getModel().getValueAt(satirNumarasi, 1).toString() + "',"
                       + "'" + jTable2.getModel().getValueAt(satirNumarasi, 2).toString() + "',"
                        + "'" + jTable2.getModel().getValueAt(satirNumarasi, 3).toString() + "',"
                        + "'" + jTable2.getModel().getValueAt(satirNumarasi, 4).toString() + "',"
                        + "'" + jTable2.getModel().getValueAt(satirNumarasi, 5).toString() + "',"
                        + "'" + jTable2.getModel().getValueAt(satirNumarasi, 6).toString() + "',"
                        + "'" + jTable2.getModel().getValueAt(satirNumarasi, 7).toString() + "',"
                        + "'" + jTable2.getModel().getValueAt(satirNumarasi, 8).toString() + "')";

                preparedStatement = baglanti.prepareStatement(eklemeSorgusu);

                preparedStatement.execute();

                JOptionPane.showMessageDialog(null, "Silme işlemi başarılı olarak gerçekleştirildi.\n Silinmiş Kayıtlar Tablosuna Eklendi", "MESAJ",
                        JOptionPane.INFORMATION_MESSAGE);

                tabloyuGuncelle();

                sonEklenen5kayit();
                formuTemizle();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "HATA11 :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);

            }

        } else if (gelenDeger == 1) {

        }

    }

    private void silProsedurle() {

        Object[] dugmeIsimleri = {" Evet Sil ",
            "Hayır Vazgeç"};
        int gelenDeger = JOptionPane.showOptionDialog(rootPane, "Emin misiniz?", "UYARI MESAJI",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                (new javax.swing.ImageIcon(getClass().getResource("/images/X.png"))),
                dugmeIsimleri,
                dugmeIsimleri[1]);

        if (gelenDeger == 0) {

            try {
                

                String silmeSorgusu = "{CALL OGRENCI_SIL_PROCEDURE(?)}";

                callableStatement = baglanti.prepareCall(silmeSorgusu);

                int satirNumarasi = jTable1.getSelectedRow();
                //tablodaki o andaki sırası    //ilk kolon sütun
                callableStatement.setString(1, jTable1.getModel().getValueAt(satirNumarasi, 0).toString());

                callableStatement.execute();

                JOptionPane.showMessageDialog(null, "Silme işlemi\nbaşarılı olarak gerçekleştirildi.", "MESAJ",
                        JOptionPane.INFORMATION_MESSAGE);

                tabloyuGuncelle();
                sonEklenen5kayit();
                formuTemizle();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "HATA12 :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);

            }

        } else if (gelenDeger == 1) {

        }

    }
}
