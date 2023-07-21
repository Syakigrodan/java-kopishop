/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kopi;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class koneksi {
    Connection koneksi;
    
    public static Connection Koneksi() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/coffe", "root","");
            return koneksi;
    } catch (Exception e){
        JOptionPane.showMessageDialog( null, e);
        return null;
    }
}
}
