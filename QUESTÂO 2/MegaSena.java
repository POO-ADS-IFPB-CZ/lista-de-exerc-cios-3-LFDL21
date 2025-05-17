import java.util.Arrays;
import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];
        int quantidade = 0;

        System.out.println("Digite 6 números da Mega-Sena (de 1 a 60, sem repetir):");

        while (quantidade < 6) {
            System.out.print("Número " + (quantidade + 1) + ": ");
            int numero = sc.nextInt();

            if (numero < 1 || numero > 60) {
                System.out.println("Número inválido. Digite um número entre 1 e 60.");
                continue;
            }

            boolean repetido = false;
            for (int i = 0; i < quantidade; i++) {
                if (numeros[i] == numero) {
                    repetido = true;
                    break;
                }
            }

            if (repetido) {
                System.out.println("Número repetido. Digite outro número.");
            } else {
                numeros[quantidade] = numero;
                quantidade++;
            }
        }

        Arrays.sort(numeros);

        System.out.println("Números escolhidos em ordem crescente:");
        for (int i = 0; i < 6; i++) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}
