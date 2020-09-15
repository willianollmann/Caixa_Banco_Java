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
public abstract class Conta {
    protected int agencia;
    protected int numero;
    protected int digito;
    protected double saldo;
    
    public int getAgencia(){
        return agencia;
    }
    
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
           
    public void sacar (double valor){
        if (saldo >= valor) {
            this.setSaldo (saldo - valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
            System.out.println("Saldo Atual: R$" + saldo + "\n");
        } else{
            System.out.println("\n" + "Saque de R$" + valor + " não realizado. "
                              + "Saldo insuficiente!");
            System.out.println("Saldo Disponível: R$" + saldo);
        }  
    }
    
    public void depositar (double valor){
        this.setSaldo (saldo + valor);
        System.out.println("\n" + "Depósito realizado com sucesso!");
    }
         
    public void transferir (double valor, Conta ct){
        if(valor <= (saldo)){
        System.out.println("\n" + "Transferência de R$" + valor + " realizada com sucesso!");    
            this.setSaldo (saldo - valor);
            ct.setSaldo(ct.getSaldo() + valor);
    }  else{
        System.out.println("\n" + "Transferência de R$" + valor + " não realizada. Saldo insuficiente!");
        System.out.println("Saldo Disponível: R$" + saldo);
        }
    }    
    public void saldo (){
        System.out.println(this.mostrarDados());
    }
    
    public String mostrarDados() {
        String retorno = "Conta Poupança - " + "Agência: " + agencia + ", Número: " 
                + numero + ", Dígito: " + digito + ", Saldo: R$" + saldo + ".";
        return retorno;
    }
        
}
