import java.util.Scanner;

public class ValidaSenhaForte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean senhaValida = false;

        System.out.println("=== Avaliador de Senhas (Didático) ===");

        while (!senhaValida) {
            System.out.print("Informe uma senha fictícia: ");
            String senha = scanner.nextLine();

            if (senha == null || senha.length() < 8) {
                System.out.println("Orientação: A senha deve conter no mínimo 8 caracteres.");
                System.out.println("Tente novamente.\n");
                continue;
            }

            boolean temNumero = false;
            for (int i = 0; i < senha.length(); i++) {
                char c = senha.charAt(i);
                if (Character.isDigit(c)) {
                    temNumero = true;
                    break;
                }
            }

            if (!temNumero) {
                System.out.println("Orientação: A senha deve conter pelo menos um número.");
                System.out.println("Tente novamente.\n");
                continue;
            }

            System.out.println("Senha aprovada nos critérios avaliados!\n");
            senhaValida = true;
        }

        scanner.close();
    }
}
