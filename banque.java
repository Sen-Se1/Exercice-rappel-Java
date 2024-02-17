import java.util.ArrayList;
import java.util.List;

public class banque {
    private String nom;
    private List<compte> compteList;

    public banque(String nom) {
        this.nom = nom;
        this.compteList = new ArrayList<compte>();
    }

    public void ajouterCompte(compte compte) {
        this.compteList.add(compte);

    }

    @Override
    public String toString() {
        return this.compteList.toString();
    }
}
