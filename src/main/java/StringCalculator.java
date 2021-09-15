public class StringCalculator {
    public int add(String numbers) {
        int number = 0;
        int sum = 0;

        if (numbers.length() == 0) {
            return 0;
        }

        for (int i = 0; i < numbers.length(); i++) {
            try {
                number = Integer.parseInt(String.valueOf(numbers.charAt(i)));
                sum += number;
            }
            catch(NumberFormatException nfe) {
                continue;
            }
        }

        return sum;
    }
}
