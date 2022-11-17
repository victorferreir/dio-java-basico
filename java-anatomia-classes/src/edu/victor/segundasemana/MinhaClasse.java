package edu.victor.segundasemana;

public class MinhaClasse {

    public static void main (String [] args){
        //declarando variáveis
        String primeiroNome = "Victor";
        String segundoNome = "Emanuel";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }
    //declarando métodos
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}