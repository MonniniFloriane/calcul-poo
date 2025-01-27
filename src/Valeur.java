public class Valeur implements IElemCalc{
    private EType type = EType.OPERATOR;
    private double valeur;

    public Valeur(double valeur) {
        this.valeur = valeur;
    }

    @Override
    public EType getType() {
        return EType.VALEUR;
    }
}
