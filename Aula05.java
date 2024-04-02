public class Aula05 {

    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("elemento 1"); // elemento 0
        vetor.adicionar("elemento 2"); // elemento 1
        vetor.adicionar("elemento 3"); // elemento 2

        System.out.println(vetor.busca(2));
    }
}
