public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // TiposdeVariaveis.java
        int idadeInt;
        long idadeLong = 20L;
        int anoFabricacao = 2020;
        double salarioMinimoDouble = 2500.50;
        float salarioMinimoFloat = 2500.50F;

        String meuNome = "Victor Emanuel";//String não é um tipo, é uma classe
        char letra = 'v';// char -> ' ' / String -> " "

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        //constantes
        int numero = 5; //variável
        numero = 10;
        System.out.println(numero);//imprime 10

        final double VALOR_DE_PI = 3.14;//constante
        //por convenção toda constante deve ser escrita em caixa alta

    }
}
