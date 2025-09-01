
package mainmanipulador;

    public class ManipuladorString {
    private String frase;

    public ManipuladorString() {
        this.frase = "Esta é uma frase de exemplo para exercício.";
    }

    public void mostrarOperacoes() {
        System.out.println("Tamanho da frase: " + frase.length());
        System.out.println("Maiúsculas: " + frase.toUpperCase());
        System.out.println("Minúsculas: " + frase.toLowerCase());
        System.out.println("Substring: " + frase.substring(11, 29)); // "frase de exemplo"
    }
}


