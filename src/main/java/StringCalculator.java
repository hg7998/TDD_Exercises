public class StringCalculator {

    public int add(String numbers) throws NegativeNumberException {
        boolean negativesFound = false;
        int number = 0;
        int sum = 0;
        StringBuilder negatives = new StringBuilder();
        String delimiter = "";
        String[] numbersArray;

        if (numbers.length() == 0) {
            return 0;
        }

       if (numbers.charAt(0) == '/' && numbers.contains("[")) {
           delimiter = numbers.substring(numbers.indexOf("["), numbers.indexOf("]")) + "\\r?\\n]";
           String temp = numbers.substring(numbers.indexOf("]")+1);
           numbersArray = temp.split(delimiter);
       }
       else if (numbers.charAt(0) == '/' && !numbers.contains("[")) {
           delimiter = "[\\r?\\n" + numbers.charAt(2) + "]";
           String temp = numbers.substring(3);
           numbersArray = temp.split(delimiter);
       }
       else {
           delimiter = "[,\\r?\\n]";
           numbersArray = numbers.split(delimiter);
       }

        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i].length() != 0) {
                number = Integer.parseInt(numbersArray[i]);
                if (number < 0) {
                    negativesFound = true;
                    negatives.append(number).append(" ");
                } else {
                    sum += number;
                }
            }
        }
        if (negativesFound) {
            throw new NegativeNumberException("Negatives not allowed: " + negatives);
        }
        return sum;
    }
}
