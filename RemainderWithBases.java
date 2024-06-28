import java.util.*; //imports util

public class RemainderWithBases
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //creates new scanner

        //asks for bases
        System.out.print("Enter the number in base 10: ");
        int number = scanner.nextInt();

        System.out.print("Enter the new base between 2 and 16: ");
        int newBase = scanner.nextInt();

        //checks that the new base is between 2 and 16
        if (newBase < 2 || newBase > 16) {
            System.out.println("Please enter a base between 2 and 16.");
            return;
        }

        //converts the new base to a string
        String result = convertToNewBase(number, newBase);
        System.out.println("Conversion result: " + result);

        scanner.close();
    }

    //method to convert number to another base from base 10
    private static String convertToNewBase(int number, int base) {
        if (number == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();  //new string to hold result
        
        while (number > 0) {
            int remainder = number % base;
            char digit = (remainder < 10) ? (char) ('0' + remainder) : (char) ('A' + remainder - 10);
            result.insert(0, digit); //inserts digit at the beginning of string
            number /= base;
        }

        return result.toString(); //returns string
    }
}
/* Sample Output
Enter the number in base 10: 8
Enter the new base between 2 and 16: 4
Conversion result: 20

Enter the number in base 10: 9
Enter the new base between 2 and 16: 8
Conversion result: 11

Enter the number in base 10: 6
Enter the new base between 2 and 16: 4
Conversion result: 12

Enter the number in base 10: 6
Enter the new base between 2 and 16: 3
Conversion result: 20

Enter the number in base 10: 4
Enter the new base between 2 and 16: 7
Conversion result: 4
 * 
 */
