/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masb_classesDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import masb_objetos.Masb_Jogadores;
import masb_utilitarios.Masb_Conexao;

/**
 *
 * @author Maria
 */
public class Masb_JogadoresDAO {
    
    Connection conn;

    public Masb_JogadoresDAO() 
    {
        conn = new Masb_Conexao().conectar();
    }

    
    public void salvarMasb_Jogadores(Masb_Jogadores masb_jogadores)
    {
        try
        {
            PreparedStatement ppStmt = conn.prepareStatement("INSERT INTO masb_jogador(nome, data_nascimento, sexo, altura, peso, imc, classificacao) values(?,?,?,?,?,?,?)");
            ppStmt.setString(1, masb_jogadores.getMasb_nome());
            ppStmt.setString(2, masb_jogadores.getMasb_dataNascimento());
            ppStmt.setString(3, masb_jogadores.getMasb_sexo());
            ppStmt.setDouble(4, masb_jogadores.getMasb_altura());
            ppStmt.setDouble(5, masb_jogadores.getMasb_peso());
            ppStmt.setDouble(6, masb_jogadores.getMasb_imc());
            ppStmt.setString(7, masb_jogadores.getMasb_classificacao());
            
            ppStmt.execute();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
    
    public List<Masb_Jogadores> getMasb_Jogadores()
    {
        List<Masb_Jogadores> masb_jogadores = new LinkedList<>();
        
        try
        {
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM masb_jogador");
            ResultSet rs = ppStmt.executeQuery();
            while(rs.next())
            {
                masb_jogadores.add(getMasb_Jogador(rs));
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return masb_jogadores;
    }
    
    private Masb_Jogadores getMasb_Jogador(ResultSet rs) throws SQLException
    {
        Masb_Jogadores masb_jogadores = new Masb_Jogadores();
        
        masb_jogadores.setMasb_nome(rs.getString("nome"));
        masb_jogadores.setMasb_dataNascimento(rs.getString("data_nascimento"));
        masb_jogadores.setMasb_sexo(rs.getString("sexo"));
        masb_jogadores.setMasb_altura(rs.getDouble("altura"));
        masb_jogadores.setMasb_peso(rs.getDouble("peso"));
        masb_jogadores.setMasb_imc(rs.getDouble("imc"));
        masb_jogadores.setMasb_classificacao(rs.getString("classificacao"));
        
        return masb_jogadores;
    }
}
