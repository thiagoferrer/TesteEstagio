//2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
// (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
// ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

import java.util.Scanner;

public class FibonacciCheck {

    // Método para verificar se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        int a = 0, b = 1, fibonacci = 1;

        // Gera os números da sequência até encontrar o número ou passar dele
        while (fibonacci < n) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }

        // Verifica se o número gerado é igual ao número informado
        return fibonacci == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();

        // Chama o método isFibonacci para verificar o número
        if (isFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
