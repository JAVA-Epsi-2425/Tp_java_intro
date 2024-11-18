import java.util.Scanner;

public class MontantTTC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisissez le montant HT : ");
        double montantHT = scanner.nextDouble();

        System.out.print("Saisissez la taxe en pourcentage : ");
        double taxe = scanner.nextDouble();

        double montantTTC = montantHT + (montantHT * taxe / 100);
        System.out.printf("Montant TTC : %.2f%n", montantTTC);
    }
}
