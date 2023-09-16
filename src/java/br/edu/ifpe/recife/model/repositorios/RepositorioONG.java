/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.model.repositorios;

import br.edu.ifpe.recife.model.negocio.Ong;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Well
 */
public class RepositorioONG {

    private static List<Ong> ong = null;

    static {
        ong = new ArrayList<>();
    }

    public static void Update(Ong u) {
        for (Ong uAux : ong) {
            if (uAux.getCodigo() == u.getCodigo()) {
                uAux.setCnpj(u.getCnpj());
                uAux.setSenha(u.getSenha());
                uAux.setNome(u.getNome());
                uAux.setEndereco(u.getEndereco());
                uAux.setEmail(u.getEmail());
                uAux.setTelefone(u.getTelefone());
                uAux.setEspecialidade(u.getEspecialidade());
            }
        }
    }

    public static void deletar(Ong u) {
        ong.remove(u);
    }

    public static Ong reader(int u) {
        for (Ong uAux : ong) {
            if (uAux.getCodigo() == u) {
                return uAux;
            }
        }
        return null;
    }

    public static List<Ong> readAll() {
        return ong;
    }
}
