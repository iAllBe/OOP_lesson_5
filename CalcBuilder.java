public class CalcBuilder {
    private static CalcBuilder instance;
    Calc obj;

    private CalcBuilder() {

    }

    public static CalcBuilder getInstance() {
        if (instance == null)
            instance = new CalcBuilder();
        instance.obj = new Calc();

        return instance;
    }

    public CalcBuilder setX(Integer x) {
        obj.x = x;
        return this;
    }

    public CalcBuilder setY(Integer y) {
        obj.y = y;
        return this;
    }

    public Calc build() {
        return obj;
    }

    @Override
    public String toString() {
        return "CalcBuilder{" +
                "obj=" + obj +
                '}';
    }
}