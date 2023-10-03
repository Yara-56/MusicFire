package br.com.YaraProjects.MusicFire.modelos;

public class MinhasFavoridas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é sucesso!");
        }else {
            System.out.println(audio.getTitulo() + " também é um dos mais ouvidos!");
        }
    }
}
