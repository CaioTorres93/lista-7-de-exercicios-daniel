import java.util.Scanner;
import java.util.ArrayList;
public class Atv1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float somaTemperaturas = 0;
        float[] temperaturas = new float[12];
        String[]meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho",
            "Agosto","Setembro","Outubro", "Novembro", "Dezembro" };


            for(int i = 0; i < 12; i++){
                System.out.print("Digite a temperatura média de " + meses[i] + ": ");
                temperaturas[i] = scanner.nextFloat();

            }
            
            for (float temperatura : temperaturas) {
                somaTemperaturas += temperatura;
            }
            float mediaAnual = somaTemperaturas / 12;
            System.out.println("\nMeses com temperaturas acima da média anual (" + String.format("%.2f", mediaAnual) + " graus):");
            for (int i = 0; i < 12; i++) {
                if (temperaturas[i] > mediaAnual) {
                    System.out.println((i + 1) + " - " + meses[i] + ": " + String.format("%.2f", temperaturas[i]) + " graus");
                }
            }
        }
    }