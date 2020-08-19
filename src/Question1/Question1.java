
package Question1;
import java.util.*;

public class Question1 {
   
    public static void main(String[]args){
        
        Score score1 = new Score(); //object
        Score score2 = new Score(); //object2
        
        Scanner read = new Scanner(System.in);
        
        int score; //variable to store the score.
        
        System.out.println("Enter the Score1");
        score = read.nextInt();
        score1.setScore(score);

        System.out.println("Enter the Score2");
        score = read.nextInt();
        score2.setScore(score);
        
        System.out.println("--------------------------------------------------");
        System.out.println("The Score Entered is for 1st score is: "+score1.getScore());
        System.out.println("The Score Entered is for 2nd score is: "+score2.getScore());
        Score.Show();
        System.out.println("--------------------------------------------------");
        System.out.print("Enter the Maximum value: ");
        int NewMaxScr = read.nextInt();
        System.out.print("Enter the Minimum value: ");
        int NewMinScr = read.nextInt();
        Score.setMaximum(NewMaxScr);
        Score.setMinimum(NewMinScr);
        
        System.out.println("--------------------------------------------------");
        System.out.println("The Score Entered is for 1st score is: "+score1.getScore());
        System.out.println("The Score Entered is for 2nd score is: "+score2.getScore());
        Score.Show();
        System.out.println("--------------------------------------------------");
        
        
        
    }
    
}
