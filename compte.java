class compte {
    private String titulaire;
    private double solde;

    public compte(String titulaire) {
        this.titulaire = titulaire;
    }

    public compte(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public void crediter(double montant) {
        this.solde += montant;
    }

    public void debiter(double montant) throws soldeInsuffisantException {
        if (montant > this.solde) {
            throw new soldeInsuffisantException();
        }
        this.solde -= montant;
    }

    @Override
    public String toString() {
        return "compte [titulaire=" + titulaire + ", solde=" + solde + "]";
    }
}