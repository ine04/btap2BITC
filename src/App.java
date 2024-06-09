public class App {
    public static void main(String[] args) throws Exception {
        
        //Bai 1
        CheckYear checkYear = new CheckYear();
        checkYear.CheckLeapYear(2020);
        checkYear.CheckLeapYear(2013);
        checkYear.CheckLeapYear(1000);


        //Bai2
        Calculator calculator = new Calculator();
        calculator.CalculatorInteger("+", 4, 2);
        //Output: Ket qua la 4 + 2 = 6
        calculator.CalculatorInteger("-", 4, 2);
        //Output: Ket qua la 4 - 2 = 2
        calculator.CalculatorInteger("*", 4, 2);
        //Output: Ket qua la 4 * 2 = 8
        calculator.CalculatorInteger("/", 4, 2);
        //Output: Ket qua la 4/2 = 2
        calculator.CalculatorInteger("/", 4, 0);
        //Output: Ko the chia het cho 0!



        //Bai3
        MaxInteger maxInteger = new MaxInteger();
        int max = maxInteger.FindMaxInteger();
        System.out.println("So lon nhat la:" + max);

        //Bai4
        Equation equation = new Equation();
        equation.CalculateQuadratic(4, 5, 6);
        //Pt vo nghiem
        equation.CalculateQuadratic(0, 5, 6);
        //Phuong trinh co nghiem duy nhat x =-1.2
        equation.CalculateQuadratic(0, 0, 6);
        //Phuong trinh vo nghiem vi a va b bang 0
        equation.CalculateQuadratic(0, 0, 0);
        // Phương trình co vo so nghiem
        equation.CalculateQuadratic(4, 8, 3);
        //Phuong trinh co 2 nghiem x1 = -0.500000, x2 -1.500000

    }
}
