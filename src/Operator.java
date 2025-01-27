public class Operator implements IElemCalc {
    private EType type = EType.OPERATOR;
    private EOperator operator;

    public Operator(EOperator operator) {
        this.operator = operator;
    }

    @Override
    public EType getType() {
        return EType.OPERATOR;
    }
}
