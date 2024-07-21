public class VerificarOrdem {
    public static void main(String[] args) throws Exception {
        int[] vetor = {1, 3, 2, 4, 5};
        boolean resultado = verificarOrdenacao(vetor);
        System.out.println("O vetor está ordenado após uma passagem do Bubble Sort? " + resultado);

    }

    public static boolean verificarOrdenacao(int[] vetor) {
        boolean troca = false;
        for (int x = 0; x < vetor.length - 1; x++) {
            if (vetor[x] > vetor[x + 1]) {
                int temp = vetor[x];
                vetor[x] = vetor[x + 1];
                vetor[x + 1] = temp;
                troca = true;
            }
        }
        return !troca;
    }
}
