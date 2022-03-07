/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doc;
import java.util.Scanner;
import doc.AdvancedWeek;

/**
 *
 * @author ASUS
 */
public class Employee2 {
    public static void main(String [] args) {
      Scanner sc= new Scanner(System.in);
      int num,num1,num2,ans;
      String op;
      System.out.print("Which sevice would you like to use? \n [1]: Basic week visualizer \n [2]: Advanced week visualizer \n [3]: Basic calculator \n [4]: Employee repertoire" );
       num= sc.nextInt();
       
       if (num ==1) 
       {Basicweek days= new Basicweek ();
      days.printDays();
       }
       else if (num==2)
       {AdvancedWeek advday= new AdvancedWeek ();
       advday.printDays();
       }
       else if (num==3)
       { System.out.print("Input the first number:");
               num1 = sc.nextInt();
         System.out.print("Input the Operator:"); 
             op = sc.next();
             System.out.print("Input the second number:");
             num2 =sc.nextInt();
          if (op.equals("+")) {ans=num1+num2;
          System.out.print(num1 + op + num2 +"="+ ans); }
          else if (op.equals("-")) {ans=num1-num2;
          System.out.print(num1 + op + num2 +"="+ ans); }
          else if (op.equals("*")) {ans=num1*num2;
          System.out.print(num1 + op + num2 +"="+ ans); }
          else if (op.equals("/")) {ans=num1/num2;
          System.out.print(num1 + op + num2 +"="+ ans); }
            
           Calculator calc= new Calculator ();
       
       
       }
       
}
}