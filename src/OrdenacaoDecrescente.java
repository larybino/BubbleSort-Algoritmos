public class OrdenacaoDecrescente {
    public static void main(String[] args) throws Exception {
        int[] vetor= {3, 0, -2, 5, 8};
        ordemDecrescente(vetor);
        for (int num : vetor){
            System.out.println(num+" ");
        }
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
