package edu.luisa.tiposVariaveis;

public class TiposVariaveis {

    public static void main(String[] args) throws Exception {
        //tipos primitivos
        //string

        double salarioMinimo = 2500;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // fortemente tipada e pode ter problemas em usar o cast

        int numero = 5;

		numero = 10;

		System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
    }
}