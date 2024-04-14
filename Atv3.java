import java.util.ArrayList;
import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>(); // Lista para armazenar as notas

        System.out.println("Digite as notas. Para encerrar a entrada de dados, digite -1.");

        // Leitura das notas
        while (true) {
            double grade = scanner.nextDouble();
            if (grade == -1) {
                break; // Encerra a entrada de dados se o usuário digitar -1
            }
            grades.add(grade);
        }

        // Quantidade de valores lidos
        int quantity = grades.size();
        System.out.println("\nQuantidade de valores lidos: " + quantity);

        // Exibe todos os valores na ordem em que foram informados, um ao lado do outro
        System.out.print("Valores na ordem informada: ");
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();

        // Exibe todos os valores na ordem inversa à que foram informados, um abaixo do outro
        System.out.println("\nValores na ordem inversa:");
        for (int i = quantity - 1; i >= 0; i--) {
            System.out.println(grades.get(i));
        }

        // Calculo da soma dos valores
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        System.out.println("\nSoma dos valores: " + sum);

        // Calculo da média dos valores
        double average = sum / quantity;
        System.out.println("Média dos valores: " + average);

        // Calculo da quantidade de valores acima da média calculada
        int countAboveAverage = 0;
        for (double grade : grades) {
            if (grade > average) {
                countAboveAverage++;
            }
        }
        System.out.println("Quantidade de valores acima da média: " + countAboveAverage);

        // Calculo da quantidade de valores abaixo de sete
        int countBelowSeven = 0;
        for (double grade : grades) {
            if (grade < 7) {
                countBelowSeven++;
            }
        }
        System.out.println("Quantidade de valores abaixo de sete: " + countBelowSeven);

        // Encerra o programa com uma mensagem
        System.out.println("\nPrograma encerrado. Obrigado!");
        
        // Fecha o scanner
        scanner.close();
    }
}