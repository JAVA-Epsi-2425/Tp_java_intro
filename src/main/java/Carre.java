import java.util.Scanner;

public class Carre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir la taille du carré
        System.out.print("Entrez la taille du carré : ");
        int n = scanner.nextInt();

        // Afficher le carré
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
