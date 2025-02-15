import java.util.Scanner;

public class LoginSystem {

    // Dados de usuário pré-definidos (simulando um banco de dados)
    private static final String CORRECT_USERNAME = "usuario";
    private static final String CORRECT_PASSWORD = "senha123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome de usuário
        System.out.print("Digite o nome de usuário: ");
        String username = scanner.nextLine();

        // Solicita a senha
        System.out.print("Digite a senha: ");
        String password = scanner.nextLine();

        // Verifica se o nome de usuário e a senha estão corretos
        if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
            System.out.println("Login bem-sucedido! Bem-vindo, " + username + "!");
        } else {
            System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
        }

        scanner.close();
    }
}