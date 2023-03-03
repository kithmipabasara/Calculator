/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Calculator {
    
    int number1;
    int number2;
    char oparator;
    
    
    public Calculator(int number1,int number2,char oparator){
        this.number1 = number1;
        this.number2 = number2;
        this.oparator = oparator;
        
        if (oparator == '+'){
            System.out.println(this.number1+ this.number2);
        }else if(oparator == '-') {
            System.out.println(this.number1 - this.number2);
        }else if (oparator == '*'){
            System.out.println(this.number1 * this.number2);
        }else{
            System.out.println(this.number1 / this.number2);
        }
    }
    
}
