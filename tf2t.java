/**
 * Write a description of class TitForTat here.
 *
 * @author (toma)
 * @version (1.0)
 */
import java.util.Scanner;
public class tf2t
{
    // instance variables - replace the example below with your own
    float myMove[] = new float[20]; //this is the move that I take
    float compMove[] = new float[20]; //this is the move that the computer is programmed to take
    String myMovePrint;
    String compMovePrint;
    float myScore;
    float compScore;
    boolean flag;
    Scanner inputStream = new Scanner(System.in);
    /**
     * Constructor for objects of class TitForTat
     */
    public tf2t()
    {
        // initialise instance variables
        for(int moveNum = 0; moveNum < 3; moveNum++) {
            flag = false;
            System.out.println("What's your move, b or c?");
            String prompt = inputStream.nextLine();
            if(prompt.equals("b")) {
                myMove[moveNum] = 1;
            } else if (prompt.equals("c")) {
                myMove[moveNum] = 0;
            } else if (!prompt.equals("b") || !prompt.equals("c")){
                System.out.println("Try Again");
                moveNum -= 1;
                flag = true;
            }
            if(flag == false) {
                if(moveNum < 2) {
                    compMove[moveNum] = 0;
                } else if (moveNum >= 2) {
                    if(myMove[moveNum-2] == 1 || myMove[moveNum-1] == 1 ) {
                        compMove[moveNum] = 1;
                    }
                }
                
                if (myMove[moveNum] == 1) myMovePrint = "betrayed";
                if (myMove[moveNum] == 0) myMovePrint = "cooperated";
                if (compMove[moveNum] == 1) compMovePrint = "betrayed";
                if (compMove[moveNum] == 0) compMovePrint = "cooperated";
                System.out.println("You " + myMovePrint + " and the Computer " + compMovePrint);
                
                if (myMove[moveNum] == compMove[moveNum]) {myScore++; compScore++;}
                if (myMove[moveNum] > compMove[moveNum]) myScore += 3;
                if (myMove[moveNum] < compMove[moveNum]) compScore += 3;
            }
            System.out.println("My Score " + myScore + "   Comp Score " + compScore);
        }
        System.out.println("My Score " + myScore + "   Comp Score " + compScore);
    }
}