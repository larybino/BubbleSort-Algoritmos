public class ClassificacaoFilmes {
    public static void main(String[] args) throws Exception {
        String[] nomes = {"Filme A", "Filme B", "Filme C"};
        double[] medias = {
            calcularMedia(new int[]{5, 4, 3, 4, 5}),
            calcularMedia(new int[]{2, 3, 4, 3, 2}),
            calcularMedia(new int[]{4, 4, 5, 5, 4})
        };
        ordenarFilmesPorAvaliacao(nomes, medias);
        System.out.println("Filmes Ordenados:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + " (" + medias[i] + ")");
        }
        int melhorAvaliacao = melhorFilme(medias);
        System.out.println("\nFilme Mais Bem Avaliado:");
        System.out.println(nomes[melhorAvaliacao]);
    }

    public static void ordenarFilmesPorAvaliacao(String[] nomes, double[] medias) {
        boolean troca;
        do {
            troca = false;
            for (int i = 0; i < medias.length - 1; i++) {
                if (medias[i] > medias[i + 1]) {
                    double tempMedia = medias[i];
                    medias[i] = medias[i + 1];
                    medias[i + 1] = tempMedia;
                    String tempNome = nomes[i];
                    nomes[i] = nomes[i + 1];
                    nomes[i + 1] = tempNome;
                    troca = true;
                }
            }
        } while (troca);
    }

    public static double calcularMedia(int[] avaliacoes) {
        int soma = 0;
        for (int avaliacao : avaliacoes) {
            soma += avaliacao;
        }
        return soma / (double) avaliacoes.length;
    }

    public static int melhorFilme(double[] medias) {
        int indiceMelhor = 0;
        for (int i = 1; i < medias.length; i++) {
            if (medias[i] > medias[indiceMelhor]) {
                indiceMelhor = i;
            }
        }
        return indiceMelhor;
    }
}
