/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printpayslip;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class PrintPaySlip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in); 
      System.out.println("Enter name :");
      String n=scn.next();
      System.out.println("Enter employee number :");
      String no=scn.next();
      System.out.println("Enter department :");
      String de=scn.next();
      System.out.println("Enter Employee type, Permanent[1]or Temporary[2] :");
      int t=scn.nextInt();
      if(t==1)
      {   System.out.println("Enter basic salary :");
           float b=scn.nextFloat();
           System.out.println("Number of overtime hours :");
           float h=scn.nextFloat();
          PermanentEmployee E1=new PermanentEmployee(n,no,de,b,h);
          E1.calsal();
          System.out.println(E1);}
      else{System.out.println("Enter number of days :");
           int d=scn.nextInt();
            TemporaryEmployee E2=new TemporaryEmployee(n,no,de,d);
            E2.calsal();
            System.out.println(E2);}
}}
