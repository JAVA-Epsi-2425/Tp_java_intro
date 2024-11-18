import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir les deux nombres
        System.out.print("Entrez le premier nombre : ");
        double a = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double b = scanner.nextDouble();

        // Saisir l'opérateur
        System.out.print("Entrez l'opérateur (+, -, *, /) : ");
        char operateur = scanner.next().charAt(0);

        // Calcul en fonction de l'opérateur
        double resultat;
        switch (operateur) {
            case '+':
                resultat = a + b;
                break;
            case '-':
                resultat = a - b;
                break;
            case '*':
                resultat = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultat = a / b;
                } else {
                    System.out.println("Erreur : division par zéro !");
                    return;
                }
                break;
            default:
                System.out.println("Opérateur non valide !");
                return;
        }

        // Afficher le résultat
        System.out.println("Résultat : " + resultat);
    }
}
