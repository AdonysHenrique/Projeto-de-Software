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
        System.out.println("Numero 1: " + this.getNumero());
        System.out.println("Joel viado");
    }

    public void criarConta(String nome, String cpf, String email, String numero){
        setNome(nome);
        setCpf(cpf);
        setEmail(email);
        setNumero(numero);
        setStatus(true);
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
