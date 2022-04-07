/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.bankapp;

/**
 *
 * @author mdoan3
 */
public class Chequing {
    protected double cheqBal = 0;
    
    public double checkBalance(){
        return cheqBal;
    }
    
    public void addFunds(double amount){
        System.out.println("Added Funds");
        this.cheqBal += amount;
    }
    
    public void removeFunds(double amount){
        System.out.println("Removed Funds");
        this.cheqBal -= amount;
    }
}
