import java.util.Scanner;

public class AvaliacaoFilmes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite aquantidade de filmes quedeseja avaliar:");
        int quantidadeFilmes=scanner.nextInt();

        int[] avaliacoes=new int[quantidadeFilmes];

        int filmesBons = 0;
        int filmesRuins = 0;
        int somaAvaliacoes = 0;

        for (int i=0; i < quantidadeFilmes;i++) {
            System.out.print("Digite a avaliação      do filme "+(i + 1) + "(0 a 10): ");
            int avaliacao = scanner.nextInt();


            if (avaliacao <0|| avaliacao > 10) {
                System.out.println("Avaliaçãoinválida!   Por favor, insira uma nota entre 0 e 10.");
                i--;
                continue;
            }
            avaliacoes[i] = avaliacao;
            somaAvaliacoes += avaliacao;
            if (avaliacao >= 6) {
                filmesBons++;
            } else {
                filmesRuins++;
            }
        }

        double mediaAvaliacoes = (double) somaAvaliacoes / quantidadeFilmes;

        System.out.println("Média das avaliações: " + mediaAvaliacoes);
        System.out.println("Quantidade de filmes avaliados como bons (nota >= 6): " + filmesBons);
        System.out.println("Quantidade de filmes avaliados como ruins (nota < 6): " + filmesRuins);


    }
}