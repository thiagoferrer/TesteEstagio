//4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
//        • SP – R$67.836,43
//        • RJ – R$36.678,66
//        • MG – R$29.229,88
//        • ES – R$27.165,48
//        • Outros – R$19.849,53
//
//Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.

public class FaturamentoPorEstado {
    public static void main(String[] args) {

        // Valores de faturamento mensal por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        // Cálculo do faturamento total
        double faturamentoTotal = sp + rj + mg + es + outros;

        // Cálculo do percentual de cada estado em relação ao total
        double percSP = (sp / faturamentoTotal) * 100;
        double percRJ = (rj / faturamentoTotal) * 100;
        double percMG = (mg / faturamentoTotal) * 100;
        double percES = (es / faturamentoTotal) * 100;
        double percOutros = (outros / faturamentoTotal) * 100;

        // Exibição dos resultados
        System.out.printf("Percentual de SP: %.2f%%\n", percSP);
        System.out.printf("Percentual de RJ: %.2f%%\n", percRJ);
        System.out.printf("Percentual de MG: %.2f%%\n", percMG);
        System.out.printf("Percentual de ES: %.2f%%\n", percES);
        System.out.printf("Percentual de Outros: %.2f%%\n", percOutros);
    }
}
