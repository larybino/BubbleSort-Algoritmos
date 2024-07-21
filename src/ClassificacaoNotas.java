import java.util.Arrays;

public class ClassificacaoNotas {
    public static void main(String[] args) throws Exception {
        int[] notas = {85, 70, 95, 60, 75, 80};
        ordemCrescente(notas);
        System.out.println("Notas Ordenadas: " + Arrays.toString(notas));
        double mediana = calcularMediana(notas);
        System.out.println("Mediana: " + mediana);
    }

    public static int[] ordemCrescente(int[] vetor){
        boolean troca;
        do {
            troca = false;
            for (int x = 0; x < vetor.length - 1; x++) {
                if (vetor[x] > vetor[x + 1]) {
                    int temp = vetor[x];
                    vetor[x] = vetor[x + 1];
                    vetor[x + 1] = temp;
                    troca = true;
                }
            }
        } while (troca);
        return vetor;
    }

    public static double calcularMediana(int[] vetor) {
        int n = vetor.length;
        if (n % 2 == 0) {
            return (vetor[n / 2 - 1] + vetor[n / 2]) / 2.0;
        } else {
            return vetor[n / 2];
        }
    }
}
