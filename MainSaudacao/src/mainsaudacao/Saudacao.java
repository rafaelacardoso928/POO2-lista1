
package mainsaudacao;

    import java.util.Scanner;

public class Saudacao {
    public void cumprimentarUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome + "! Bem-vindo ao programa.");

        scanner.close();
    }
}


