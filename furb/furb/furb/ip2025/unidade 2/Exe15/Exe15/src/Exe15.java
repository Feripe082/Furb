import java.util.Scanner;

public class Exe15 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Valor em real: ");
        float valor_reais = teclado.nextFloat();

        int dinheiro = (int) (valor_reais * 100);

        int cedulas = (dinheiro / 100);
        int moedas = (dinheiro % 100);


        int nota_100 = cedulas / 100;
        cedulas = cedulas % 100;     

        int nota_50 = cedulas / 50;
        cedulas = cedulas % 50;     

        int nota_20 = cedulas / 20;
        cedulas = cedulas % 20;     

        int nota_10 = cedulas / 10;
        cedulas = cedulas % 10;     

        int nota_5 = cedulas / 5;
        cedulas = cedulas % 5;    

        int nota_2 = cedulas / 2;
        cedulas = cedulas % 2; 
        
        
        int moeda1 = cedulas % 2;

        int moeda_50 = moedas/50;
        moedas = moedas % 50;

        int moeda_25 = moedas/25;
        moedas = moedas % 25;

        int moeda_10 = moedas/10;
        moedas = moedas % 10;

        int moeda_5 = moedas/5;
        moedas = moedas % 5;

        int moedas_1 = moedas % 5;
   
        System.out.println("Quantidade de notas: " +
        "\nR$100: " + nota_100 + 
        "\nR$50: " + nota_50 + 
        "\nR$20: " + nota_20 +
        "\nR$10: " + nota_10 + 
        "\nR$5: " + nota_5 + 
        "\nR$2: " + nota_2 +
        "\n" +
        "\nR$1: " + moeda1 +
        "\nR$0,50:" + moeda_50+
        "\nR$0,25:" + moeda_25 + 
        "\nR$0,10: " + moeda_10 +
        "\nR$0,05: " + moeda_5 +
        "\nR$0,01: " + moedas_1);




        teclado.close();


    }
    
}