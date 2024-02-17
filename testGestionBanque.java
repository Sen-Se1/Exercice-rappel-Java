public class testGestionBanque {
    public static void main(String[] args) {
        compte c1 = new compte("Ammar", 1500);
        compte c2 = new compteEpargne("Salah", 1000, 0.05);
        System.out.println(c1);
        System.out.println(c2+"\n");
        System.out.println("Titulaire c1 : "+c1.getTitulaire());
        System.out.println("Solde c1 : "+c1.getSolde()+"\n");
        c1.setTitulaire("Ali");
        c1.setSolde(100);
        System.out.println("Nouvelle Titulaire c1 : "+c1.getTitulaire());
        System.out.println("Nouvelle Solde c1 : "+c1.getSolde()+"\n");
        c1.crediter(100);
        System.out.println("Nouvelle Solde c1 : "+c1.getSolde());
        try {
            c1.debiter(1000);
        } catch (soldeInsuffisantException e) {
            System.out.println(e+"\n");
        }
    }

}
