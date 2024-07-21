import java.util.Arrays;

public class PontuacaoJogadores {
    public static void main(String[] args) throws Exception {
        int[] pontuacoes = {250, 300, 150, 400, 350};
        ordemDecrescente(pontuacoes);
        System.out.println("Pontuações Ordenadas: " + Arrays.toString(pontuacoes));
        int pontuacaoMaisAlta = pontuacoes[0];
        System.out.println("Pontuação Mais Alta: " + pontuacaoMaisAlta);
    }
    
    public static int[] ordemDecrescente(int[] vetor){
        boolean troca;
        do {
            troca = false;
            for (int x = 0; x < vetor.length - 1; x++) {
                if (vetor[x] < vetor[x + 1]) {
                    int temp = vetor[x];
                    vetor[x] = vetor[x + 1];
                    vetor[x + 1] = temp;
                    troca = true;
                }
            }
        } while (troca);
        return vetor;
    }
}
