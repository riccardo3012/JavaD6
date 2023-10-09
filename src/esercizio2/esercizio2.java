package esercizio2;
import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km;
        double litri;
        double kmPerLitro;

        while (true) {
            try {
                System.out.println("Inserisci il numero di km percorsi:");
                km = scanner.nextDouble();
                System.out.println("Inserisci il numero di litri consumati:");
                litri = scanner.nextDouble();
                if (litri == 0) {
                    throw new ArithmeticException("Divisione per zero!");
                }
                kmPerLitro = km / litri;
                System.out.println("Km/litro percorsi: " + kmPerLitro);
            } catch (Exception e) {
                System.out.println("Errore: ");
            }
            System.out.println("Vuoi continuare? (si/no)");
            String risposta = scanner.next();
            if (risposta.equals("no")) {
                System.out.println("fine");
                break;
            }
        }
        scanner.close();
    }
}
