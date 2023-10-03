package br.com.YaraProjects.MusicFire.principal;
import br.com.YaraProjects.MusicFire.modelos.*;
import br.com.YaraProjects.MusicFire.modelos.Audio;


public class Main {
    public static void main(String[] args){

        Musica musica = new Musica();
        musica.setTitulo("Bor to die");
        musica.setCantor("Lana Del Rey");

        for (int i = 0; i < 1000; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("BolhaDev");
        podcast.setApresentador("Marcos Mendes");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        MinhasFavoridas preferidas = new MinhasFavoridas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);
    }
}