package com.cato.main;

import com.cato.musica.musica;
import com.cato.musica.podcasts;

public class Main {
    public static void main(String[] args) {
        musica miMusica = new musica();

        miMusica.setNombre("Lunatique");
        miMusica.setAlbum("Triforce");

        podcasts miPodcast = new podcasts();

        miPodcast.setNombre("Dibujando");
        miPodcast.setDescripcion("pq no me sale aghhhh");

        System.out.println(miPodcast.getNombre());
        System.out.println(miMusica.getNombre());
        System.out.println(miMusica.getAlbum());


    }
}