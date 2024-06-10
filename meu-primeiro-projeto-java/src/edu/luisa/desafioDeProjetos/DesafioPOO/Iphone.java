package edu.luisa.desafioDeProjetos.DesafioPOO;

import edu.luisa.desafioDeProjetos.DesafioPOO.Apps.Itunes;
import edu.luisa.desafioDeProjetos.DesafioPOO.Apps.Safari;
import edu.luisa.desafioDeProjetos.DesafioPOO.Apps.TelefoneApp;


class Iphone {

     public static void main(String[] args) {

        // Musica
        Itunes itunes = new Itunes();
        // itunes.tocar();
        // itunes.pausar();
        // itunes.selecionarMusica();


        // Telefone
        TelefoneApp telefone = new TelefoneApp();
        // telefone.ligar();
        // telefone.atender();
        // telefone.iniciarCorreioVoz();

        // Navegador
        Safari safari = new Safari();
        // safari.adicionarNovaAba();
        // safari.atualizarPagina();
        // safari.exibirPagina();

    }
}