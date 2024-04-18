import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aufgaben {
    public static void main(String[] args){

        //Scanner  Aufgabe

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name +", Welcome to the training!" );


        //Aufgabe 2: Formatting text output

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
--------------------                    --------------------"""
        );

        //Aufgabe 3:

        System.out.println("Gebe die länge der erste Seite a eines Rechtecks bzw. der Ankathete eines rechtwinkligen Dreiecks an(Kommazahl (e.g. 2,5) erlaubt):");
        double sideA = scanner.nextDouble();
        System.out.println("Gebe die länge der zweiten Seite b eines Rechtecks bzw. der Gegenkathete an(Kommazahl (e.g. 2,5) erlaubt:");
        double sideB = scanner.nextDouble();

        double areaRectangle = sideA * sideB;
        double perimeterRectangle = 2*sideA + 2*sideB;
        double areaRightTriangle =  sideA * sideB * 0.5;
        double perimeterRightTriangle =  Math.sqrt((Math.pow(sideA,2) + Math.pow(sideB,2)));
        System.out.println("Fläche des Rechtecks: " + areaRectangle);
        System.out.println("Umfang des Rechtecks: " + perimeterRectangle);
        System.out.println("Fläche des rechtwinkligen Dreiecks: " + areaRightTriangle);
        System.out.println("Fläche des rechtwinkligen Dreiecks: " + perimeterRightTriangle);


        //Aufgabe 2.1
        //Initals of My Name
        char myFirstNameInitial = 'T';
        char myMiddleNameInitial = 'J';
        char myLastNameInitial = 'T';
        // Population of Germany. Int is the smallest that fits the population, as short is to small for it to fit.
        int populationOfGermany = 83000000;
        // Population of Earth. Since 2^31-1 is roughly 1.6 billion and something, the population of Earth is to big to
        // fit in the int Datatype. So we have to use the next bigger Datatype to represent integers and that is Long
        long populationOfEarth = 8000000000L;
        //Smallest Datatype to fit an yes/no answer is boolean. Which could be 1bit, but is 1byte do to how memory is allocated.
        boolean isDayTime = true;
        // Goal strike quote of Mario gomez will very likely be an number between 0 and 1, so we have to use float since
        //it is the smallest datatype for floating point numbers
        float marioGomezBayernMunichGoalStrikeQuote = 0.65217f;

        //Length of the Java Programm in weeks. Since it is about 16 weeks long including the pre-studies. It fits in
        //the smallest numerical DataType, which is byte.
        byte javaProgramLengthInWeeks = 12;
        // The mathematical number PI. Doesn't really fit in any datatype since it's information size is infinite.
        // An good enough approximation fits in float. For higher precision it is recommended to use double.
        float PI = 3.14159f;

        //Aufgabe 2.2 (Bonus)

        String input = "Everybody _said_, it can't be done. Then came one who did not #KNOW# that and just made it.";
        String output =   formattingText(input);
        System.out.println(output);

        System.out.println("Enter a number of seconds: ");
        int numberOfSeconds = scanner.nextInt();
        System.out.println(numberOfSecondsToYearsDaysHoursMinutesSeconds(numberOfSeconds));


        //Aufgabe 3.1

        System.out.println("Number of seconds: 244568879 are converted to (in years days hours minutes and seconds):");
        System.out.println(numberOfSecondsToYearsDaysHoursMinutesSeconds(244568879));

        //Aufgabe 3.2

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

        //Aufgabe 3.3 One line of Code

        double inOneLine =  ((Math.sqrt(3.5 +15.5)*5)/3) - ((15.5 + 10) * (15.5 - 4.1));
        System.out.println("The result of the calculation in one line is: ");
        System.out.println(inOneLine);

        //Aufgabe 3.4 Metropolis

        metropolisChecker("München", true,1200000,1000); //Methodendeklaration weiter unten


        // Loops
        //Aufgabe 4.1 Guessing numbers

        guesstheNumber(); //Methodendeklaration weiter unten

        //Aufgabe 4.2

        triangles(); //Methodendeklaration weiter unten
        


    }


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

    public static String numberOfSecondsToYearsDaysHoursMinutesSeconds(int numberOfSeconds){
        int numberOfYears = numberOfSeconds / 31536000;
        int numberOfSecondsRemainingAfterYearsSubtracted = numberOfSeconds  % 31536000;
        int numberOfDays = numberOfSecondsRemainingAfterYearsSubtracted / 86400;
        int numberOfSecondsRemainingAfterYearsAndDays = numberOfSecondsRemainingAfterYearsSubtracted % 86400;
        int numberOfHours = numberOfSecondsRemainingAfterYearsAndDays / 3600;
        int numberOfSecondsRemainingAfterYearsDaysHours = numberOfSecondsRemainingAfterYearsAndDays % 3600;
        int numberOfMinutes = numberOfSecondsRemainingAfterYearsDaysHours / 60;
        int remainingNumberOfSeconds = numberOfSecondsRemainingAfterYearsDaysHours % 60;

        String result = numberOfYears +" years and " + numberOfDays + " days and " + numberOfHours + " hours and "
                + numberOfMinutes + " minutes and " + remainingNumberOfSeconds + " seconds.";

        return result;
    }

    public static void metropolisChecker(String name, boolean isCapital, int population, double taxPerPerson) {
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
            System.out.println("Name of the City: " + name);
            System.out.println("Is Bielefeld a capitol('true' or 'false')?\n" + isCapital);
            System.out.println("What is the population of "  + name + "?\n" + population);
            System.out.println("Tax income per inhabitant " + taxPerPerson);
            System.out.println();
            System.out.println(name + "is no metropolis");
        }

        if(isMetropolis && isCapital){
            System.out.println("Name of the City: " + name);
            System.out.println("Is Bielefeld a capitol('true' or 'false')?\n" + isCapital);
            System.out.println("What is the population of "  + name + "?\n" + population);
            System.out.println("Tax income per inhabitant " + taxPerPerson);
            System.out.println();
            System.out.println(name + "is a metropolis, because it is a capital with a population of " + 120000);
        }
        if (isMetropolis && !isCapital ){
            System.out.println("Name of the City: " + name);
            System.out.println("Is Bielefeld a capitol('true' or 'false')?\n" + isCapital);
            System.out.println("What is the population of "  + name + "?\n" + population);
            System.out.println("Tax income per inhabitant " + taxPerPerson);
            System.out.println();
            System.out.println(name + "is a metropolis, because it has a population of " + population
                    +" and a annual tax income of " + annualTaxIncome +"€");
        }
    }

    public static void guesstheNumber(){
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

    public static void triangles(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How large should the triangle be?");
        int sizeOfTriangle = scanner.nextInt();

        System.out.println("How many triangles would you like?");
        int numberOfTriangles = scanner.nextInt();

        String triangle = null;

        for(int i=0; i<sizeOfTriangle; i++){
            triangle += "*".repeat(i + 1) + "\n";
        }

        for(int j=0; j<numberOfTriangles; j++){
            System.out.println(triangle);
            System.out.println();
        }

    }
}