package com.fenbilimleri.ogrencikayit;
import java.sql.*;
public class _001_JDBC_ile_Oracle_Baglantisi_Statement {

    public static void main(String[] args) {
        //1.ADIM DEĞİŞKENLERİMİZİ TANIMLAYALIM
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
        String surucu = "oracle.jdbc.OracleDriver";
        String kullaniciAdi = "HR";
        String kullaniciParolasi = "12";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName(surucu);
            con = DriverManager.getConnection(url , kullaniciAdi, kullaniciParolasi);

         //veritabani export işlemi
          
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
"exception"+
  "when others then"+
    "  raise_application_error(-20001,'An error was encountered - '||SQLCODE||' -ERROR- '||SQLERRM); "+
"END;";
Statement stmtm = con.createStatement();
stmtm.execute(sql);
            
String SQL_EKLE = "INSERT INTO OGRENCI (OGRENCIADISOYADI,OGRENCINUMARASI) "
                  + "VALUES ('Kerim','Demir')";           
            
  Statement statementEkle = con.createStatement();
  int eklenmeBilgisi = statementEkle.executeUpdate(SQL_EKLE);
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
