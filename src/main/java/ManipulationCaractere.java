public class ManipulationCaractere {
    public static void main(String[] args) {
        char caractere = 'a';
        System.out.println("Caractère : " + caractere);
        System.out.println("Code Unicode : " + (int) caractere);

        char suivant = (char) (caractere + 1);
        System.out.println("Caractère suivant : " + suivant);

        char majuscule = Character.toUpperCase(caractere);
        System.out.println("Caractère en majuscule : " + majuscule);
    }
}
