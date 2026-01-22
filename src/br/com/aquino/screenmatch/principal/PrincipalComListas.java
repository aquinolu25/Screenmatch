package br.com.aquino.screenmatch.principal;

import br.com.aquino.screenmatch.modelos.Filme;
import br.com.aquino.screenmatch.modelos.Serie;
import br.com.aquino.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {

    public static void main(String[] args) {

        Filme meuFilme = new Filme("Sinners", 2025);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoLuiz = new Filme("Hamlet", 2025);
        filmeDoLuiz.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoLuiz);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

    }
}
