public class SalarioException extends Exception {

    private Pessoa pessoa;

    public SalarioException() {
        System.out.println("\nMétodo Construtor da classe SalarioException");
    }

    public void impErro(){
        System.out.println("\nSalario abaixo do valor.");
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
