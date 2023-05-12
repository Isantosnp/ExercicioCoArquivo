import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Manipula {

    List<Conta> contas = new ArrayList<>();

    public String leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = " ";
        while (true) {
            if (linha != null) {

                String[] linhaItem = linha.split(",");
                Conta conta = new Conta();
                conta.setAgencia(linhaItem[0]);
                conta.setNumero(linhaItem[1]);
                conta.setSaldo(Double.parseDouble(linhaItem[2]));
                contas.add(conta);

                for (int i = 0; i < linhaItem.length; i++) {
                    System.out.println(linhaItem[i]);
                    return System.out.println(conta);
                }
            } else
                break;
            linha = buffRead.readLine();
        }

        buffRead.close();
    }
}
