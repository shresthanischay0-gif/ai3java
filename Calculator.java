import java.util.*;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
   public static void main(String[]arg)
   {
        Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum=a+b;
    int multiply=a*b;
    int divide=a/b;
    int sub=a-b;
    System.out.println("the sum of two number is"+sum);
    System.out.println("the multiply of two number is"+multiply);
    System.out.println("the divition of two number is"+divide);
    System.out.println("the subtraction of two number is"+sub);
    
        
   }
}