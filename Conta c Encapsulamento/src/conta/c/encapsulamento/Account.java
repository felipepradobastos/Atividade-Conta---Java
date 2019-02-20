package conta.c.encapsulamento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Account {
    // Variaveis
    private String name;
    private double balance;
    private int id;
    private double limit;
    
    public Account(String name, int id){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
    
    // Metodos:
    public void deposit(double value){
        this.balance=this.balance+value;
    }
    public boolean withdraw(double value){
        if(this.balance+this.limit > value){
            this.balance=this.balance-value;
            return true;
        }
        return false;
    }
    public boolean transfer(double value, Account dest){
        if(this.balance+this.limit > value){
            this.balance=this.balance-value;
            dest.balance=dest.balance+value;
            return true;
        }
        return false;
    }
}
