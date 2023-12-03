import java.io.IOException;

public class Inicio {
    public static void main(String[] args) {
        Leitura l = new Leitura();
        Pessoa pes = new Pessoa();

        try {
            pes.setId(Integer.parseInt(l.inData("\nEntre com o ID <deve ser um numero>: ")));
            pes.setNome(l.inData("\nEntre com o nome: "));
        } catch (IOException e) {
            System.out.println("Erro de entrada" + e);
        }

        System.out.println("\nID...: " + pes.getId());
        System.out.println("\nNome...: " + pes.getNome());
    }
}