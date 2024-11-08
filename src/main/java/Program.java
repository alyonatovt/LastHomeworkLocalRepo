import app.Calculator;

public class Program {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum:" + calculator.sum(10, 3));
        System.out.println("Subtraction:" + calculator.subtraction(10, 9));
        System.out.println("Division:" + calculator.division(15, 5));
        System.out.println("Multiplication:" + calculator.multiplication(4, 8));
    }
}
