public class Pessoa {
    private int id;
    private String nome;
    private int rg;
    private int salario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) throws SalarioException {
        int salarioMinimo = 1320;
        if (salario < salarioMinimo) {
            throw new SalarioException();
        }
        this.salario = salario;
    }
}
