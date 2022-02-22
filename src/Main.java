public class Main {

    public static void main (String[] args) {
        System.out.println("My app for Users!");
        System.out.println("Version 1.0");

        int a = 5;
        int b = 7;

        int c = add(a, b);
        System.out.println(c);

        int d = multiply(a, b);
        System.out.println(d);

        int e = subtraction(a, b);
        System.out.println(e);

        double x = a;
        double y = b;

        double f = division(x, y);
        System.out.println(f);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }

    private static double division(double a, double b) {
        return a / b;
    }
}
