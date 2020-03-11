
/**
 * Write a description of class scanner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class DemoTry
{
    public DemoTry(){
        Scanner inputStream = new Scanner(System.in);
        File myFile=new File("hiThere.txt");
        try {
            Scanner readTheFile = new Scanner(myFile);
            while (readTheFile.hasNextLine()){
                System.out.println(readTheFile.nextLine());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}