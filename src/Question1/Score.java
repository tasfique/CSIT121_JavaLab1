
package Question1;


public class Score { //setting attributes.
    private String description;
    private int score;
    private static int MaxScr = 100;
    private static int MinScr = 0;

public Score () { //default constructor
    description = null;
    score = 0;
}

public void setDescription (String description) { //set method
    this.description = description;
    
}

public void setScore (int score) { //second set method
    if(score <= MaxScr && score >= MinScr) 
    {
        this.score = score;
       
    }
    else 
        score = MinScr;
}

String getDescription () { //get method
    return description; 
    
}

public int getScore () { //second get method
    return score;
}

public static void Show () {
    System.out.println(MaxScr + MinScr);
}

public void Display(){
     System.out.println("Maximum score is "+MaxScr);
     System.out.println("Minimum score is "+MinScr);
}

public static void setMinimum (int NewMinScr) {
    MinScr = NewMinScr;
}

public static void setMaximum (int NewMaxScr) {
    MaxScr = NewMaxScr;
    
}
    
}
