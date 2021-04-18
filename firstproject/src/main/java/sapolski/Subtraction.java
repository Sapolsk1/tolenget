public class Subtraction implements Operation {

    @Override
    public int operate(int a, int b) {
        return a - b;
    }

    @Override
    public OperationType getOperationType() {
        return OperationType.SUBTRACTION;
    }
}