package br.com.alura.minhasmusicas.principal;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principla {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Peaches");
        minhaMusica.setCantor("Jack Black");

        for (int i =0; i< 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.like();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Flow Podcast");
        meuPodcast.setHost("Igor3k");

        for (int i = 0; 1 < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.like();
        }
    }
}
