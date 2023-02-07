import java.util.Scanner;

public class Usuario {

    public Usuario() {
        this.setStatus(false);
    }

    public String nome;
    public String cpf;
    public String email;
    public String numero;
    public boolean status;
    public void estadoAtual(){
        System.out.println("-----------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Numero: " + this.getNumero());
        System.out.println("Status da conta: " + this.isStatus());
    }

    public void criarConta(){

        Scanner Leitor = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String Usuario = Leitor.nextLine();
        setNome(Usuario);
        System.out.println("Digite seu CPF:");
        String Cpf = Leitor.nextLine();
        setCpf(Cpf);
        System.out.println("Digite seu Email:");
        String Email = Leitor.nextLine();
        setEmail(Email);
        System.out.println("Digite seu numero:");
        String Numero = Leitor.nextLine();
        setNumero(Numero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return String.valueOf(numero);
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
