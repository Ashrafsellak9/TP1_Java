public class VerificationMajorite {

    private static final int AGE_MAJORITE = 18;

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Erreur : Un seul argument est requis pour l'âge.");
            return;
        }

        try {
            int age = Integer.parseInt(args[0]);
            System.out.println("Âge fourni : " + age);
            if (age >= AGE_MAJORITE) {
                System.out.println("Vous êtes majeur.");
            } else {
                System.out.println("Vous êtes mineur.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erreur : Veuillez entrer un âge valide sous forme de nombre entier.");
        }
    }
}
