
import java.util.Scanner;

public class Exe02 {

    // Leia 2 valores inteiros e imprima sua multiplicação.

    //Entrada: valor1, valor2
    //Saída: multiplicação
    //Processo: multiplicação = valor1 * valor2 = valor3
    //Testes:
    //Valor1        |2|10|-5|
    //valor2        |4|10|10|
    //multiplicação |8|100|-50|

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println( "Valor 1: ");
        Integer n1 = teclado.nextInt();

        System.out.println( "Valor 2: ");
        Integer n2 = teclado.nextInt();

        Integer multiplicação = n1*n2;

        System.err.println(multiplicação);
    }
}
