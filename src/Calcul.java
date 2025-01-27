import java.util.ArrayList;

public class Calcul {
    private ArrayList<IElemCalc> list = new ArrayList<IElemCalc>();

    private Calcul(Builder builder) {
        this.list = builder.list;
    }

    public ArrayList<IElemCalc> getList() {
        return this.list;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        for (IElemCalc list : list) {
            result.append(list.toString()).append(" ");
        }

        result.append(" = ");

        return result.toString();
    }

    public static class Builder {
        private final ArrayList<IElemCalc> list = new ArrayList<IElemCalc>();

        public Builder addList(IElemCalc list) {
            this.list.add(list);
            return this;
        }

        public Calcul build() {
            return new Calcul(this);
        }
    }


    public void addOperator(IElemCalc operator) {
        this.list.add(operator);
    }

    public void execute() {}

    public void printHistory() {}
}
