/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masb_ws;

import com.google.gson.Gson;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import masb_classesBO.Masb_JogadoresBO;
import masb_objetos.Masb_Jogadores;

/**
 * REST Web Service
 *
 * @author Maria
 */
@Path("masb_Jogadores")
public class Masb_JogadoresResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Masb_JogadoresResource
     */
    public Masb_JogadoresResource() {
    }

    /**
     * Retrieves representation of an instance of masb_ws.Masb_JogadoresResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Masb_Jogadores> getJson() {
       return new Masb_JogadoresBO().getJogadores();
    }

    /**
     * PUT method for updating or creating an instance of Masb_JogadoresResource
     * @param content representation for the resource
     */
     @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) 
    {
        Gson g = new Gson();
        
        Masb_Jogadores masb_jogadores = g.fromJson(content, Masb_Jogadores.class);
        
        new Masb_JogadoresBO().salvarMasb_Jogadores(masb_jogadores);
    }
}
