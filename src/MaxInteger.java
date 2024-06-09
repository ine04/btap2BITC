import java.util.Scanner;

public class MaxInteger {
    int max = 0;
    public int FindMaxInteger(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter num 3: ");
        int num3 = sc.nextInt();
        int max = num1;

        if (num2>max && num2 > num3)
        
            max = num2;
        
        else if(num3>max && num3 > num2) 
            max = num3;
        
        else
            max = num1;
        return max;


    }
}
