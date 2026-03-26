import java.io.IOException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws IOException {

        Scanner read = new Scanner(System.in);

        int codigo = read.nextInt();
        int quantidade = read.nextInt();

        double total = 0;

        switch (codigo) {
            case 1:
                total = quantidade * 4.00;
                break;
            case 2:
                total = quantidade * 4.50;
                break;
            case 3:
                total = quantidade * 5.00;
                break;
            case 4:
                total = quantidade * 2.00;
                break;
            case 5:
                total = quantidade * 1.50;
                break;
        }

        System.out.printf("Total: R$ %.2f\n", total);
    }
}
