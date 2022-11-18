public class Operadores {
    public static void main(String[] args){
        // (=)atribuição; (+)soma ou concatenação
        /*String nomeCompleto = "Linguagem " + "Java";
        System.out.println(nomeCompleto);
        
        String concatenacao ="?";
        System.out.println(concatenacao);
        
        concatenacao = 1+1+1+"1";// 31
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1;// 1111 - a partir do momento que é detectado uma concatenação, todos irão concatenar
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        
        concatenacao = "1"+(1+1+1);// 13 - primeiro realizou a soma das evidências, depois concatenou
        System.out.println(concatenacao);*/

        //operadores unários 
        /* (+)/(-) -> Unário de valor positivo e negativo
           (++)/(--) -> Unário de incremento e decremento
           (!) -> Unário lógico de negação
        */ 
        /*int numero = 5;
        numero = -numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);
        numero++;
        System.out.println(numero--);
        System.out.println(numero);
        numero += 2;
        System.out.println(numero--);

        boolean variavel = true;
        System.out.println(!variavel);
        variavel = !variavel;
        System.out.println(variavel);*/

        //Operador ternário (?:) || <Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>
        /*int a = 6, b = 6;
        String resultado;
        if (a==b) resultado = "verdadeiro";
        else resultado = "falso";
        System.out.println(resultado);
        resultado = (a==b) ? "verdadeiro" : "falso";
        System.out.println(resultado);*/

        //Operadores Relacionais
        /*String nomeUm = "Victor";
        String nomeDois = "Victor";
        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm .equals(nomeDois));
        
        
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        System.out.println("númeroUm é igual a númeroDois? " + simNao);
        simNao = numero1 != numero2;
        System.out.println("númeroUm é diferente a númeroDois? " + simNao);
        simNao = numero1 > numero2;
        System.out.println("númeroUm é maior que númeroDois? " + simNao);
        if(numero1<numero2){
            System.out.println("A nossa condição é verdadeira!");
        }*/

        //Operadores Lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;
        if(condicao1 && (7>4)){
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);

    }
}
