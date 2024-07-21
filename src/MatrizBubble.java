public class MatrizBubble {
    public static void main(String[] args) throws Exception {
        int[][] matriz = {
            {3, 2, 1},
            {6, 5, 4},
            {9, 8, 7}
        };
        for (int x = 0; x < matriz.length; x++) {
            ordemCrescente(matriz[x]);
        }
        System.out.println("Matriz após ordenação das linhas:");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();
        }
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
}
