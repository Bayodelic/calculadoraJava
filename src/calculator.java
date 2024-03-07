public class calculator {
    public static void main(String[] args){
        System.out.println("Calculator in Java");
        Mathematics calculator = new Mathematics();

        System.out.println(calculator.add(4,4));
        System.out.println(calculator.subtraction(8,3));
        System.out.println(calculator.multiplication(4,4));
        System.out.println(calculator.division(16,4));


    }
}
