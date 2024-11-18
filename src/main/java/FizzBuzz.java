import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir la plage de nombres
        System.out.print("Entrez le nombre de départ : ");
        int start = scanner.nextInt();

        System.out.print("Entrez le nombre de fin : ");
        int end = scanner.nextInt();

        // Boucle FizzBuzz
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
