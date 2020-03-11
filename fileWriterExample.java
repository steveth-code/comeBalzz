
/**
 * Write a description of class fileWriterExample here.
 *
 * @author (Thomas)
 * @version (version 1)
 */
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class fileWriterExample
{
    Scanner inputStream = new Scanner(System.in);
    public fileWriterExample()
    {
        String fileName = inputStream.nextLine();
        String textInputed = inputStream.nextLine();
        try {
            File file = new File ("writtenByJava.txt");
            FileWriter writing = new FileWriter(file);
            writing.write("Black");
            writing.write("Not Black");
            writing.flush();
            writing.close();
        } catch(IOException e) {};
    }
}
