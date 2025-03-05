
import java.text.DecimalFormat;
import java.util.Scanner;


public class Exe12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.err.println("Digite o ponto 1(x, y): ");
        double x = teclado.nextInt();
        double y = teclado.nextInt();

        System.err.println("Digite o ponto 2(x, y): ");
        double x2 = teclado.nextInt();
        double y2 = teclado.nextInt();

        double diferencax = x2-x;
        double diferencay = y2-y;

        double quadradoDifX = Math.pow(diferencax, 2);
        double quadradoDifY = Math.pow(diferencay, 2);

        double soma = quadradoDifX + quadradoDifY;

        double distancia = Math.sqrt(soma);

        System.out.println("Distancia = " + distancia);

        DecimalFormat df = new DecimalFormat("#0.0000");

        System.out.println("Distancia(formatada) = " + df.format(distancia));

        teclado.close();

    }

   
    
}
