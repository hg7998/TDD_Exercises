public class StringCalculator {
    public int add(String numbers) {
        int firstNumber;
        int secondNumber;
        int delimiterPosition;
        int sum;

        if (numbers.length() == 0) {
            return 0;
        }

        firstNumber = Integer.parseInt(String.valueOf(numbers.charAt(0)));

        if (numbers.length() == 1) {
            return firstNumber;
        }
        else {
            delimiterPosition = numbers.indexOf(",");
            secondNumber = Integer.parseInt(String.valueOf(numbers.charAt(delimiterPosition+1)));
            sum = firstNumber + secondNumber;
        }
        return sum;
    }
}
