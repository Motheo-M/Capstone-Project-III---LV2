// Imported modules
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

// Class
public class Menu {
    // Static
    static void menu() {
        // Try - catch statement
        try {

            // FileReader and scanner
            FileReader reader = new FileReader("properties.txt");
            Scanner scanner = new Scanner(reader);

            // Declared String variables
            String line;
            String[] lineArray;

            // While loop
            while(scanner.hasNext()){

                // Read lines added to string variable and splits them
                scanner.hasNextLine();
                line = scanner.nextLine();
                lineArray = line.split(", ");

                // Looped Menu items
                // Called Creation object and constructor
                Creation create = new Creation(lineArray[0], lineArray[1],
                        lineArray[2], lineArray[3], lineArray[4],
                        lineArray[5], lineArray[6], lineArray[7],
                        lineArray[8], lineArray[9], lineArray[10],
                        lineArray[11], lineArray[12], lineArray[13],
                        lineArray[14], lineArray[15], lineArray[16],
                        lineArray[17], lineArray[18], lineArray[19],
                        lineArray[20]);

                // Prints out toString
                System.out.println(create);

            }


        } catch (FileNotFoundException e) {
            // Prints in case file is not found.
            System.out.println("File is not found!");
            e.printStackTrace();
        }

    }
}

