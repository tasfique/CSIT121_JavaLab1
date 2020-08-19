
package Question2;
import Question1.Score;
import java.util.*;

public class Student {
    private String name;
    private Score[] assignmentScore  = new Score[3];
    private Score[] labScore  = new Score[5];
    private Score finalmark;
    private String grade;
    
    private final double asgPercentage= 0.3;
    private final double labPercentage= 0.2;
    private final double examPercentage= 0.5;
    
    public Student (String name) { //non default constructor 
        this.name = name; 
    }
    
     public void setAssgScore(double mark, int num) {
        if(num<= 3 && num>= 1){
            assignmentScore[num-1].setDescription("Assignment"+num);
            assignmentScore[num-1].setScore((int)mark);
        }else{
            System.out.println("Invalid Assignment score");
        }
     }
        
       public void setLabScore(double mark, int num) {
        if(num<= 5 && num>= 1){
            labScore[num-1].setDescription("LabTask"+num);
            labScore[num-1].setScore((int)mark);
            
        }else{
            System.out.println("Invalid lab score");
        }
       
    }
      public void setFinalMark(int score){ //temporary
           finalmark.setScore(score);
       }
       
       public double calculateScore(){
           int sum1 = 0;
           for(int i=0; i<3; i++){
               int c = assignmentScore[i].getScore();
               sum1 = sum1 +c;
           }
           double averageAssgn =sum1/3;
           double score1 = averageAssgn + asgPercentage;
           
           int sum2 = 0;
           for(int i=0; i<5; i++){
               int c = labScore[i].getScore();
               sum2 = sum2 +c;
           }
           double averageLab = sum2/3;
           double score2 = averageLab + labPercentage;
           
           double averageFinalmark = finalmark.getScore();
           double score3 = averageFinalmark + examPercentage;
           
           double totalMark = score1 + score2 + score3;
           
           if (totalMark > 100 || totalMark < 0) {
               grade = "invalid score";
           }
           else if (totalMark >= 85) {
               grade = "HD";
           }
            else if (totalMark >= 75) {
               grade = "D";
           }
            else if (totalMark >= 65) {
               grade = "C";
           }
           else if (totalMark >= 50) {
               grade = "P";
           }
           else if (totalMark <= 49) {
               grade = "Fail";
           }
           
           else {
               grade = "Something went wrong, and i don't know";
           }
           
           return totalMark;
       }
       public String toString(){
           return "name"+ name;
       }
    
}
