package Ex10;

public class conta {

    private String nomeCliente;
    private int nConta;
    private int saldo;

    public conta(String nomeCliente, int nConta, int saldo) {
        this.nomeCliente = nomeCliente;
        this.nConta = nConta;
        this.saldo = saldo;
    }

    public conta() {

    }

    public int depositar(int deposito) {
        this.saldo += deposito;
        return saldo;
    }

    public int sacar(int saque) {
        if (saque <= this.saldo && saque >= 0) {
            this.saldo -= saque;
        } else {
            System.out.println("Saldo insuficiente ---> operação inválida.");
        }
        return saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return nConta;
    }

    public void setNumConta(int nConta) {
        this.nConta = nConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}