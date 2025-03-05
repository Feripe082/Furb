import java.util.Scanner;

public class Exe14 {

//entrada: Leia o valor inteiro

//Saída: Quantidade de notas

//Processo: decomposicao de valores
// qtndNotas100 = valor / 100
// valor = valor % 100
// qtndNotas50 = valor / 50
// valor = valor % 50
// qtndNotas20 = valor / 20
// valor = valor % 20
// qtndNotas10 = valor / 10
// valor = valor % 10
// qtndNotas5 = valor / 5
// valor = valor % 5
// qtndNotas2 = valor / 2
// valor = valor % 2
// qtndNotas1 = valor / 1
// valor = valor % 1
    

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Valor inteiro: ");
        Integer valor = teclado.nextInt();

        Integer qtndnotas100 = valor / 100;
        valor = valor % 100;

        Integer qtndnotas50 = valor / 50;
        valor = valor % 50;

        Integer qtndnotas20 = valor / 20;
        valor = valor % 20;

        Integer qtndnotas10 = valor / 10;
        valor = valor % 10;

        Integer qtndnotas5 = valor / 5;
        valor = valor % 5;

        Integer qtndnotas2 = valor / 2;
        valor = valor % 2;

        Integer qtndnotas1 = valor / 1;

        System.out.println("Quantidade de notas de 100: "+ qtndnotas100) ;
        System.out.println("Quantidade de notas de 50: "+ qtndnotas50) ;
        System.out.println("Quantidade de notas de 20: "+ qtndnotas20) ;
        System.out.println("Quantidade de notas de 10: "+ qtndnotas10) ;
        System.out.println("Quantidade de notas de 5: "+ qtndnotas5) ;
        System.out.println("Quantidade de notas de 2: "+ qtndnotas2) ;
        System.out.println("Quantidade de notas de 1: "+ qtndnotas1) ;

        teclado.close();

    }
}
