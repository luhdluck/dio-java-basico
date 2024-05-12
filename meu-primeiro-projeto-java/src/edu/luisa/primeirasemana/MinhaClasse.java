package edu.luisa.primeirasemana;
public class MinhaClasse {
    public static void main (String [] args) { 

        String nome = "Luisa";
        String sobrenome = "Lemos";
        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println (nomeCompleto);
     } 

     public static String nomeCompleto (String nome, String sobrenome){
        return "Resultado do metodo " + nome.concat(" ").concat(sobrenome);
     }
}
