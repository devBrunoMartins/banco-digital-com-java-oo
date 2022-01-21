import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Banco {

    private String nomeBanco;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public void abrirConta(Conta conta){
        this.contas.add(conta);
    }

    public void listarContas(){
        System.out.println(" ==== " + this.nomeBanco + " ==== ");
        for (Conta conta: contas) {
            System.out.println(conta);
        }
        System.out.println(" =================================");
    }

    public double totalDeDinheiroGuardadoNoBanco(){
        double totalNoBanco = 0d;
        for (Conta conta: this.contas) {
            totalNoBanco += conta.saldo;
        }
        return totalNoBanco;
    }

}
