public class Calc {
    Integer x;
    Integer y;

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    public Integer resultSum() {
        return x + y;
    }

    public Integer resultDifference() {
        return x - y;
    }

    public Integer resultMultiplication() {
        return x * y;
    }

    public Integer resultDegree
    () {
        return x / y;
    }
}
