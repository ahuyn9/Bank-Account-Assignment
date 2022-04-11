/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.bankapp;

/**
 *
 * @author mdoan3
 */
public class Savings {
    protected double savBal = 0;
    private final double interest = 0.20;
    
    public void addInterest(){
        this.savBal = (this.savBal * interest) + this.savBal;
    }
    
    public double checkBalance(){
        return this.savBal;
    }
    
    public void addFunds(double amount){
        System.out.println("Added Funds" + amount);
        this.savBal += amount;
    }
    public void removeFunds(double amount){
      return this.savBal -= amount;
    }
        
}

