public class Calculator {
    
    public int CalculatorInteger(String operation, int number1, int number2){
        int result = 0;
        switch (operation) {
            case "+":
                result = number1 + number2;
                System.out.printf("%d + %d = %d%n", number1, number2, result);
                break;
            case "-":
                result = number1 - number2;
                System.out.printf("%d - %d = %d%n", number1, number2, result);
                break;
            case "*":
                result = number1 * number2;
                System.out.printf("%d * %d = %d%n", number1, number2, result);
                break;
            case "/":
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.printf("%d / %d = %d%n", number1, number2, result);
                } else {
                    System.out.println("Khong the chia het cho 0!");
                    return 0;
                }
                break;
            default:
                System.out.println("Invalid operation, please enter again ( + , -, *, /)");
                return 0;
        }
        return result;
    }
}
