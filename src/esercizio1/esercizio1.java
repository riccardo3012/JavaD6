package esercizio1;
import java.util.Scanner;
public class esercizio1 {

    public static void main(String[] args) {

        int inputNumber;
        int[] listaNumeri = new int[5];
        Scanner scanner;

        do {
            System.out.println("Inserisci un numero tra 1 e 10:");
            scanner = new Scanner(System.in);
            inputNumber = scanner.nextInt();

            if (inputNumber < 1 || inputNumber > 10) {
                System.out.println("Numero non valido! Inserisci un numero compreso tra 1 e 10!");
            } else {
                try {
                    generaNumeriCasualiArray(listaNumeri);
                    listaNumeri[0] = inputNumber;
                    stampaNumeri(listaNumeri);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } while (inputNumber != 0);
        scanner.close();
    }
    public static void generaNumeriCasualiArray(int[] listaNumeri) {
        for (int i = 0; i < listaNumeri.length; i++) {
            int numeroCasuale = (int) (Math.floor(Math.random() * 10)) + 1;
            listaNumeri[i] = numeroCasuale;
        }
    }
    public static void stampaNumeri(int[] listaNumeri) {
        for (int j : listaNumeri) {
            System.out.println(j);
        }
    }
}
