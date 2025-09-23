package Calculator;
import java.util.Scanner;

public class Calculator {
    public static double add(double n1, double n2) {
        return n1 + n2;
    }

    public static double subtract(double n1, double n2) {
        return n1 - n2;
    }

    public static double multiplication(double n1, double n2) {
        return n1 * n2;
    }

    public static double division(double n1, double n2) {
        return n1 / n2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String exit = "Y";

        while (exit.equalsIgnoreCase("Y")) {
            System.out.println("Enter the first number : ");
            double n1 = sc.nextDouble();

            System.out.println("+");
            System.out.println("-");
            System.out.println("*");
            System.out.println("/");
            System.out.println("Choose the operation :");
            String s1 = sc.next();
            

            System.out.println("Enter the second number : ");
            double n2 = sc.nextDouble();

            if (s1.equals("+")) {
                System.out.println(add(n1, n2));
            } else if (s1.equals("-")) {
                System.out.println(subtract(n1, n2));
            } else if (s1.equals("*")) {
                System.out.println(multiplication(n1, n2));
            } else if (s1.equals("/")) {
                System.out.println(division(n1, n2));
            }
            else{
                System.out.println("You asshole k pkode, choose right operator");
            }

            System.out.println("Do u want to continue ? (Y/N)");
            exit = sc.next();
        }
        sc.close();
    }
}
