import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aufgaben {
    public static void main(String[] args){

        // Methodendeklarationen zu den einzelnen Methoden in den Aufgaben unten in dieser Klasse.
        // Wenn Methoden ausgeblendet werden sollen, können diese einfach auskommentiert werden.
        // Mit Strg + Linksclick auf dem Methodennamen kann man zu den Methoden navigieren.

        // Aufgabe 1.1 Scanner
            textInputOutput();

        // Aufgabe 1.2: Formatting text output
            formattingTextOutput();

        // Aufgabe 1.3 Geometry
            geometry();


        // Datatypes & Variables
        // Aufgabe 2.1 Data Types
            dataTypes();

        // Aufgabe 2.2 Formatting Text(Bonus)
            System.out.println("\n\nAufgabe 2.2 Formatting Text(Bonus)\n");

            String input = "Everybody _said_, it can't be done. Then came one who did not #KNOW# that and just made it.";
            String output = formattingText(input);
            System.out.println(output);

        // Aufgabe 3.1
            System.out.println("\n\nAufgabe 3.1\n");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number of seconds: ");
            int numberOfSeconds = scanner.nextInt();

            System.out.println("Number of seconds: 244568879 are converted to (in years days hours minutes and seconds):");
            System.out.println(numberOfSecondsToYearsDaysHoursMinutesSeconds(numberOfSeconds));

        // Aufgabe 3.2
            cylinder();

        // Aufgabe 3.3 One line of Code
            oneLineOfCode();

        // Aufgabe 3.4 Metropolis
            System.out.println("\n\nAufgabe 3.4 Metropolis");

            metropolisChecker("München", true,1200000,1000);

        // Loops
        // Aufgabe 4.1 Guessing numbers
            guesstheNumber();

        // Aufgabe 4.2 Triangles
            triangles();

        //Aufgabe 4.3 Christmas tree
            christmasTree();
    }

    // Methoden zu den Aufgaben von oben hier

    // Methode zur Aufgabe 1.1 Text input and output

    public static void textInputOutput(){
        System.out.println("Aufgabe 1.1 Scanner");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name +", Welcome to the training!" );
    }

    // Methode zur Aufgabe 1.2 Ascii Print

    public static void formattingTextOutput(){

        System.out.println("\n\nAufgabe 1.2: Formatting text output\n");

        System.out.println( """
                      _______________                        |*\\_/*|________
                      |  ___________  |     .-.     .-.      ||_/-\\_|______  |
                      | |           | |    .****. .****.     | |           | |
                      | |   0   0   | |    .*****.*****.     | |   0   0   | |
                      | |     -     | |     .*********.      | |     -     | |
                      | |   \\___/   | |      .*******.       | |   \\___/   | |
                      | |___     ___| |       .*****.        | |___________| |
                      |_____|\\_/|_____|        .***.         |_______________|
                        _|__|/ \\|_|_.............*.............._|________|_
                       / ********** \\                          / ********** \\
                     /  ************  \\                      /  ************  \\
                    --------------------                    --------------------
                    
                    """
        );

    }


    // Methode zur Aufgabe 1.3 Geometry

    public static void geometry(){
        System.out.println("\n\nAufgabe 1.3 Geometry\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gebe die länge der erste Seite a eines Rechtecks bzw. der Ankathete eines rechtwinkligen Dreiecks an(Kommazahl (e.g. 2,5) erlaubt):");
        double sideA = scanner.nextDouble();

        System.out.println("Gebe die länge der zweiten Seite b eines Rechtecks bzw. der Gegenkathete an(Kommazahl (e.g. 2,5) erlaubt:");
        double sideB = scanner.nextDouble();

        double areaRectangle = sideA * sideB;
        System.out.println("Fläche des Rechtecks: " + areaRectangle);

        double perimeterRectangle = 2*sideA + 2*sideB;
        System.out.println("Umfang des Rechtecks: " + perimeterRectangle);

        double areaRightTriangle =  sideA * sideB * 0.5;
        System.out.println("Fläche des rechtwinkligen Dreiecks: " + areaRightTriangle);

        double perimeterRightTriangle =  Math.sqrt((Math.pow(sideA,2) + Math.pow(sideB,2)));
        System.out.println("Fläche des rechtwinkligen Dreiecks: " + perimeterRightTriangle);
    }

    // Methode zur Aufgabe 2.1

    public static void dataTypes(){
        System.out.println("\n\nAufgabe 2.1 Data Types");

        //Initals of my name

        System.out.println("Initials of my name as char since each of them is only one letter which can be stored in a" +
                " char as smallest data type to store it in (16 bit)");

        char myFirstNameInitial = 'T';
        System.out.println("My first name initial:  " + myFirstNameInitial);

        char myMiddleNameInitial = 'J';
        System.out.println("My middle name initial:  " + myMiddleNameInitial);

        char myLastNameInitial = 'T';
        System.out.println("My last name initial:  " +myLastNameInitial);

        /* Population of Germany. Int (32 bit) is the smallest that fits the population, as short (16 bit) is too small for it to fit.**/

        System.out.println("\nPopulation of Germany. Int (32 bit) is the smallest that fits the population," +
                " as short (16 bit) is to small for it to fit.");

        int populationOfGermany = 83862225;
        System.out.println("Population of Germany: " + populationOfGermany);


            /* Population of Earth. Since 2^31-1 (highest number in int) is roughly 1.6 billion and something, the population of Earth is to big to
                 fit in the int Datatype. So we have to use the next bigger Datatype to represent integers and that is long (64 bit) **/

        System.out.println(
                """
                   
                   Population of Earth. Since 2^31-1 (highest number in int) is roughly 1.6 billion and something,
                   the population of Earth is to big to fit in the int Datatype. So we have to use the next bigger 
                   Datatype to represent integers and that is long (64 bit).
                   """);

        long populationOfEarth = 8147701969L;
        System.out.println("Human population of Earth: " + populationOfEarth);

        /*Smallest Datatype to fit an yes/no answer is boolean (1-bit).**/

        System.out.println("\nSmallest Datatype to fit an yes/no answer is boolean (1 bit).\n");

        boolean isDayTime = true;
        System.out.println("Is it day time? " + isDayTime);


            /* Goal strike quote of Mario gomez will very likely be an number between 0 and 1, so we have to use float (32 bit)
                since it is the smallest datatype in Java for floating point numbers. **/

        System.out.println("""
                        
                        Goal strike quote of Mario gomez will very likely be an number between 0 and 1,
                        so we have to use float (32 bit) since it is the smallest datatype in Java for floating point numbers.
                        """);

        float marioGomezGoalStrikeQuoteAtFCB = 0.65217f;
        System.out.println("Mario Gomez goal strike quote as player for FC Bayern München: " + marioGomezGoalStrikeQuoteAtFCB + " goals per game.");

            /*Length of the Java Programm in weeks. Since it is about 16 weeks long including the pre-studies. It fits in
                the smallest numerical DataType, which is Byte (8 bit). **/

        System.out.println("""
                        
                        Length of the Java Programm in weeks. Since it is about 16 weeks long
                        including the pre-studies. It fits in the smallest numerical DataType, which is Byte (8 bit).
                        """);

        byte javaProgramLengthInWeeks = 14;
        System.out.println("Java Bootcamp Länge in Wochen: " + javaProgramLengthInWeeks);

            /* The mathematical number PI. Doesn't really fit in any datatype since it's information size is infinite.
                 An good enough approximation fits in float. For higher precision it is recommended to use double or BigDecimal. **/

        System.out.println("""
                        
                        The mathematical number PI. Doesn't really fit in any datatype since it's information size is infinite. 
                        An good enough approximation fits in float (maximal 6-7 digits). For higher precision it is recommended 
                        to use double (64 bit) or BigDecimal (varies in size, object).
                        """);

        final float PI = 3.14159f; //Final Constants are written in Caps
        System.out.println("Value of pi in float: " + PI);
    }


    // Methode zur Aufgabe 2.2 Formatting text (bonus excercise)
    public static String formattingText(String text){
        String[] words = text.split(" ");
        List<String> resultingWords = new ArrayList<>();
        for(String word : words){

            if(word.contains("#")){
                String[] wordArray = word.split("#");
                resultingWords.add(wordArray[1].toLowerCase());

            } else if (word.contains("_")) {
                String[] wordArray = word.split("_");
                resultingWords.add(wordArray[1].toUpperCase());
            } else {
                resultingWords.add(word);
            }
        }


        return String.join(" ",resultingWords);
    }


    // Methode zur Aufgabe 3.1 Time units

    public static String numberOfSecondsToYearsDaysHoursMinutesSeconds(int numberOfSeconds){
        int numberOfYears = numberOfSeconds / 31536000;
        int numberOfSecondsRemainingAfterYearsSubtracted = numberOfSeconds  % 31536000;
        int numberOfDays = numberOfSecondsRemainingAfterYearsSubtracted / 86400;
        int numberOfSecondsRemainingAfterYearsAndDays = numberOfSecondsRemainingAfterYearsSubtracted % 86400;
        int numberOfHours = numberOfSecondsRemainingAfterYearsAndDays / 3600;
        int numberOfSecondsRemainingAfterYearsDaysHours = numberOfSecondsRemainingAfterYearsAndDays % 3600;
        int numberOfMinutes = numberOfSecondsRemainingAfterYearsDaysHours / 60;
        int remainingNumberOfSeconds = numberOfSecondsRemainingAfterYearsDaysHours % 60;

        return numberOfYears + " years and "
                + numberOfDays + " days and "
                + numberOfHours + " hours and "
                + numberOfMinutes + " minutes and "
                + remainingNumberOfSeconds + " seconds.";
    }


    // Methode zur Aufgabe 3.2 Cylinder
    public static void cylinder(){
        System.out.println("\n\nAufgabe 3.2\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the circumference of your cylinder: ");
        double circumference = scanner.nextDouble();
        System.out.println("Choose the height of your cylinder: ");
        double height = scanner.nextDouble();

        System.out.println("The diameter of the cylinder is: ");
        double diameter = circumference / Math.PI;
        System.out.println(diameter);

        System.out.println("The area of the lid of the cylinder is: ");
        double areaOfLid = Math.PI * (diameter /2 ) * (diameter / 2);
        System.out.println(areaOfLid);

        System.out.println("The area of the Casing of the cylinder is: ");
        double areaOfCasing = circumference * height;
        System.out.println(areaOfCasing);

        System.out.println("Total required sheet area for the cylinder: ");
        double areaTotal = 2* areaOfLid + areaOfCasing;
        System.out.println(areaTotal);

        System.out.println("The Volume of the cylinder is: ");
        double volumeCylinder = areaOfLid * height;
        System.out.println(volumeCylinder);
    }


    // Methoder zur Aufgabe 3.3

    public static void oneLineOfCode(){
        System.out.println("\n\nAufgabe 3.3 One line of Code\n");

        double inOneLine =  ((Math.sqrt(3.5 +15.5)*5)/3) - ((15.5 + 10) * (15.5 - 4.1));
        System.out.println("The result of the calculation in one line is: ");
        System.out.println(inOneLine);
    }
    // Methode zur Aufgabe 3.4 Metropolis (Bonus excercise)

    public static void metropolisChecker(String nameOfCity, boolean isCapital, int population, double taxPerPerson) {
        boolean isMetropolis = false;
        double annualTaxIncome = population* taxPerPerson;

        if(!isCapital){
            if(population > 200000 && annualTaxIncome>=1000000000){
                isMetropolis = true;

            }
        }
        else {
            if(population>100000){
                isMetropolis = true;
            }
        }

        if(!isMetropolis){
            System.out.println("Name of the City: " + nameOfCity);
            System.out.println("Is " + nameOfCity + "a capitol('true' or 'false')?\n" + isCapital);
            System.out.println("What is the population of "  + nameOfCity + "?\n" + population);
            System.out.println("Tax income per inhabitant " + taxPerPerson);
            System.out.println();
            System.out.println(nameOfCity + "is no metropolis");
        }

        if(isMetropolis && isCapital){
            System.out.println("Name of the City: " + nameOfCity);
            System.out.println("Is " + nameOfCity + "a capitol('true' or 'false')?\n" + isCapital);
            System.out.println("What is the population of "  + nameOfCity + "?\n" + population);
            System.out.println("Tax income per inhabitant " + taxPerPerson);
            System.out.println();
            System.out.println(nameOfCity + "is a metropolis, because it is a capital with a population of " + 120000);
        }
        if (isMetropolis && !isCapital ){
            System.out.println("Name of the City: " + nameOfCity);
            System.out.println("Is " + nameOfCity + "a capitol('true' or 'false')?\n" + isCapital);
            System.out.println("What is the population of "  + nameOfCity + "?\n" + population);
            System.out.println("Tax income per inhabitant " + taxPerPerson);
            System.out.println();
            System.out.println(nameOfCity + "is a metropolis, because it has a population of " + population
                    +" and a annual tax income of " + annualTaxIncome +"€");
        }
    }

    // Methode zur Aufgabe 4.1 Guessing the numbers

    public static void guesstheNumber(){
        System.out.println("\n\nAufgabe 4.1 Guessing numbers\n");

        int randomNumberToGuess = (int) (Math.random() * 99) +1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("You must guess a number between 1 and 100 ");
        int guessedNumber = scanner.nextInt();

        while(guessedNumber != randomNumberToGuess){

            if(guessedNumber < randomNumberToGuess){
                System.out.println("Your number is smaller than the number to guess");
                System.out.println("Guess again bigger this time: ");
                guessedNumber = scanner.nextInt();
            }

            if(guessedNumber > randomNumberToGuess){
                System.out.println("Your number is bigger than then number to guess");
                System.out.println("Guess again smaller this time: ");
                guessedNumber = scanner.nextInt();
            }

        }

        System.out.println("Congratulation! You guessed the right number");
    }


    // Methode für Aufgabe 4.2 Triangles

    public static void triangles(){
        System.out.println("\n\nAufgabe 4.2 Triangles\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("How large should the triangle be?");
        int sizeOfTriangle = scanner.nextInt();

        System.out.println("How many triangles would you like?");
        int numberOfTriangles = scanner.nextInt();

        String triangle = "";

        for(int i=0; i<sizeOfTriangle; i++){
            triangle += "*".repeat(i + 1) + "\n";
        }

        for(int j=0; j<numberOfTriangles; j++){
            System.out.println(triangle);
            System.out.println();
            System.out.println();
        }

    }

    // Methode für Aufgabe 4.3 Christmas tree (Bonus)

    public static void christmasTree(){
        System.out.println("\n\nAufgabe 4.3 Christmas tree\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many lines high should the treetop be?");
        int numberOfLines = scanner.nextInt();

        for(int i=0; i<numberOfLines; i++){

            System.out.println(" ".repeat(numberOfLines-i) + "*".repeat(2*i+1) + " ".repeat(numberOfLines - i));
        }
        System.out.println(" ".repeat(numberOfLines-1)+ "I" + " ".repeat(numberOfLines-1));
    }
}
