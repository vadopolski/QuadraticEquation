import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws Exception {

        boolean isCorrectCoefficient;

        do {
            isCorrectCoefficient = true;
            System.out.println("Enter a coefficent A: ");
            Scanner sc = new Scanner(System.in);
            float a = sc.nextFloat();
            System.out.println("Enter a coefficent B: ");
            sc = new Scanner(System.in);
            float b = sc.nextFloat();
            System.out.println("Enter a coefficent C: ");
            sc = new Scanner(System.in);
            float c = sc.nextFloat();

            QuadraticEquation quadraticEquation = null;

            try {
                quadraticEquation = new QuadraticEquation(a,b,c);
                System.out.println("The Quadratic Equation is: " + a + "*X^2" + b + "*X" + c);
                System.out.println("The roots is" + quadraticEquation.getRoots());
            }
            catch (RuntimeException e) {
                isCorrectCoefficient = false;
                System.out.println("Bad coefficient A");
            }
            catch (AssertionError err) {
                isCorrectCoefficient = false;
                System.out.println("Bad coefficient, D < 0, There is not a real roots.");
            }
        } while (!isCorrectCoefficient);
    }
}
