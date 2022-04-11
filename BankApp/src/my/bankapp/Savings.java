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
    protected static double savBal = 0;
    private final double interest = 0.20;
    
    public void addInterest(){
        this.savBal = (this.savBal * interest) + this.savBal;
    }
    
    public void setSavings(double amount){
        this.savBal = amount;
    }
    
    public double checkBalance(){
        return savBal;
    }
    
    public void addFunds(double amount){
        System.out.println("Added Funds to Savings: " + amount);
        double newBal = checkBalance();
        newBal += amount;
        setSavings(newBal);
        //System.out.println(newBal);
    }
    public void removeFunds(double amount){
        System.out.println("Removed Funds from Savings: " + amount);
        double newBal = checkBalance();
        newBal = newBal - amount;
        setSavings(newBal);
    }
        
}

