package Calculator;
import java.util.Scanner;
//Addded
//removed
public class AreaCalculator {

    public static double rectangle(double L, double B) {
        return L * B;
    }

    public static double square(double L) {
        return Math.pow(L, 2);
    }

    public static double triangle(double L, double B) {
        return B * L / 2;
    }

    public static double circle(double R) {
        return Math.PI * Math.pow(R, 2);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ask = "Y";

        while (ask.equalsIgnoreCase("Y")) {
            String shape = "";
            boolean validShape = false;

            while (!validShape) {
                System.out.println("Choose shape :" + " square," + " rectangle," + " triangle," + " circle");
                shape = sc.next().toLowerCase();
                if (shape.equals("square") || (shape.equals("rectangle")) || (shape.equals("circle"))
                        || (shape.equals("triangle"))) {
                    validShape = true;
                } else {
                    System.out.println("Invalid shape bhai, shi se dal phir se.");
                }
            }
            if (shape.equals("circle")) {
                System.out.println("Enter the radius :");
                double R = sc.nextDouble();
                System.out.println(circle(R));
            } else if (shape.equals("square")) {
                System.out.println("Enter the length : ");
                double L = sc.nextDouble();
                System.out.println(square(L));
            } else {
                System.out.println("Enter the length : ");
                double L = sc.nextDouble();

                System.out.println("Enter the Breadth :");
                double B = sc.nextDouble();

                if (shape.equals("rectangle")) {
                    System.out.println(rectangle(L, B));
                } else if (shape.equals("triangle")) {
                    System.out.println(triangle(L, B));
                }
            }
    
            System.out.println("Wanna continue ? (Y/N)");
            ask = sc.next();

        }
        sc.close();
    }
}
