package ExercicioArquivo;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private String agencia;
    private String numero;
    private double saldo;

    List<Conta> contas = new ArrayList<>();
    public Conta() {
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
