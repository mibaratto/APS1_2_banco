package michelle;


public class Conta {

    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0;
    }


    public void saque(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
