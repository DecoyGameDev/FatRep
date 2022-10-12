import java.util.Scanner;
import java.util.Calendar;

public class Main {

    public static void Reverse(){
        Scanner reverse_scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = reverse_scanner.nextInt();
        System.out.println("Enter your number in reversed: ");
        int reversed = reverse_scanner.nextInt();

        System.out.println("Original Number: " + num);

        // run loop until num becomes 0
        while(num != 0) {

            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
    public static void Largest(){
        Scanner largest_scan = new Scanner(System.in);
        System.out.println("Input recipe steps for 1- ");
        int n1 = largest_scan.nextInt();
        System.out.println("Input recipe steps for 2- ");
        int n2 = largest_scan.nextInt();
        System.out.println("Input recipe steps for 3- ");
        int n3 = largest_scan.nextInt();

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
    public static void AddDates(){
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        Calendar cTotal = (Calendar) c1.clone();

        cTotal.add(Calendar.YEAR, c2.get(Calendar.YEAR));
        cTotal.add(Calendar.MONTH, c2.get(Calendar.MONTH) + 1); // Zero-based months
        cTotal.add(Calendar.DATE, c2.get(Calendar.DATE));
        cTotal.add(Calendar.HOUR_OF_DAY, c2.get(Calendar.HOUR_OF_DAY));
        cTotal.add(Calendar.MINUTE, c2.get(Calendar.MINUTE));
        cTotal.add(Calendar.SECOND, c2.get(Calendar.SECOND));
        cTotal.add(Calendar.MILLISECOND, c2.get(Calendar.MILLISECOND));

        System.out.format("%s + %s = %s", c1.getTime(), c2.getTime(), cTotal.getTime());
    }
    public static void VowlConsonent(){
        System.out.println("Edit source code to change char type for this function.");
        char ch = 'z';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
    public static void EvenerOdd(){
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a weight: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
    public static void Swap2Numbers(){
        Scanner swaptwonumbers = new Scanner(System.in);
        System.out.println("Whats the first number?");
        float first = swaptwonumbers.nextFloat();
        System.out.println("Second number?");
        float second = swaptwonumbers.nextFloat();
        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary
        float temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

    }

    public static void CalculateQuote(){
        Scanner calculateQuoteScanner = new Scanner(System.in);
        System.out.println("Enter your dividend");
        int dividend = calculateQuoteScanner.nextInt();
        System.out.println("Enter your divisor");
        int divisor = calculateQuoteScanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }

    public static void main(String[] args) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a recipe: ");

        // nextInt() reads the next integer from the keyboard
        int RECIPESELECTEDBYUSER = reader.nextInt();

        // println() prints the following line to the output screen
        System.out.println("You entered recipe: " + RECIPESELECTEDBYUSER);
        int recipeOrganicID = 12;
        int recipeOrganicFloat = 25;
        int RECIPEIDSUM = recipeOrganicFloat + RECIPESELECTEDBYUSER;
        System.out.println("Your new organic recipe ID: " + RECIPEIDSUM);
        System.out.println("Calculating float point ID number.");
        float RECIPE_ORGANIC_FLOATING_POINT = 25;
        float RECIPE_ORGANIC_ID_FLOATING_POINT = recipeOrganicID;
        float RECIPE_FLOATING_POINT_SUM = RECIPE_ORGANIC_FLOATING_POINT + RECIPE_ORGANIC_ID_FLOATING_POINT;
        System.out.println("Your floating point ID is : " + RECIPE_FLOATING_POINT_SUM);
        System.out.println("Converting Recipe to ASCII code?");
        char ASCII_RECIPE_ID = 'r';
        int INT_ASCII_RECIPE = ASCII_RECIPE_ID;
        System.out.println("The ASCII value of " + ASCII_RECIPE_ID + " is: " + INT_ASCII_RECIPE);
        Scanner nextactioncode2 = new Scanner(System.in);
        System.out.println("Please select next course of action in integer format.");
        System.out.println("1. Find Recipe Calculation");
        System.out.println("2. Swap your recipe numbers to increase unhealthiness");
        System.out.println("3. Is your weight even or odd?");
        System.out.println("4. Figure out if your recipes first letter is a vowel or consonant.");
        System.out.println("5. Check dates to track weight gain.");
        System.out.println("6. Find longest recipe out of 3.");
        System.out.println("7. Figure out your weight in reverse!");
        // PUT REST OF COMMANDS HERE
        int nextAction = nextactioncode2.nextInt();
        if (nextAction == 1){
            CalculateQuote();
        }
        if (nextAction == 2){
            Swap2Numbers();
        }
        if (nextAction == 3){
            EvenerOdd();
        }
        if (nextAction == 4){
            VowlConsonent();
        }
        if (nextAction == 5){
            AddDates();
        }
        if (nextAction == 6){
            Largest();
        }
        if (nextAction == 7){
            Reverse();
        }
    }
}
