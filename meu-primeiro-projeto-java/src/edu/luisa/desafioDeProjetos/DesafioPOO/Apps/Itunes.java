package edu.luisa.desafioDeProjetos.DesafioPOO.Apps;

import java.util.ArrayList;
import java.util.List;
import edu.luisa.desafioDeProjetos.DesafioPOO.funcoes.Musicas;

public class Itunes implements Musicas {
      @Override
    public void tocar() {
        System.out.println("Reproduzindo -> Congratulations ft. Quavo (Post Malone)");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado-> Congratulations ft. Quavo (Post Malone)");
    }



    @Override
    public void selecionarMusica() {
        // lista de músicas

        List musicas = new ArrayList<>();
        musicas.add("Congratulations ft. Quavo (Post Malone)");
        musicas.add("Chemical - Post Malone");
        musicas.add("Enough is Enough - Post Malone");
        musicas.add("Go Flex - Post Malone");
        musicas.add("Saint Tropez - Post Malone");

        // System.out.println(musicas);

        for(int i =0; i < musicas.size(); i++){
            System.out.println(musicas.get(i));
        }

    }
 
}
