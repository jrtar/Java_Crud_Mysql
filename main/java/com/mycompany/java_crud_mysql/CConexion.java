/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java_crud_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class CConexion {
    
    
    Connection conectar = null;
    
    String usuario = "root";
    String contrasenia = "sultana";
    String bd = "bdescuela";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
        
      try {
          
          Class.forName("com.mysql.cj.jdbc.Driver");
          conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
          //JOptionPane.showMessageDialog(null,"La conexión se a realizado con éxito");
          
      }  catch (Exception e) {
          JOptionPane.showConfirmDialog(null,"Error al conectarse a la base de datos, error: "+ e.toString());
      }
      return conectar;
    } 
}
