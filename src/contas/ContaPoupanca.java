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
public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(){
        this(0, 0, 0, 0);
    }
    
    public ContaPoupanca(int agencia, int numero, int digito, double saldo) {
        super.setAgencia(agencia);
        super.setNumero(numero);
        super.setDigito(digito);
        super.setSaldo(saldo);

    }
    
    public ContaPoupanca(ContaPoupanca nConta){
        this(nConta.getAgencia(), nConta.getNumero(), nConta.getDigito(), 
             nConta.getSaldo());
    }
    
    public void rendimento(double percentual){
        super.setSaldo((percentual*saldo)+saldo);
    }
}
