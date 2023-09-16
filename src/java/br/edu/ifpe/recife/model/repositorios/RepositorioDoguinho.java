/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.model.repositorios;

import br.edu.ifpe.recife.model.negocio.Doguinho;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Well
 */
public class RepositorioDoguinho {
    public static List<Doguinho> doguinho = null;
    
    static{
    doguinho = new ArrayList<>();
    }
    
    public static void update(Doguinho u){
        for(Doguinho uAux : doguinho){
            if(uAux.getCodigo() == u.getCodigo()){
                uAux.setCor(u.getCor());
                uAux.setPorte(u.getPorte());
                uAux.setRaca(u.getRaca());
                uAux.setObservacao(u.getObservacao()); 
                uAux.setSexo(u.getSexo());
                uAux.setIdadeAparente(u.getIdadeAparente());
                uAux.setDeficienciaAparente(u.getDeficienciaAparente());
                
            }
        }
    }
    public static Doguinho read(int codigo){
        for(Doguinho uAux : doguinho){
            if(uAux.getCodigo()== codigo){
                return uAux;
            }
        }
        return null;
    }
        
    public static void dele( Doguinho u){
               doguinho.remove(u);
    }
    
    public static List<Doguinho> readAll(){
        return doguinho;
    }
}
