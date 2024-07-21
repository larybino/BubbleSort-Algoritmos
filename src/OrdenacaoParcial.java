public class OrdenacaoParcial {
    public static void main(String[] args) throws Exception {
        int[] vetor = {8, 4, 3, 7, 6, 5, 2};
        int N = 4;
        ordemParcial(vetor, N);
        System.out.println("Vetor após ordenação parcial dos primeiros " + N + " elementos:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] ordemParcial(int[] vetor, int n) {
        boolean troca;
        do {
            troca = false;
            for (int x = 0; x < n - 1; x++) {
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
}
