public class AffichageInformationsPersonnelles {
    private String nom;
    private int age;

    public AffichageInformationsPersonnelles(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void afficherInfos() {
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
    }

    public static void main(String[] args) {
        AffichageInformationsPersonnelles personne = new AffichageInformationsPersonnelles("Sellak Achraf", 21);
        personne.afficherInfos();
    }
}
