import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            Cliente cliente = new Cliente();
            Banco b = new Banco();
            String nomeCliente = JOptionPane.showInputDialog(null, "Nome do cliente: " +
                    "Banco", JOptionPane.INFORMATION_MESSAGE);
            cliente.setNome(nomeCliente);

            String nomeBanco = JOptionPane.showInputDialog(null, "Nome do Banco: " +
                    "Banco", JOptionPane.INFORMATION_MESSAGE);
            b.setNomeBanco(nomeBanco);

            String path = "C:/Users/isabella.veras/OneDrive - Group Software Ltda/Documentos/LP/Contas.txt";
            Manipula m = new Manipula();
            m.leitor(path);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
