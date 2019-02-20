/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta.c.encapsulamento;

import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account user = new Account("Felipe", 123);
        Account user2 = new Account("Miguel", 123);
        
        user.setLimit(Double.parseDouble(JOptionPane.showInputDialog("Felipe, Insira o limite de sua conta: ")));
        user.deposit(Double.parseDouble(JOptionPane.showInputDialog("Felipe, Insira o saldo inicial: ")));
        user2.setLimit(3000);
        user2.deposit(200);
        
        int opt=10;
        
        while(opt!=0){
            opt=Integer.parseInt(JOptionPane.showInputDialog("Saque: 1\nDeposito: 2\nTransferencia:3"));
            switch(opt){
                case 1:
                    user.withdraw(Double.parseDouble(JOptionPane.showInputDialog("Quanto deseja Retirar?")));
                    JOptionPane.showMessageDialog(null, "O Novo Saldo:"+user.getBalance());
                    break;
                case 2:
                    user.deposit(Double.parseDouble(JOptionPane.showInputDialog("Quantia a ser depositada: ")));
                    JOptionPane.showMessageDialog(null, "O Novo Saldo:"+user.getBalance());
                    break;
                case 3:
                    user.transfer(Double.parseDouble(JOptionPane.showInputDialog("Quantia a ser Transferida:")), user2);
                    JOptionPane.showMessageDialog(null, "O Novo Saldo da Conta Debitada:"+user.getBalance());
                    JOptionPane.showMessageDialog(null, "O Novo Saldo da Conta Bonificada:"+user2.getBalance());
                    break;
        }
    }
}
}
    
