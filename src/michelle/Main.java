package michelle;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Maria");
        Conta conta = new Conta(cliente);

        System.out.println("Saldo atual: " + conta.getSaldo());
        double deposito = 500;
        System.out.println("Depositando " + deposito);
        conta.deposito(deposito);
        System.out.println("Saldo atual: " + conta.getSaldo());

        double saque = 300;
        System.out.println("Sacando " + saque);
        conta.saque(saque);
        System.out.println("Saldo atual: " + conta.getSaldo());

        System.out.println("Sacando " + saque);
        conta.saque(saque);
        System.out.println("Saldo atual: " + conta.getSaldo());

    }
}
