
import java.util.Scanner;

public class Exe20 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a qiantidade de dobras: ");
        int quantidadedeDobras = teclado.nextInt();

        int quantidadedeQuadrados = (int) Math.pow(quantidadedeDobras, 2);

        System.out.println("Quantidade de quadrados = " + quantidadedeQuadrados);

        teclado.close();
    }
}