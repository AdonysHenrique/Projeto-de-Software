import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Usuario User1 = new Usuario();
        Scanner Leitor = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String Usuario = Leitor.nextLine();
        System.out.println("Digite seu CPF:");
        String Cpf = Leitor.nextLine();
        System.out.println("Digite seu Email:");
        String Email = Leitor.nextLine();
        System.out.println("Digite seu numero:");
        String Numero = Leitor.nextLine();
        User1.criarConta(Usuario,Cpf, Email, Numero);
        User1.estadoAtual();
    }
}