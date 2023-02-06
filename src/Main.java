import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Usuario User1 = new Usuario();
        Scanner Leitor = new Scanner(System.in);
        String Usuario = Leitor.nextLine();
        String Cpf = Leitor.nextLine();
        String Email = Leitor.nextLine();
        String Numero = Leitor.nextLine();
        User1.criarConta(Usuario,Cpf, Email, Numero);
        User1.estadoAtual();
    }
}