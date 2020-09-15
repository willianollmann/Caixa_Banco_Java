/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

/**
 *
 * @author willi
 */
public class ContaCorrente extends Conta {
    private double limite;
    
    public ContaCorrente(){
        this(0, 0, 0, 0, 0);
    }
    
    public ContaCorrente(int agencia, int numero, int digito, double saldo, 
    double limite){
        super.setAgencia(agencia);
        super.setNumero(numero);
        super.setDigito(digito);
        super.setSaldo(saldo);
        this.setLimite(limite);

    }
        public ContaCorrente(ContaCorrente nConta){
        this(nConta.getAgencia(), nConta.getNumero(), 
             nConta.getDigito(), nConta.getSaldo(), nConta.getLimite());
    }
    
    @Override
    public void sacar(double valor){
        if(valor <= (saldo+limite)){
            this.setSaldo (saldo - valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
            System.out.println("Sld. Atual CC + Limite: R$"
            + (saldo+limite) + "." + "\n");
        } else {
            System.out.println("\n" + "Saque de R$" + valor + " não realizadado. Saldo insuficiente!");
            System.out.println ("Saldo CC + Limite: R$" + (saldo+limite) + ".");
        }
    }
    
    @Override
    public void transferir(double valor, Conta ct){
        if(valor <= (saldo+limite)){
            this.setSaldo (saldo - valor);
            ct.setSaldo(ct.getSaldo() + valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso!");
            
        } else {
            System.out.println("\n" + "Transferência de R$" + valor + " não "
                    + "realizadada. Saldo insuficiente!");
            System.out.println("Sld. Atual CC + Limite: R$" + (saldo+limite) + ".");
        }
    }
   
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public String mostrarDados() {
        String retorno = "CC - " + "Agência: " + agencia + ", Número: " + numero + ", "
               + "Dígito: " + digito + ", Saldo: R$" + saldo + ", " + "Limite: "
               + "R$" + limite + ".";
        return retorno;
    }
    
}
