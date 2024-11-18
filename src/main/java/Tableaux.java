import java.util.Random;
import java.util.Scanner;

public class Tableaux {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // Initialiser un tableau de 10 valeurs aléatoires
        int[] tableau = new int[10];
        System.out.println("Tableau généré :");
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = rand.nextInt(50); // Nombres aléatoires entre 0 et 49
            System.out.print(tableau[i] + " ");
        }
        System.out.println();

        // Saisir une valeur à rechercher
        System.out.print("Entrez une valeur à rechercher : ");
        int valeur = scanner.nextInt();

        // Vérifier si la valeur est présente
        boolean trouve = false;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                System.out.println("Valeur trouvée à l'index : " + i);
                trouve = true;
                break;
            }
        }
        if (!trouve) {
            System.out.println("Valeur non trouvée dans le tableau.");
        }
    }
}
