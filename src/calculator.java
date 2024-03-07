import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        System.out.println("Calculator in Java");
        Mathematics calculator = new Mathematics();

        Scanner read = new Scanner(System.in);

        System.out.println("Input the first number");
        double num1 = read.nextDouble();
        System.out.println("Input the second number");
        double num2 = read.nextDouble();

        System.out.println(calculator.add(num1,num2));
        System.out.println(calculator.subtraction(num1,num2));
        System.out.println(calculator.multiplication(num1,num2));
        System.out.println(calculator.division(num1,num2));


    }
}
