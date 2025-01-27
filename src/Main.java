import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Calcul calcul = new Calcul.Builder(addList(5)).build();

        calcul.addList(5);
        calcul.addOperator(EOperator.MINUS);
        calcul.addList(7);
        calcul.execute();

        calcul.printHistory();
    }
}