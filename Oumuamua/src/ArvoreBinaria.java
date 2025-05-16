public class ArvoreBinaria {
    Node raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void criarArvoreExemplo() {
        raiz = new Node("A");
        raiz.esquerda = new Node("B");
        raiz.direita = new Node("C");

        raiz.esquerda.esquerda = new Node("D");
        raiz.esquerda.direita = new Node("E");

        raiz.direita.direita = new Node("F");
    }

    // Percurso em pré-ordem (raiz -> esquerda -> direita)
    public void preOrdem(Node no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            preOrdem(no.esquerda);
            preOrdem(no.direita);
        }
    }
}
