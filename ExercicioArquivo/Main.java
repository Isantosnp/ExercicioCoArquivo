package ExercicioArquivo;

import javax.swing.*;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Manipular manipular = new Manipular();
            Cliente1 cliente1 = new Cliente1();
            Banco b = new Banco();

            String arq = "C:/Users/isabella.veras/OneDrive - Group Software Ltda/Documentos/LP/Contas.txt";
            List<Conta> contas = manipular.leitor(arq);

            String nomeCliente = JOptionPane.showInputDialog(null, "Nome:  ", "Arquivo", JOptionPane.INFORMATION_MESSAGE);
            cliente1.setNome(nomeCliente);

            String nomeBanco = JOptionPane.showInputDialog(null, "Nome do Banco:  ", "Arquivo", JOptionPane.INFORMATION_MESSAGE);
            b.setNomeBanco(nomeBanco);

            double saldoGeral = b.calculoSaldo();

            manipular.arqtotal(saldoGeral, b.getNomeBanco());

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " +e.getMessage());
        }
    }
}
