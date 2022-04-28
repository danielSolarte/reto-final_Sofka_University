/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class ConexionSQL {
    
    Connection conn = null;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reto_sofka","root","");
            System.out.println("Conexion exitosa");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error de conexion " + e.getMessage());
        }
        return conn;
    }
    
}
