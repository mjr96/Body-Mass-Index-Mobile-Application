/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masb_classesBO;

import java.util.List;
import masb_classesDAO.Masb_JogadoresDAO;
import masb_objetos.Masb_Jogadores;

/**
 *
 * @author Maria
 */
public class Masb_JogadoresBO {
 
    Masb_JogadoresDAO masb_jogadoresDAO;
    
    public Masb_JogadoresBO(){
        masb_jogadoresDAO = new Masb_JogadoresDAO();
    }
    public void salvarMasb_Jogadores(Masb_Jogadores masb_jogadores)
    {
        masb_jogadoresDAO.salvarMasb_Jogadores(masb_jogadores);
    }
    
    public List<Masb_Jogadores> getJogadores()
    {
        return masb_jogadoresDAO.getMasb_Jogadores();
    }    
}
