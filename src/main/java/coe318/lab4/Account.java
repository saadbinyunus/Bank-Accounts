/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;

/**
 *
 * @author USER
 */
public class Account {


    String name;
    double balance;
    int number;
                   // INSTANCE VARIABLES DECLARATION //


        public Account(String name,int number,double initialbalance){
            
                this.name=name;
                this.number=number;
                this.balance=initialbalance;
                
        }
                    // SETTING PARAMETERS //
    
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }
                    // GETTER METHODS USING JAVA INSERT CODE //
 
        boolean deposit(double amount){
        if(amount > 0) {
            balance = amount+balance;
            return true;
        }
        else{
        return false;
                     
                    // DEPOSIT METHOD USING IF STATEMENTS//
    }
}
        boolean withdraw(double amount){
        if(amount > balance || amount <= 0) {
            
            return false;
        }
        else{
            balance=balance-amount;
        
        return true;}
           
                    // WITHDRAW METHOD USING IF STATEMENTS//
    }
        
        @Override
            public String toString() {//DO NOT MODIFY
                return "(" + getName() + ", " + getNumber() + ", " +
                String.format("$%.2f", getBalance()) + ")";
}

        
        }
        
        
        
