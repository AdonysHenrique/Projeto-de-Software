import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Usuario User1 = new Usuario();
        User1.criarConta();
        User1.estadoAtual();
        User1.modificarDados();
        User1.estadoAtual();
        User1.modificarDados("CPF", "131.219.894-43");
        User1.estadoAtual();

    }
}