import java.util.Arrays;
import java.util.List;

public class StringCalculator {
    public int add(String numbers) throws NegativeNumberException {
        int number = 0;
        int sum = 0;
        boolean negativesFound = false;
        StringBuilder negatives = new StringBuilder();

        if (numbers.length() == 0) {
            return 0;
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == '-') {
                negativesFound = true;
                for (int j = i+1; j < numbers.length(); j++) {
                    try {
                        number = Integer.parseInt(String.valueOf(numbers.charAt(j)));
                        negatives.append("-").append(number).append(" ");
                    } catch (NumberFormatException nfe) {
                        break;
                    }
                }
            }
            else {
                try {
                    number = Integer.parseInt(String.valueOf(numbers.charAt(i)));
                    sum += number;
                } catch (NumberFormatException nfe) {
                    continue;
                }
            }
        }
        if (negativesFound) {
            throw new NegativeNumberException("Negatives not allowed: " + negatives);
        }
        return sum;
    }
}
