public class compteEpargne extends compte {
    private double benefice;

    public compteEpargne(String titulaire, double solde, double benefice) {
        super(titulaire, solde);
        this.benefice = benefice;
    }

    public double getBenefice() {
        return benefice;
    }

    public void setBenefice(double benefice) {
        this.benefice = benefice;
    }

    @Override
    public String toString() {
        return "compteEpargne [benefice=" + benefice + "] | " + super.toString();
    }

}
