import java.io.IOException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double A = read.nextDouble();
        double B = read.nextDouble();
        double C = read.nextDouble();

        double delta = (B * B) - (4 * A * C);

        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {

            double R1 = (-B + Math.sqrt(delta)) / (2 * A);
            double R2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
    }
}
