public class Aula04 {

    public static void main(String[] args) throws Exception {

        Vetor vetor  = new Vetor(10);

        vetor.adicionar("elemento 1");
        vetor.adicionar("elemento 2");
        vetor.adicionar("elemento 3");

        System.out.println(vetor.tamanho());

        System.out.println(vetor.toString());
    }
}
