package entities;

public class Conta {
    private int numConta;
    private String titular;
    private double saldo;

    public Conta(int numConta, String titular) {
        this.numConta = numConta;
        this.titular = titular;
    }

    public Conta(int numConta, String titular, double depositoInicial) {
        this.numConta = numConta;
        this.titular = titular;
        deposito(depositoInicial);
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double taxa){
        saldo += taxa;
    }

    public void saque(double taxa){

        saldo -= taxa + 5.0;
    }

    public String toString(){
        return "Conta "
                + numConta
                + ", Titular: "
                + titular
                + ", Saldo: $ "
                + String.format("%.2f", saldo);
    }

}