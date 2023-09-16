/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.model.repositorios;

import br.edu.ifpe.recife.model.negocio.Alerta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Well
 */
public class RepositorioAlertar {

    private static List<Alerta> alerta = null;

    static {
        alerta = new ArrayList<>();
    }

    public static void alertUpdadte(Alerta u) {

        for (Alerta uAux : alerta) {
            if (uAux.getCodigo() == u.getCodigo()) {
                uAux.setDataCriacao(u.getDataCriacao());
                uAux.setRelatoCriacao(u.getRelatoCriacao());
                uAux.setAutor(u.getAutor());
                uAux.setDoguinho(u.getDoguinho());
                uAux.setDataAcolhimento(u.getDataAcolhimento());
                uAux.setRelatoAcolhimento(u.getRelatoAcolhimento());
                uAux.setIntervencoesFeitas(u.getIntervencoesFeitas());
                uAux.setAcolhedor(u.getAcolhedor());
            }
        }
    }

    public static void deletar(Alerta u) {
        alerta.remove(u);
    }

    public static List<Alerta> readAll() {
        return alerta;
    }
}
