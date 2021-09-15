public class StringCalculator {
    public int add(String numbers) {
        int firstNumber = Integer.parseInt(String.valueOf(numbers.charAt(0)));
        int commaPosition = numbers.indexOf(",");
        int secondNumber = Integer.parseInt(String.valueOf(numbers.charAt(commaPosition+1)));

        return firstNumber+secondNumber;
    }
}
