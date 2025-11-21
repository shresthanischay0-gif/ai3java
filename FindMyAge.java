import java.util.*;

/**
 * Write a description of class FindMyAge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FindMyAge
{
  public static void main(String[]arg)
  {
    Scanner sc=new Scanner(System.in);
    String studentName=sc.nextLine();
     String className=sc.nextLine();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int subtract=a-b;
       
       System.out.println("name"+studentName);
       System.out.println("class"+className);
       System.out.println("Student age"+subtract); 
  }
  
}