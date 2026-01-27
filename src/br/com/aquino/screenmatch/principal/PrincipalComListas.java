package br.com.aquino.screenmatch.principal;

import br.com.aquino.screenmatch.modelos.Filme;
import br.com.aquino.screenmatch.modelos.Serie;
import br.com.aquino.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {

    public static void main(String[] args) {

        Filme meuFilme = new Filme("Sinners", 2025);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoLuiz = new Filme("Hamlet", 2025);
        filmeDoLuiz.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new LinkedList<>();
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

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Paul Mescal");
        buscaPorArtista.add("Olivia Dean");
        buscaPorArtista.add("Connor Storie");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);

    }
}
