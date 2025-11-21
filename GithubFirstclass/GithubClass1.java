package GithubFirstclass;
import java.util.*;


/**
 * Write a description of class GithubClass1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GithubClass1
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
    int modulus=a%b;
    System.out.println("the sum of two number is"+sum);
    System.out.println("the multiply of two number is"+multiply);
    System.out.println("the divition of two number is"+divide);
    System.out.println("the subtraction of two number is"+sub);
    System.out.println("the modulus of two number is"+modulus);
    }
}