package com.fenbilimleri.ogrencikayit;

import java.sql.*;

public class _003_JDBC_ile_Oracle_Baglantisi_CallableStatement {

     public static void main(String[] args) {
        //1.ADIM DEĞİŞKENLERİMİZİ TANIMLAYALIM
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
        String kullaniciAdi = "HR";
        String kullaniciParolasi = "12";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        CallableStatement cstmt = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection(url, kullaniciAdi, kullaniciParolasi);

            cstmt = con.prepareCall("{CALL OGRENCI_GUNCELLE_PROCEDURE(?,?,?)}");

            cstmt.setString(1, "Sead MUSTAFA");
            cstmt.setString(2, "120100010040");
            cstmt.setInt(3, 11);


            int islemBilgisi = cstmt.executeUpdate();
            if (islemBilgisi != 0) {
                System.out.println("BAŞARILI " + islemBilgisi + " İŞLEM GERÇEKLEŞTİRİLDİ. OGRENCI_GUNCELLE_PROCEDURE");
            } else {

                System.err.println("İŞLEM BAŞARISIZ.");
            }

            
            
            
            
          CallableStatement cstmt2 = con.prepareCall("{CALL OGRENCI_EKLE_PROCEDURE(?,?)}");

            cstmt2.setString(1, "Ali Veli");
            cstmt2.setString(2, "120100010001");
           // cstmt2.setInt(3, 11);


            int islemBilgisi2 = cstmt2.executeUpdate();
            if (islemBilgisi2 != 0) {
                System.out.println("BAŞARILI " + islemBilgisi2 + " İŞLEM GERÇEKLEŞTİRİLDİ. OGRENCI_EKLE_PROCEDURE");
            } else {

                System.err.println("İŞLEM BAŞARISIZ.");
            }
            
            
            
            
            
            CallableStatement cstmt3 = con.prepareCall("{CALL OGRENCI_SIL_PROCEDURE(?)}");

            cstmt3.setInt(1, 15);


            int islemBilgisi3 = cstmt3.executeUpdate();
            if (islemBilgisi3 != 0) {
                System.out.println("BAŞARILI " + islemBilgisi3 + " İŞLEM GERÇEKLEŞTİRİLDİ. OGRENCI_SIL_PROCEDURE");
            } else {

                System.err.println("İŞLEM BAŞARISIZ.");
            }     
            



            String SQL_ARA = "SELECT * FROM OGRENCI ORDER BY 1";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL_ARA);

            boolean kayitlar = rs.next();

            if (!kayitlar) {
                System.out.println("KAYIT YOK");
                return;
            } else {
                do {
                    String OGRENCIADISOYADI = null;
                    OGRENCIADISOYADI = rs.getString("OGRENCIADISOYADI");

                    System.out.println(rs.getString(1) + " " + OGRENCIADISOYADI + " " + rs.getString("OGRENCINUMARASI"));

                } while (rs.next());

            }







        } catch (Exception e) {
            System.out.println("HATA : " + e);
        } finally {

            if (rs != null) {

                try {
                    rs.close();
                } catch (Exception e) {
                }

            }




            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception e) {
                }
            }




            if (con != null) {
                try {
                    con.close();
                } catch (Exception e) {
                }
            }

        }


    }
}
