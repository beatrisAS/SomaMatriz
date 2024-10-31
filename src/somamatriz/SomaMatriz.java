package somamatriz;

/**
 *
 * @author beatris
 */
import java.util.Scanner;

public class SomaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;

        // Solicita a digitação dos valores para a matriz 3x3
        System.out.println("Digite os valores para a matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j]; // Soma os elementos da matriz
            }
        }

        // Exibe a soma dos elementos da matriz
        System.out.println("A soma de todos os elementos da matriz é: " + soma);
    }
}

