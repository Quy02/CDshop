/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cdshop;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author quy
 */
public class MyConnection {
    public Connection getConnection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url ="jdbc:sqlserver://localhost:1433;Database=CDshop;user=quy;password=12345";
            Connection con = DriverManager.getConnection(url);
            return con;
                    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString(),"Loi",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
}
