package Calculator;

public class methods {
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
}
