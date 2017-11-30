package com.fenbilimleri.ogrencikayit;

import java.sql.*;

public class _002_JDBC_ile_Oracle_Baglantisi_PreparedStatement {

    public static void main(String[] args) {
        //1.ADIM DEĞİŞKENLERİMİZİ TANIMLAYALIM
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
        String kullaniciAdi = "HR";
        String kullaniciParolasi = "12";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        try {
 Class.forName("oracle.jdbc.OracleDriver");
 con = DriverManager.getConnection(url , kullaniciAdi, kullaniciParolasi);


      
//1.YOL
String SQL_EKLE = "INSERT INTO OGRENCI (OGRENCIADISOYADI,OGRENCINUMARASI) "
                  + "VALUES (?,?)";           
            
   pstmt = con.prepareStatement(SQL_EKLE);
   
   pstmt.setString(1,"Kerim DEMIR");
   pstmt.setString(2,"380930666334");
   
  int eklenmeBilgisi = pstmt.executeUpdate();
  if(eklenmeBilgisi != 0){
     System.out.println("BAŞARILI "+eklenmeBilgisi +" KAYIT EKLENDİ.");
  }else{
      
      System.err.println("KAYIT EDİLEMEDİ");
  }
            
     
            
            
          
            
String SQL_ARA ="SELECT * FROM OGRENCI ORDER BY 1";
            stmt = con.createStatement();  
            rs = stmt.executeQuery(SQL_ARA);
       
            boolean kayitlar = rs.next();

            if(!kayitlar){
                System.out.println("KAYIT YOK");
                return;
            }else{
                    do {  
                        String OGRENCIADISOYADI = null ;
                        OGRENCIADISOYADI =rs.getString("OGRENCIADISOYADI"); 
                        
System.out.println(rs.getString(1)+" "+ OGRENCIADISOYADI + " " + rs.getString("OGRENCINUMARASI"));
                    
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
