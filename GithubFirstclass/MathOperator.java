package GithubFirstclass;
import java.util.*;


/**
 * Write a description of class MathOperator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperator
{
 public static void main(String[] arg)
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a first number");
    int firstNumber = sc.nextInt();
    System.out.println("Enter a second number");
    int secondNumber = sc.nextInt();

    boolean greaterThan = (firstNumber > secondNumber);
    boolean equal = (firstNumber == secondNumber);
    boolean lessThan = (firstNumber < secondNumber);

    // OR condition
    boolean greaterOrEqual = (firstNumber > secondNumber) || (firstNumber == secondNumber);

    System.out.println("Is the first number greater than the second? " + greaterThan +
                       "\nAre both numbers equal? " + equal +
                       "\nIs the first number less than the second? " + lessThan +
                       "\nIs the first number greater OR equal to the second? " + greaterOrEqual);
}

}