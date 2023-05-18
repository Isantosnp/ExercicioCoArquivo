package ExercicioArquivo;

import java.util.List;

public class Banco {

    private String nomeBanco;
    List<Conta> contas;

    public Banco() {
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public double calculoSaldo() {
        double saldoTotal = 0;
        for (int i = 0; i < contas.size(); i += 1) {
            Conta c = new Conta();
             return  saldoTotal += c.getSaldo();
        }
        return saldoTotal;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
}
