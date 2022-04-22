
import java.util.Random;

public class CreatePassword {
    public static void main(String[] args) {

        System.out.println(generatePassword(12));

    }

    private static String generatePassword(int passwordLength) {

        StringBuilder password = new StringBuilder();

        for (int i = 0; i <  passwordLength; i++)
            password.append(getRandomSymbol());

        return password.toString();

    }
    public static char getRandomSymbol() {
        var charArray = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        var numbersArray = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        var specialCharsArray = new char[] {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '{', '}', '[', ']', '|', '\\', ':', ';', '"', '\'', '<', ',', '>', '.', '?', '/'};
        var random = new Random();
        int w= random.nextInt(3);
        if (w == 0) {
            return charArray[random.nextInt(charArray.length)];
        }
        else if (w == 1) {
           return numbersArray[random.nextInt(numbersArray.length)];
        }
        else {
            return specialCharsArray[random.nextInt(specialCharsArray.length)];
        }
    }
    
}
