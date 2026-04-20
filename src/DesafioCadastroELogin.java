import java.util.Scanner;

public class DesafioCadastroELogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("    Criação de conta    ");
        System.out.println("-> Digite seu login: ");
        String loginUsuario = scanner.nextLine();
        System.out.println("-> Digite a sua senha: ");
        String senhaUsuario = scanner.nextLine();

        int chances = 3;
        boolean sucessoLogin = false;

        for (int i = 0; i < chances ; i++) {
            System.out.println("Digite o login: ");
            String testeLogin = scanner.nextLine();
            System.out.println("Digite a senha: ");
            String testeSenha = scanner.nextLine();
            if (testeLogin.equals(loginUsuario) && testeSenha.equals(senhaUsuario)){
                System.out.println("Login feito com sucesso!");
                sucessoLogin = true;
                break;
            }else {
                System.out.println("Erro!");
                System.out.println("Tentativas: " + (chances - i - 1));
            }
        }
        if (!sucessoLogin){
            System.out.println("BLOQUEADO!");
        }
        scanner.close();
    }
}
