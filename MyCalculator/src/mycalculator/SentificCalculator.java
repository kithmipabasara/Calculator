/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycalculator;
import java.lang.Math;

/**
 *
 * 
 * @author User
 */
public class SentificCalculator extends Calculator {
    
    int number3;
    
    
    public SentificCalculator(int number1, int number2){
        super(number1,number2);
        this.number3 = number1;
    }
    
     public double Squareroot(){
          return (Math.pow( number3,0.5));
     }
    public int squreValue(){
        return (this.number3 * this.number3);
    } 
    
    public int CubeValue(){
        return (this.number3 * this.number3 * this.number3);
    } 
    public double cosvalue(){
        return Math.cos(number3);
    }
     public double sinvalue(){
        return Math.sin(number3);
    }
     
      public double tanvalue(){
        return Math.tan(number3);
    }
}
