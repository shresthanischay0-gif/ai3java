import java.util.Scanner;

/**
 * Write a description of class NameClassAge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NameClassAge
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        String studentName=sc.nextLine();
        String className=sc.nextLine();
        int ageNumber=sc.nextInt();
        
        System.out.println("name"+studentName);
        System.out.println("class"+className);
        System.out.println("age"+ageNumber);
    }      
    
}