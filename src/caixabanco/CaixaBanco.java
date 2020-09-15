
//MAPA PROGRAMACAO I
//ALUNO: WILLIAN HENRIQUE OLLMANN
//RA: 1758515-5
 
package caixabanco;

import contas.ContaCorrente;
import contas.ContaPoupanca;

/**
 *
 * @author willi
 */
public class CaixaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       ContaCorrente ctCorrente01 = new ContaCorrente();
       ctCorrente01.setAgencia(1238);
       ctCorrente01.setNumero(2222);
       ctCorrente01.setDigito(7);
       ctCorrente01.setSaldo(3500);
       ctCorrente01.setLimite(1000);
             
       ContaCorrente ctCorrente02 = new ContaCorrente();
       ctCorrente02.setAgencia(1238);
       ctCorrente02.setNumero(2323);
       ctCorrente02.setDigito(7);
       ctCorrente02.setSaldo(5000);
       ctCorrente02.setLimite(2500);
       
       ContaPoupanca ctPoupanca01 = new ContaPoupanca();
       ctPoupanca01.setAgencia(6797);
       ctPoupanca01.setNumero(1515);
       ctPoupanca01.setDigito(5);
       ctPoupanca01.setSaldo(6000);
        
       ContaPoupanca ctPoupanca02 = new ContaPoupanca();       
       ctPoupanca02.setAgencia(6797);
       ctPoupanca02.setNumero(1717);
       ctPoupanca02.setDigito(5);
       ctPoupanca02.setSaldo(7500);
       
        ctPoupanca01.saldo();
        ctPoupanca01.sacar(4000);  
        
        ctCorrente01.saldo(); 
        ctCorrente01.sacar(1500);
        
        ctCorrente02.transferir(4000, ctCorrente01);
        ctCorrente02.saldo();
        ctCorrente01.saldo();
        
        ctPoupanca02.transferir(1800, ctPoupanca01);
        ctPoupanca02.saldo();
        ctPoupanca01.saldo();
        
        ctCorrente02.sacar(7900);
        ctCorrente02.transferir(8000, ctCorrente01);
        
        ctPoupanca01.sacar(6800);
        ctPoupanca02.transferir(7900, ctPoupanca01);   
       
    }
    
}
