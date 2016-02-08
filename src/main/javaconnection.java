package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates

* and open the template in the editor.
 */

/**
 *
 * @author Xeeshan
 */
import java.sql.*;
import javax.swing.*;

public class javaconnection {
    
    
    Connection conn =null;
    public static Connection ConncerDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Xeeshan\\Documents\\NetBeansProjects\\project123\\project123.sqlite");
           JOptionPane.showMessageDialog(null, "Connection established");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }



    
}
