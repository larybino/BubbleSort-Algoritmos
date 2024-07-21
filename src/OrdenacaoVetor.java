public class OrdenacaoVetor {
    public static void main(String[] args) throws Exception {
        String[] vetor = {"bbb", "aaa", "ccc"};
        ordenarStrings(vetor);
        for (String str : vetor){
            System.out.println(str+" ");
        }
    }
    public static String[] ordenarStrings(String[] vetor){
        boolean troca;
        do {
            troca = false;
            for (int x = 0; x < vetor.length - 1; x++) {
                if (vetor[x].compareTo(vetor[x + 1]) > 0) {
                    String temp = vetor[x];
                    vetor[x] = vetor[x + 1];
                    vetor[x + 1] = temp;
                    troca = true;
                }
            }
        } while (troca);
        return vetor;
    }
}
