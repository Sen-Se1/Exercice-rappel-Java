public class testGestionBanque {
    public static void main(String[] args) {
        compte c1 = new compte("Ammar", 1500);
        System.out.println(c1 + "\n");
        System.out.println("Titulaire c1 : " + c1.getTitulaire());
        System.out.println("Solde c1 : " + c1.getSolde() + "\n");
        c1.setTitulaire("Ali");
        c1.setSolde(100);
        System.out.println("Nouvelle Titulaire c1 : " + c1.getTitulaire());
        System.out.println("Nouvelle Solde c1 : " + c1.getSolde() + "\n");
        c1.crediter(100);
        System.out.println("Nouvelle Solde c1 : " + c1.getSolde());
        try {
            c1.debiter(1000);
        } catch (soldeInsuffisantException e) {
            System.out.println(e + "\n");
        }
        compte c2 = new compteEpargne("Salah", 1000, 0.05);
        System.out.println(c2 + "\n");
        System.out.println("Benefice c2 : " + ((compteEpargne) c2).getBenefice() * 100 + " %\n");
        ((compteEpargne) c2).setBenefice(0.10);
        System.out.println("Nouvelle Benefice c2 : " + ((compteEpargne) c2).getBenefice() * 100 + " %\n");
        banque b = new banque("UIB");
        System.out.println(b + "\n");
        b.ajouterCompte(c1);
        b.ajouterCompte(c2);
        System.out.println(b + "\n");
    }
}
