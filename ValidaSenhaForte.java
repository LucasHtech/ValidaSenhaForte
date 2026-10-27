import java.util.Scanner;

public class ValidaSenhaForte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean senhaValida = false;

        System.out.println("=== Avaliador de Senhas (Didático) ===");

        while (!senhaValida) {
            System.out.print("Informe uma senha fictícia: ");
            String senha = scanner.nextLine();

            if (senha.length() < 8) {
                System.out.println("Orientação: A senha deve conter no mínimo 8 caracteres.");
                System.out.println("Tente novamente.\n");
            } else {
                boolean temNumero = senha.contains("0") || senha.contains("1") ||
                                   senha.contains("2") || senha.contains("3") ||
                                   senha.contains("4") || senha.contains("5") ||
                                   senha.contains("6") || senha.contains("7") ||
                                   senha.contains("8") || senha.contains("9");

                if (!temNumero) {
                    System.out.println("Orientação: A senha deve conter pelo menos um número.");
                    System.out.println("Tente novamente.\n");
                } else {
                    System.out.println("Senha aprovada nos critérios avaliados!\n");
                    senhaValida = true;
                }
            }
        }

        scanner.close();
    }
}
