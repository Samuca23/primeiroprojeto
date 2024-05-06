package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.lang.reflect.Array;
import java.util.*;

public class PrincipalComListas {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Serie lost = new Serie("Lost", 2000);
        Filme outroFilme = new Filme("Avatar", 2023);
        var filmeDoPaulo = new Filme("Dogville", 2003);

        List<Titulo> list = new LinkedList<>();
        list.add(filmeDoPaulo);
        list.add(meuFilme);
        list.add(outroFilme);
        list.add(lost);

        for (Titulo item: list) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        buscaPorArtista.add("Samuel");
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);
        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(list);
    }

}
