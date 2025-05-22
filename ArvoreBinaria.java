public class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        No noA = new No("A");
        No noB = new No("B");
        No noC = new No("C");
        No noD = new No("D");
        No noE = new No("E");
        No noF = new No("F");

        noA.esquerda = noB;
        noA.direita = noC;
        noB.esquerda = noD;
        noB.direita = noE;
        noC.direita = noF;

        this.raiz = noA;
    }

    public int contarNos() {
        return contarNosRecursivo(raiz);
    }

    private int contarNosRecursivo(No no) {
        if (no == null) return 0;
        return 1 + contarNosRecursivo(no.esquerda) + contarNosRecursivo(no.direita);
    }

    public void percorrerPreOrdem() {
        percorrerPreOrdemRecursivo(raiz);
    }

    private void percorrerPreOrdemRecursivo(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            percorrerPreOrdemRecursivo(no.esquerda);
            percorrerPreOrdemRecursivo(no.direita);
        }
    }

    public void percorrerEmOrdem() {
        percorrerEmOrdemRecursivo(raiz);
    }

    private void percorrerEmOrdemRecursivo(No no) {
        if (no != null) {
            percorrerEmOrdemRecursivo(no.esquerda);
            System.out.print(no.valor + " ");
            percorrerEmOrdemRecursivo(no.direita);
        }
    }

    public void percorrerPosOrdem() {
        percorrerPosOrdemRecursivo(raiz);
    }

    private void percorrerPosOrdemRecursivo(No no) {
        if (no != null) {
            percorrerPosOrdemRecursivo(no.esquerda);
            percorrerPosOrdemRecursivo(no.direita);
            System.out.print(no.valor + " ");
        }
    }
}
