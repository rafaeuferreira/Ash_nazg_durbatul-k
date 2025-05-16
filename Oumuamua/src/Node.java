public class Node {
    String valor;
    Node esquerda;
    Node direita;

    public Node(String valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}

/// Resultado → Pra busca pré-ordem da árvore: A B D E C F