/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mycalculator;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MyCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.print("enter number 1 ");
        int number1 = myscanner.nextInt();
        System.out.print("enter oparation ");
        String oparator = myscanner.next();

        System.out.print("enter number 2 ");
        int number2 = myscanner.nextInt();

        SentificCalculator sc1 = new SentificCalculator(number1, number2);

        switch (oparator) {

            case "+":
                System.out.println(sc1.addition());
                break;
            case "-":
                System.out.println(sc1.substraction());
                break;
            case "*":
                System.out.println(sc1.multiplication());
                break;
            case "/":
                System.out.println(sc1.division());
                break;

            case "squreroot":
                System.out.println(sc1.Squareroot());
                break;
            case "squre":
                System.out.println(sc1.squreValue());
                break;
            case "cube":
                System.out.println(sc1.CubeValue());
                break;
            case "cos":
                System.out.println(sc1.cosvalue());
                break;
            case "sin":
                System.out.println(sc1.sinvalue());
                break;
            default:
                System.out.println(sc1.tanvalue());

        }

        switch (oparator) {

        }

    }

}
