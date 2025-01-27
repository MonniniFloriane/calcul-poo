public class FOperator {
    public static Valeur creerValeur (double valeur) {
        return new Valeur(valeur);
    }

    public static Operator creerOperator (EOperator operator) {
        return new Operator(operator);
    }
}
