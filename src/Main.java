public class Main {
    public static void main(String[] args) {
        Cliente bruno = new Cliente();
        bruno.setNome("Bruno");
        Conta ccBruno = new ContaCorrente(bruno);
        Conta cpBruno = new ContaPoupanca(bruno);

        ccBruno.depositar(200.00);
        ccBruno.transferir(100, cpBruno);
        ccBruno.transferir(2.00, cpBruno);
        System.out.println("---------------------------");
        ccBruno.imprimirExtrato();
        cpBruno.imprimirExtrato();
        System.out.println("---------------------------\n");

        Banco itau = new Banco("Itaú");
        itau.abrirConta(cpBruno);
        itau.abrirConta(ccBruno);
        itau.listarContas();

        System.out.println("Saldo total depositado no banco");
        System.out.println("Total: " + itau.totalDeDinheiroGuardadoNoBanco());

    }

}