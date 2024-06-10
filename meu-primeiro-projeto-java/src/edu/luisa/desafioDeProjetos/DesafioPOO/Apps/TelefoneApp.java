package edu.luisa.desafioDeProjetos.DesafioPOO.Apps;

import edu.luisa.desafioDeProjetos.DesafioPOO.funcoes.Telefone;

public class TelefoneApp  implements Telefone {
    @Override
    public void ligar() {
        System.out.println("..........");
        System.out.println("Discando");
        System.out.println("98765-4321");
        System.out.println("..........");
    }

    @Override
    public void atender() {
        System.out.println("..........");
        System.out.println("Número Desconhecido");
        System.out.println(":(");
        System.out.println("Chamada em andamento");
        System.out.println("..........");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Abrindo Correio de Voz...");
    }
}
