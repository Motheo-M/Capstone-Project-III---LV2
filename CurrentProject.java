// Imported modules
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

// Class
public class CurrentProject {
    // Main method
    public static void main(String[] args){
        /*
           Project Input Details
           Allows user to enter the data for each question asked
           Try statement for ALL code
           Will execute catch statements for All code
        */
        try{

            // Try statements for main code
            // Will execute catch statements for this block only


            /*
               Read from list text file first then do the below
               Print the details in list format
               Menu class calling list method
            */
            Menu.menu();

            try {

                // BufferedWriter to text file
                BufferedWriter outputData = new BufferedWriter
                        (new FileWriter("properties.txt",true));

                /* Prints the menu option */
                String userInput = JOptionPane.showInputDialog("""
                    What do want to do:
                    Add new project to database - Type 1
                    To update the project details - Type 2
                    To check on unfinished or overdue project - Type 3
                    To exit - Type 4""");

                // Creates new project objects and adds them tho our text file
                switch (userInput) {
                    case "1" -> {

                        // Arraylist Object
                        List<String> arrayList = new ArrayList<>();

                        // Project Number
                        String numProject = JOptionPane.showInputDialog
                                ("What project number is this?");
                        // Project Name
                        String nameProject = JOptionPane.showInputDialog("""
                                What is project name?
                                If no name is provided, the name should
                                be the clients name + the building being
                                built. E.g. TylerHouse.""");
                        // Type of building
                        String buildingProject = JOptionPane.showInputDialog
                                ("What type of building is being built?");
                        // Physical address of new building
                        String physicalAddressProject =
                                JOptionPane.showInputDialog
                                ("What is the physical address" +
                                        " of the project building?");
                        // ERF Number of building
                        String erfProject = JOptionPane.showInputDialog
                                ("What is the ERF number of the building?");
                        // Total Fee for project
                        String totalFeeProject = JOptionPane.showInputDialog
                                        ("What is the total cost" +
                                                " of the project?");
                        // Fee paid to date for project
                        String paidToDateProject = JOptionPane.showInputDialog
                                        ("What is the cost paid so far" +
                                                " for the project to date?");
                        // Project deadline
                        String deadlineProject = JOptionPane.showInputDialog
                                ("When is the project deadline?");

                        // Project complete
                        String isCompleted = "No";

                        // Called the Project class and constructor
                        Project building = new Project(numProject,
                                nameProject, buildingProject,
                                physicalAddressProject, erfProject,
                                totalFeeProject, paidToDateProject,
                                deadlineProject, isCompleted);

                        // Architect details
                        // Allows user to enter the data for each question
                        /*
                        * Contains the following in order
                        * Architect's name
                        * Architect's telephone number
                        * Architect's email address
                        * Architect's physical address
                        */
                        String nameArchitect = JOptionPane.showInputDialog
                                ("What is the name of the Architect?");

                        String telephoneArchitect =
                                JOptionPane.showInputDialog
                                ("What is the phone number" +
                                        " of the Architect?");

                        String emailArchitect = JOptionPane.showInputDialog
                                ("What is the email address" +
                                        " of the Architect?");

                        String physicalAddressArchitect =
                                JOptionPane.showInputDialog
                                ("What is the physical address" +
                                        " of the Architect?");


                        // We call the Person architect constructor here
                        Persons architect = new Persons(nameArchitect,
                                telephoneArchitect, emailArchitect,
                                physicalAddressArchitect);

                        // Contractor details
                        // Allows user to enter the data for each question
                        /*
                         * Contains the following in order
                         * Contractor's name
                         * Contractor's telephone number
                         * Contractor's email address
                         * Contractor's physical address
                         */
                        String nameContractor = JOptionPane.showInputDialog
                                ("What is the name of the Contractor?");

                        String telephoneContractor =
                                JOptionPane.showInputDialog
                                ("What is the phone number" +
                                        " of the Contractor?");

                        String emailContractor = JOptionPane.showInputDialog
                                ("What is the email address" +
                                        " of the Contractor?");

                        String physicalAddressContractor =
                                JOptionPane.showInputDialog
                                ("What is the physical address" +
                                        " of the Contractor?");


                        // We call the Persons contractor constructor here
                        Persons contractor = new Persons(nameContractor,
                                telephoneContractor, emailContractor,
                                physicalAddressContractor);



                        // Customer details
                        // Allows user to enter the data for each question
                        /*
                         * Contains the following in order
                         * Customer's name
                         * Customer's telephone number
                         * Customer's email address
                         * Customer's physical address
                         */
                        String nameCustomer = JOptionPane.showInputDialog
                                ("What is the name of the Customer?");

                        String telephoneCustomer = JOptionPane.showInputDialog
                                ("What is the phone number of the Customer?");

                        String emailCustomer = JOptionPane.showInputDialog
                                ("What is the email address" +
                                        " of the Customer?");

                        String physicalAddressCustomer =
                                JOptionPane.showInputDialog
                                ("What is the physical address" +
                                        " of the Customer?");

                        // We call the Persons customer constructor here
                        Persons customer = new Persons(nameCustomer,
                                telephoneCustomer, emailCustomer,
                                physicalAddressCustomer);

                        // We call the Persons projectPeople constructor here
                        /* We add the following in the People class parameters
                            architect constructor,
                            contractor constructor
                            and customer constructor
                         */
                        People projectPeople = new People(architect,
                                contractor, customer);

                        // Add building and projectPeople
                        // constructors to arrayList
                        arrayList.add(String.valueOf(building));
                        arrayList.add(String.valueOf(projectPeople));

                        // Initialise StringBuilder
                        StringBuilder list = new StringBuilder();

                        // Add arrayList data to StringBuilder
                        for(String s : arrayList){
                            list.append(s);
                        }

                        // Write StringBuilder data to text file
                        outputData.write(list.toString());
                        outputData.write("\n");
                        outputData.close();
                    }

                    case "2" -> {

                        // Reads content of text file
                        FileReader inputFile =
                                new FileReader("properties.txt");
                        // Scans the FileReader
                        Scanner printFile = new Scanner(inputFile);

                        // Declared String variables
                        String line;
                        String[] lineArray;

                        // Declared ArrayList using Edit object
                        List<Edit> addList = new ArrayList<>();

                        while(printFile.hasNext()){

                            // Adds nextLine to Line variable
                            // Splits lines read in lineArray variable
                            line = printFile.nextLine();
                            lineArray = line.split(", ");

                            /*
                               Adds lineArray index data
                               to multiple Stringed variables
                            */

                            // Project details
                            String numProject = lineArray[0];
                            String nameProject = lineArray[1];
                            String buildingProject = lineArray[2];
                            String physicalAddressProject = lineArray[3];
                            String erfProject = lineArray[4];
                            String totalFeeProject = lineArray[5];
                            String paidToDateProject = lineArray[6];
                            String deadlineProject = lineArray[7];
                            String isCompleted = lineArray[8];

                            // Architect details
                            String nameArchitect = lineArray[9];
                            String telephoneArchitect = lineArray[10];
                            String emailArchitect = lineArray[11];
                            String physicalAddressArchitect = lineArray[12];

                            // Contractor details
                            String nameContractor = lineArray[13];
                            String telephoneContractor = lineArray[14];
                            String emailContractor = lineArray[15];
                            String physicalAddressContractor = lineArray[16];

                            // Customer details
                            String nameCustomer = lineArray[17];
                            String telephoneCustomer = lineArray[18];
                            String emailCustomer = lineArray[19];
                            String physicalAddressCustomer = lineArray[20];

                            // Edit object and constructor are called
                            Edit edit  = new Edit(numProject, nameProject,
                                    buildingProject, physicalAddressProject,
                                    erfProject, totalFeeProject,
                                    paidToDateProject, deadlineProject,
                                    isCompleted, nameArchitect,
                                    telephoneArchitect, emailArchitect,
                                    physicalAddressArchitect, nameContractor,
                                    telephoneContractor, emailContractor,
                                    physicalAddressContractor, nameCustomer,
                                    telephoneCustomer, emailCustomer,
                                    physicalAddressCustomer);

                            // ArrayList adds details from Edit object
                            addList.add(edit);
                        }

                        // Enter the name of the task you want to edit
                        String nameInput = JOptionPane.showInputDialog("""
                                Enter the project name task you want to edit:
                                """);


                        for(Edit editObject: addList){

                            // Adds editObject details to name variable
                            String name = String.valueOf(editObject);

                            // Allows us to choose a project by name2
                            if(name.startsWith(nameInput)){


                                // Menu to choose what we want to edit
                                String menu = JOptionPane.showInputDialog("""
                                        What do you want to edit:
                                        Updated Fee cost - Type 1
                                        Updated fee paid so far - Type 2
                                        New deadline for project - Type 3
                                        Project completed - Type 4
                                        Architect Details - Type 5
                                        Contractor Details - Type 6
                                        Customer Details - Type 7:
                                        """);

                                // If - else/if  statement
                                // Will be executed based on our menu choice

                                if (menu.equalsIgnoreCase("1")) {

                                    // Enter the new fee paid
                                    // so far for the project
                                    String newFee =
                                            JOptionPane.showInputDialog
                                            ("Enter new total price" +
                                                    " for the completion" +
                                                    " of the project: \n");
                                    editObject.setTotalFee(newFee);

                                } else if (menu.equalsIgnoreCase("2")) {

                                    // Enter the new fee paid
                                    // so far for the project
                                    String paidFee =
                                            JOptionPane.showInputDialog
                                            ("Enter new updated" +
                                                    " fee paid so far: \n");
                                    editObject.setPaidToDate(paidFee);

                                } else if (menu.equalsIgnoreCase("3")) {

                                    // Enter the new deadline for the project
                                    String date = JOptionPane.showInputDialog
                                            ("Enter a new deadline: \n");
                                    editObject.setDeadline(date);

                                } else if (menu.equalsIgnoreCase("4")) {

                                    String isCompleted =
                                            JOptionPane.showInputDialog("""
                                            Is the project complete?
                                            Yes - Type Y
                                            No - Type N
                                            """);
                                    String answer;

                                    // isCompleted will
                                    // execute nested conditional
                                    if (isCompleted.equals("Y")) {
                                        answer = "Yes";
                                    } else {
                                        answer = "No";
                                    }
                                    editObject.setComplete(answer);

                                } else if (menu.equalsIgnoreCase("5")) {

                                    String options =
                                            JOptionPane.showInputDialog("""
                                            Do you want to update
                                            the architects:
                                            Phone Number - Type 1
                                            Email - Type 2
                                            """);

                                    // If statement for phone number
                                    if (options.equalsIgnoreCase("1")) {

                                        // Ask the user to enter the
                                        // architects new phone numbers
                                        String number =
                                                JOptionPane.showInputDialog
                                                ("Enter new" +
                                                        " phone numbers: \n");
                                        editObject.setArchitectTelephoneNumber
                                                (number);

                                    } else if
                                    (options.equalsIgnoreCase("2")) {

                                        // Ask the user to enter the
                                        // architects new email address
                                        String address =
                                                JOptionPane.showInputDialog
                                                ("Enter new" +
                                                        " email address: \n");
                                        editObject.setArchitectEmail(address);
                                    }

                                } else if (menu.equalsIgnoreCase("6")) {

                                    String options =
                                            JOptionPane.showInputDialog("""
                                            Do you want to update
                                            the contractors:
                                            Phone Number - Type 1
                                            Email - Type 2
                                            """);

                                    // If statement for phone number
                                    if (options.equalsIgnoreCase("1")) {

                                        // Ask the user to enter the
                                        // contractors new phone numbers
                                        String number =
                                                JOptionPane.showInputDialog
                                                ("Enter new" +
                                                        " phone numbers: \n");
                                        editObject.
                                                setContractorTelephoneNumber
                                                        (number);

                                    } else if
                                    (options.equalsIgnoreCase("2")) {

                                        // Ask the user to enter the
                                        // contractors new email address
                                        String address =
                                                JOptionPane.showInputDialog
                                                ("Enter new" +
                                                        " email address: \n");
                                        editObject.setContractorEmail
                                                (address);
                                    }

                                } else if (menu.equalsIgnoreCase("7")) {

                                    String options =
                                            JOptionPane.showInputDialog("""
                                            Do you want to update
                                            the customers:
                                            Phone Number - Type 1
                                            Email - Type 2
                                            """);

                                    // If statement for phone number
                                    if (options.equalsIgnoreCase("1")) {

                                        // Ask the user to enter the
                                        // customers new phone numbers
                                        String number =
                                                JOptionPane.showInputDialog
                                                ("Enter new" +
                                                        " phone numbers: \n");
                                        editObject.setCustomerTelephoneNumber
                                                (number);

                                    } else if
                                    (options.equalsIgnoreCase("2")) {

                                        // Ask the user to enter the
                                        // customers new email address
                                        String address =
                                                JOptionPane.showInputDialog
                                                ("Enter new" +
                                                        " email address: \n");
                                        editObject.setCustomerEmail(address);

                                    }
                                }
                            }
                        }

                        // Initialise FileWriter
                        FileWriter writer = new FileWriter("properties.txt");

                        // Add arrayList data to editObject
                        for (Edit editObject : addList){

                            // Write altered details to text file
                            writer.write(editObject.toString() + "\n");
                        }

                        // Close Scanner and writer
                        writer.close();
                        printFile.close();

                    }

                    case "3" -> {

                        // Initialise FileReader
                        FileReader newFile;
                        try {
                            // Read content of text file
                            newFile = new FileReader("properties.txt");
                            // Scan newFile
                            Scanner checkFile = new Scanner(newFile);

                            // Declared string variable and array variable
                            String inputCheck;
                            String[] stringArray;

                            // Choose options available
                            String choice = JOptionPane.showInputDialog("""
                                Which do you want to see:
                                Incomplete projects - 1
                                Overdue and incomplete projects - 2
                                """);

                            if (choice.equalsIgnoreCase("1")) {

                                System.out.println("Check for" +
                                        " incomplete projects");

                                while (checkFile.hasNextLine()){

                                    // Read and splits each nextLine
                                    inputCheck = checkFile.nextLine();
                                    stringArray = inputCheck.split(", ");

                                    if(stringArray[8].equals("No")){

                                        // Prints all incomplete projects
                                        System.out.println
                                                (Arrays.toString
                                                        (stringArray));
                                    }
                                }

                            } else if (choice.equalsIgnoreCase("2")) {

                                System.out.println("Check for incomplete" +
                                        " and overdue projects");

                                while (checkFile.hasNextLine()) {

                                    // Read and splits each nextLine
                                    inputCheck = checkFile.nextLine();
                                    stringArray = inputCheck.split(", ");

                                    // Date in text file
                                    Date taskDate = new SimpleDateFormat
                                            ("dd MMM yyyy").
                                            parse(stringArray[7]);

                                    // Today's date
                                    Date date = new Date();

                                    if (stringArray[8].equals("No") && taskDate.before(date)) {

                                        // Prints all overdue
                                        // and incomplete projects
                                        System.out.println(Arrays.toString
                                                (stringArray));
                                    }
                                }
                            }
                        } catch (FileNotFoundException | ParseException e) {
                            System.out.println("File not found");
                            System.out.println("Parsing error");
                            e.printStackTrace();
                        }
                    }

                    // Ends Program
                    case "4" -> System.exit(0);
                }


            } catch (NullPointerException e) {

                // Null exception message if executed
                System.out.println("There is a null value");
                throw e;
            } catch (IOException e) {

                // File error message
                System.out.println("The file is not found");
                e.printStackTrace();
            }

        }
        catch(HeadlessException e) {
            // Headless exception message if executed
            System.out.println("You are in a HEADLESS environment");
            throw e;
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect user input");
            throw e;
        } catch (RuntimeException e) {
            // Runtime exception message if executed
            System.out.println("Runtime exceptions");
            throw e;
        }
    }
}




/* Reference
// https://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/
// https://www.oracle.com/za/technical-resources/articles/java/javadoc-tool
// https://www.baeldung.com/java-file-to-arraylist
// https://www.programiz.com/java-programming/
*/