import java.io.IOException;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Leitura dos dois valores inteiros
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Verifica se A é múltiplo de B OU se B é múltiplo de A
        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
