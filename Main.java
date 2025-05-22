public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        System.out.println("Quantidade de nós: " + arvore.contarNos());

        System.out.print("Pré-ordem: ");
        arvore.percorrerPreOrdem();

        System.out.print("\nEm ordem: ");
        arvore.percorrerEmOrdem();

        System.out.print("\nPós-ordem: ");
        arvore.percorrerPosOrdem();
    }
}
