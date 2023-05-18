package ExercicioArquivo;

import java.io.*;
import java.util.List;

public class Manipular {

    public List<Conta> leitor(String arq) throws IOException {
        BufferedReader buff = new BufferedReader(new FileReader(arq));
        String linha = " ";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
                String[] linhaVetor = linha.split(" , ");
                Conta c = new Conta();
                c.setAgencia(linhaVetor[0]);
                c.setNumero(linhaVetor[1]);
                c.setSaldo(Double.parseDouble(linhaVetor[3]));
                Banco b = new Banco();
                b.adicionarConta(c);

                for (int i = 0; i < linhaVetor.length; i++) {
                    System.out.println(linhaVetor[i]);
                    System.out.println(c);
                }
            } else
                break;
            linha = buff.readLine();
        }
        return null;
    }
    public static void arqtotal(double saldoGeral, String nomeBanco) throws IOException {
        try {
            String nomeArquivo = "C:/Users/chabe/Documents/Lp/saldo_geral.txt";
            File file = new File(nomeArquivo);
            FileWriter writer = new FileWriter(nomeArquivo, true);
            FileReader reader = new FileReader(nomeArquivo);
            BufferedReader bufferedReader = new BufferedReader(reader);
            writer.write("Banco " + nomeBanco + " possui o saldo geral de contas de: " + saldoGeral + "\n");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

