public class Oumuamua {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.criarArvoreExemplo();

        System.out.println("Percurso pré-ordem da árvore:");
        arvore.preOrdem(arvore.raiz);
    }
}


