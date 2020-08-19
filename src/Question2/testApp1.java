package Question2;
import java.util.Scanner;


public class testApp1 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the name");
        String name = in.nextLine();
        Student s1 = new Student(name);
        
        System.out.print("Enter the score of assignment 1");
        int asgScore1 = in.nextInt();
        System.out.print("Enter the score of assignment 2");
        int asgScore2 = in.nextInt();
        System.out.print("Enter the score of assignment 3");
        int asgScore3 = in.nextInt();
        s1.setAssgScore(asgScore1, 1);
        
        
        
    }
    
}
