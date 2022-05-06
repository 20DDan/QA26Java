public class Main {

    public static void main(String[] args) {
        System.out.println("This Is My First JAva Project ... NOT!");
        System.out.println("Hello World!");

//LAB 11 EXERCISE 3
        System.out.println("Lab 11 Exercise 3 Check Bigger Number");
        LogicalOperations op = new LogicalOperations();
        double grandest = op.checkBiggerNumber(5, 9000);
        float massive = op.checkBiggerNumber(10001, -900000);
        int biggest = op.checkBiggerNumber(56, 51);
        System.out.println(biggest);
        System.out.println(massive);
        System.out.println(grandest);

        String Mihai;
        String Ionel;
        String Ghita;


        System.out.println(" Mihai &" + " Ionel &" + " Gusti" + " toti au mers la piata");

        Calculator myCalculator = new Calculator();


        double A = 57;
        double B = 4;

        System.out.println("A added to B");
        System.out.println(A + B);
        System.out.println("A multiplied by B Listed Below");
        System.out.println(A * B);
        System.out.println("A divided by B Listed Below");
        System.out.println(A / B);
        System.out.println("Part A Method 1 Directly Displayed");
        System.out.println(-5 + 8 * 6);
        System.out.println("Part A Method 2 using Sum");
        System.out.println(myCalculator.add(-5, 8 * 6));
        System.out.println("Part B");
        System.out.println(myCalculator.add(55, 9 / 9f));
        System.out.println("Part C");
        System.out.println(myCalculator.add(20, -3 * 5f / 8));
        System.out.println("Part D");
        System.out.println(myCalculator.add(5, 15 / 3f * 2 - 8f / 3));

        System.out.println("Result from adding 2 numbers together");
        System.out.println(myCalculator.add(57, 7));
        System.out.println("Result from subtracting 2 numbers together");
        System.out.println(myCalculator.subtract(695, 7));
        System.out.println("Result from multiplying 2 numbers together");
        System.out.println(myCalculator.multiply(467, 567));
        System.out.println("Result from dividing 2 numbers together");
        System.out.println(myCalculator.divide(456, 45));

        System.out.println("Exercise 3 - JAVA");
        printJava();
        System.out.println("Exercise 5 -  Robot Face");
        printRobot();

        double a = 5006;
        double b = 795;
        double c = 465;

        System.out.println("Exercise 4 - This shows 3 numbers added and average of them");
        System.out.println(averageNumbers(a, b, c));

        System.out.println("Exercise 6 - This is the result of remainder of two numbers");
        System.out.println(myCalculator.moduloRest(300, 549));

        System.out.println("Exercise 7 - This is Fahrenheit to Celcius conversion");
        System.out.println(convertTemp(70));

        System.out.println("Exercise 8 - This is USA inches to Global Centimeters conversion");
        System.out.println(convertImperialToMetric(13));


        System.out.println("Exercise 9 - Conversion MPS, KPH, MPH");
        conversionHell(2004, 24, 7, 1);


    }

    //LAB 11 EXERCISE
    public static String textComparison(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";

        } else

            return "Got to try some more";
    }

    // LAB 10 EXERCISE 4 AVERAGE
    public static double averageNumbers(double nr1, double nr2, double nr3) {
        double result = (nr1 + nr2 + nr3) / 3;
        return result;
    }

    public static void printRobot() {
        System.out.println("  +'''''+ ");
        System.out.println(" [| o o |]  ");
        System.out.println("  |  ^  |  ");
        System.out.println("  | '_' |  ");
        System.out.println("  +_____+  ");

    }


    // LAB 10 EXERCISE 8
    public static double convertImperialToMetric(double imperialLength) {
        double centimeter = imperialLength * 2.54;
        return centimeter;

    }

    // LAB 10 EXERCISE 7 TEMPERATURE CHANGE
    public static double convertTemp(double fahrenheit) {
        double celcius = (5 / 9f * (fahrenheit - 32));
        return celcius;
    }

    // LAB 10 EXERCISE 3 WRITE JAVA
    public static void printJava() {
        System.out.println("   J   A   V     V     A");
        System.out.println("   J  A A   V   V     A A");
        System.out.println("   J  AAAA   V V     AAAAA");
        System.out.println("J  J A   A    V     A     A");
        System.out.println(" J  A     A   V    A        A");
    }

    // LAB 10 EXERCISE 9 CONVERSIONS
    public static void conversionHell(
            double distanceInMeters, double timeSecond, double timeMinute, double timeHour) {
        double totalTimeInSeconds = (timeHour * 60 * 60) + (timeMinute * 60) + timeSecond;
        double metersPerSecond = distanceInMeters * totalTimeInSeconds;

        System.out.println("Exercise 9 showing Meters Per Second");
        System.out.println(metersPerSecond);
        double totalTimeInHours = timeHour + timeSecond / 60 / 60 + timeMinute / 60;
        double distanceInKilometers = distanceInMeters / 1000;
        double kilometersPerHour = totalTimeInHours * distanceInKilometers;

        System.out.println("Exercise 9 showing Kilometers per hour");
        System.out.println(kilometersPerHour);
        double distanceInMiles = distanceInKilometers * 1.609;
        double milesPerHour = distanceInMiles * totalTimeInHours;

        System.out.println("Exercise 9 Showing Miles Per Hour");
        System.out.println(milesPerHour);
    }


}