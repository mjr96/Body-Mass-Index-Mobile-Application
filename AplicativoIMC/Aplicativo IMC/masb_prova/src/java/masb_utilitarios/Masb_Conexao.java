/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masb_utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Maria
 */
public class Masb_Conexao {
 
     final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost/masb_jogador";
    final private String usuario = "root";
    final private String senha = "";
    
    public Connection conectar()
    {
        Connection conn = null;
        
        try
        {
           Class.forName(driver);
           conn = DriverManager.getConnection(url, usuario, senha);
        }
        catch(ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return conn;
    }
}
