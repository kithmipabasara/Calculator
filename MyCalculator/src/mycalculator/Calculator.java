/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycalculator;

/**
 *
 * @author User
 */
class Calculator {

    int number1;
    int number2;
    private int sumvalue;
    private int substractval;
    private int dividval;
    private int multipleval;
    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
       

    }

    public int addition() {
        sumvalue = this.number1 + this.number2;
        return sumvalue;
    }

    public int substraction() {
        substractval = this.number1 - this.number2;
        return substractval;
    }

    public int division() {
        if (this.number1 != 0 && this.number2 != 0) {
            dividval = this.number1 / this.number2;
        } else {
            System.out.println("Invalied");
        }

        return dividval;
    }
     
    public int multiplication(){
       if (this.number1 != 0 && this.number2 != 0) {
            multipleval = this.number1 * this.number2;
        } else {
            System.out.println("Invalied");
        }

        return multipleval;  
    }
    
    
    }
