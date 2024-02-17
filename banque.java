import java.util.ArrayList;
import java.util.List;

public class banque {
    private String nom;
    private List<compte> listCompte;

    public banque(String nom) {
        this.nom = nom;
        this.listCompte = new ArrayList<compte>();
    }

    public void ajouterCompte(compte compte) {
        this.listCompte.add(compte);

    }

    @Override
    public String toString() {
        return this.listCompte.toString();
    }
}
