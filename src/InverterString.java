//5) Escreva um programa que inverta os caracteres de um string.
//
//IMPORTANTE:
//a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
//b) Evite usar funções prontas, como, por exemplo, reverse;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a entrada da string
        System.out.print("Informe uma string para ser invertida: ");
        String original = scanner.nextLine();

        // Converte a string original em um array de caracteres
        char[] caracteres = original.toCharArray();

        // Variável para armazenar a string invertida
        String invertida = "";

        // Itera sobre a string de trás para frente
        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertida += caracteres[i];  // Adiciona cada caractere ao final da string invertida
        }

        // Exibe a string invertida
        System.out.println("String invertida: " + invertida);

        scanner.close();
    }
}
