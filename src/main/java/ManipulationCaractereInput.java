import java.util.Scanner;

public class ManipulationCaractereInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir un caractère
        System.out.print("Entrez un caractère : ");
        char caractere = scanner.next().charAt(0);

        // Afficher le caractère
        System.out.println("Caractère : " + caractere);

        // Afficher le caractère en majuscule
        char majuscule = Character.toUpperCase(caractere);
        System.out.println("Caractère en majuscule : " + majuscule);

        // Afficher le caractère suivant
        char suivant = (char) (caractere + 1);
        System.out.println("Caractère suivant : " + suivant);
    }
}
