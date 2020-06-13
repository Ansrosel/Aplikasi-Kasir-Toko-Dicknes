
import java.sql.*;
import  javax.swing.*;


public class koneksi {
Connection koneksi = null;

   public static Connection koneksi_DB(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/kasir","root","");
           return koneksi;
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
       }
   }
 public static void main(String[] args) {
      
    }

}

