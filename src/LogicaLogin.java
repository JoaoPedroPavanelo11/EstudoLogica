/*
Senha correta: "1234"
Usuário tem 3 tentativas
Se acertar → "Acesso permitido"
Se errar → "Senha incorreta"
Se errar 3 vezes → "Conta bloqueada"
 */


import java.util.Scanner;

public class LogicaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 1234;
        int tentativas = 0;

        while (tentativas < 3){
            System.out.println("Digite a senha que voce acha que é: ");
            int senhaDigitada = scanner.nextInt();
            if (senhaDigitada == senhaCorreta){
                System.out.println("Acertou!");
                break;
            }else {
                tentativas++;
                System.out.println("Errou!");

                System.out.println("Suas tentaivas: "+tentativas);
                if (tentativas == 3){
                    System.out.println("acabou!");
                }
            }
        }
    }
}
