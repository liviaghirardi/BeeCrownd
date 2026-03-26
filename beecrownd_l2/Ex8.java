import java.io.IOException;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;

        if (horaInicial < horaFinal) {
            // Caso simples: termina no mesmo dia
            duracao = horaFinal - horaInicial;
        } else {
            // Caso complexo: termina no dia seguinte ou dura 24h
            duracao = (24 - horaInicial) + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
