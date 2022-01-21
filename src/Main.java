public class Main {
    public static void main(String[] args) {
        Cliente bruno = new Cliente();
        bruno.setNome("Bruno");
        Conta cc = new ContaCorrente(bruno);

        Conta cp = new ContaPoupanca(bruno);

        cc.depositar(200.00);
        cc.transferir(100, cp);
        cc.transferir(2.00, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }

}