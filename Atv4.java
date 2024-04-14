import java.util.ArrayList;
import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lista para armazenar as vendas brutas de cada vendedor
        ArrayList<Double> vendasBrutas = new ArrayList<>();
        
        // Leitura das vendas brutas até que o usuário digite -1 para encerrar a entrada de dados
        System.out.println("Digite as vendas brutas dos vendedores (digite -1 para encerrar):");
        while (true) {
            double venda = scanner.nextDouble();
            if (venda == -1) {
                break; // Encerra a entrada de dados
            }
            vendasBrutas.add(venda);
        }

        // Array de contadores para faixas de salários
        int[] faixasSalarios = new int[9]; // 9 faixas, de $200-$299 até $1000 ou mais

        // Calcular salários e distribuir em faixas
        for (double venda : vendasBrutas) {
            // Calcula o salário semanal
            double salario = 200 + (0.09 * venda);

            // Determina a faixa de salários do vendedor
            if (salario >= 200 && salario <= 299) {
                faixasSalarios[0]++;
            } else if (salario >= 300 && salario <= 399) {
                faixasSalarios[1]++;
            } else if (salario >= 400 && salario <= 499) {
                faixasSalarios[2]++;
            } else if (salario >= 500 && salario <= 599) {
                faixasSalarios[3]++;
            } else if (salario >= 600 && salario <= 699) {
                faixasSalarios[4]++;
            } else if (salario >= 700 && salario <= 799) {
                faixasSalarios[5]++;
            } else if (salario >= 800 && salario <= 899) {
                faixasSalarios[6]++;
            } else if (salario >= 900 && salario <= 999) {
                faixasSalarios[7]++;
            } else {
                // Salário de $1000 ou mais
                faixasSalarios[8]++;
            }
        }

        // Exibir resultados
        System.out.println("\nDistribuição de salários:");
        System.out.println("$200 - $299: " + faixasSalarios[0]);
        System.out.println("$300 - $399: " + faixasSalarios[1]);
        System.out.println("$400 - $499: " + faixasSalarios[2]);
        System.out.println("$500 - $599: " + faixasSalarios[3]);
        System.out.println("$600 - $699: " + faixasSalarios[4]);
        System.out.println("$700 - $799: " + faixasSalarios[5]);
        System.out.println("$800 - $899: " + faixasSalarios[6]);
        System.out.println("$900 - $999: " + faixasSalarios[7]);
        System.out.println("$1000 ou mais: " + faixasSalarios[8]);

        // Encerra o programa com uma mensagem
        System.out.println("\nPrograma encerrado. Obrigado!");
        
        // Fecha o scanner
        scanner.close();
    }
}