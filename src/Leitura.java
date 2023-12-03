import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {
    public static String inData(String label) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println(label);
        String s = "";

        try {
            s = br.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada" + e);
        }

        return s;
    }
}
