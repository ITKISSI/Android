package ma.eheio.exercice2;

public class exercice2 {
    public String nom;
    public String prenom;

    public exercice2(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "exercice2{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
