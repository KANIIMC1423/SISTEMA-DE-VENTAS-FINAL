package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        con = null;
        try {
            //String access = "jdbc:ucanaccess://D:/ventas.accdb";
            String myBD = "jdbc:mysql://localhost:3306/sistemaventas";
            con = DriverManager.getConnection(myBD, "root", "");
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return con;
        //return null;
    }

}
