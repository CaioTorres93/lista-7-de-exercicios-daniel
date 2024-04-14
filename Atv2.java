import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int respostasSim = 0;

        // Realiza as perguntas e conta as respostas positivas
        respostasSim += realizarPergunta("Telefonou para a vítima?");
        respostasSim += realizarPergunta("Esteve no local do crime?");
        respostasSim += realizarPergunta("Mora perto da vítima?");
        respostasSim += realizarPergunta("Devia para a vítima?");
        respostasSim += realizarPergunta("Já trabalhou com a vítima?");

        // Classifica a participação da pessoa no crime
        if (respostasSim == 0 || respostasSim == 1) {
            System.out.println("Inocente!");
        } else if (respostasSim == 2 || respostasSim == 3) {
            System.out.println("Suspeito!");
        } else if (respostasSim == 4) {
            System.out.println("Cúmplice!");
        } else if (respostasSim == 5) {
            System.out.println("Assassino!");
        }
    }

    // Função para realizar uma pergunta e obter a resposta
    public static int realizarPergunta(String pergunta) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(pergunta + " (digite 's' para sim, 'n' para não): ");
        String resposta = scanner.next().toLowerCase();
        return resposta.equals("s") ? 1 : 0;
    }
}