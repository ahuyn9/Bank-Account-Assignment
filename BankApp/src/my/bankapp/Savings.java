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
    
    public double addInterest(){
        return (savBal * interest) + savBal;
    }
    
    public double checkBalance(){
        return savBal;
    }
    
}
