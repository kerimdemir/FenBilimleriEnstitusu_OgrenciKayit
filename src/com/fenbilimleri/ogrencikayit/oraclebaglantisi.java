package com.fenbilimleri.ogrencikayit;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class oraclebaglantisi {
private static Connection baglanti = null;

    public static Connection Baglan() {
        try {      // jdbc:oracle:thin:@localhost:1521:XE
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
        String surucu = "oracle.jdbc.OracleDriver";
        String kullaniciAdi = "HR";
        String kullaniciParolasi = "12";

 Class.forName(surucu);
 baglanti = DriverManager.getConnection(url , kullaniciAdi, kullaniciParolasi);
                                                                        

//           JOptionPane.showMessageDialog(null, "BAŞARILI BAĞLANTI KURULDU", "MESAJ",
//                JOptionPane.INFORMATION_MESSAGE);
            
            return baglanti;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
