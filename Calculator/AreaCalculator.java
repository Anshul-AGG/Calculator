package Calculator;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 720);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        frame.add(panel);
        
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
                System.out.println(methods.circle(R));
            } else if (shape.equals("square")) {
                System.out.println("Enter the length : ");
                double L = sc.nextDouble();
                System.out.println(methods.square(L));
            } else {
                System.out.println("Enter the length : ");
                double L = sc.nextDouble();

                System.out.println("Enter the Breadth :");
                double B = sc.nextDouble();

                if (shape.equals("rectangle")) {
                    System.out.println(methods.rectangle(L, B));
                } else if (shape.equals("triangle")) {
                    System.out.println(methods.triangle(L, B));
                }
            }

            System.out.println("Wanna continue ? (Y/N)");
            ask = sc.next();
        }
        System.out.println("Calculator closed !");
        sc.close();
    }
}
