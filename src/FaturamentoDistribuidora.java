//3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
//  • O menor valor de faturamento ocorrido em um dia do mês;
//  • O maior valor de faturamento ocorrido em um dia do mês;
//  • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

public class FaturamentoDistribuidora {
    public static void main(String[] args) {

        // Exemplo de vetor com os valores de faturamento diário da distribuidora
        double[] faturamento = {1200.50, 800.0, 0.0, 1500.75, 1300.0, 0.0, 1700.50, 2100.30, 1000.0, 900.0, 1400.50, 800.0, 500.0, 2300.0, 0.0, 1600.20, 1900.0, 2400.0, 1100.0, 1700.75, 0.0, 1800.50, 2100.20, 2500.0, 3000.0, 0.0, 2000.0, 1500.0, 0.0, 2200.75};

        // Variáveis para armazenar o menor e o maior faturamento
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

        // Calculando o menor e maior faturamento, e somando os dias com faturamento maior que zero
        for (double valor : faturamento) {
            if (valor > 0) {
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }

        // Calculando a média mensal de faturamento, excluindo os dias sem faturamento (valor zero)
        double mediaMensal = somaFaturamento / diasComFaturamento;

        // Contando os dias em que o faturamento foi superior à média mensal
        int diasAcimaDaMedia = 0;
        for (double valor : faturamento) {
            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        // Exibindo os resultados
        System.out.printf("Menor faturamento do mês: %.2f\n", menorFaturamento);
        System.out.printf("Maior faturamento do mês: %.2f\n", maiorFaturamento);
        System.out.printf("Número de dias com faturamento superior à média mensal: %d\n", diasAcimaDaMedia);
    }
}
