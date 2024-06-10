package edu.luisa.desafioDeProjetos.DesafioPOO.Apps;

import edu.luisa.desafioDeProjetos.DesafioPOO.funcoes.Navegador;

public class Safari implements Navegador {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página X.com");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba à direita");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }
    
}
