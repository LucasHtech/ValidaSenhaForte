import java.util.Scanner;

public class ValidaSenhaForte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean senhaValida = false;

        System.out.println("=== Avaliador de Senhas (Didático) ===");

        while (!senhaValida) {
            System.out.print("Informe uma senha fictícia: ");
            String senha = scanner.nextLine();

            String feedback = avaliarSenha(senha);

            if (feedback.equals("OK")) {
                System.out.println("Senha aprovada nos critérios avaliados!\n");
                senhaValida = true;
            } else {
                System.out.println("Orientação: " + feedback);
                System.out.println("Tente novamente.\n");
            }
        }

        scanner.close();
    }

    public static String avaliarSenha(String senha) {
        if (senha == null || senha.length() < 8) {
            return "A senha deve conter no mínimo 8 caracteres.";
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
            return "A senha deve conter pelo menos um número.";
        }

        return "OK";
    }
}
