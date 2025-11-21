import java.util.*;

/**
 * Write a description of class SumDivideMultiplySubtract here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumDivideMultiplySubtract
{
       public static void main(String[]arg)
       {
        Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum=a+b;
    System.out.println("the sum of two number is"+sum);
    int c=sc.nextInt();
    int d=sc.nextInt();
    int multiply= c*d;
    System.out.println("The multiplication of two number is"+multiply);
    int e=sc.nextInt();
    int f=sc.nextInt();
    int divide= e/f;
    System.out.println("The divide of two number is"+divide);    
   }
}