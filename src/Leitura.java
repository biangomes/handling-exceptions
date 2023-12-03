import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {
    public static String inData(String label) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println(label);
        String s = "";

        s = br.readLine();

        return s;
    }
}
