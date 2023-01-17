public class Controller {
    View view;
    Calc calc;

    public Controller(View v, Calc c) {
        view = v;
        calc = c;
    }

    public void Result() {
        int result = 0;
        int op = view.getValue("Выберите операцию: 1 - сложение, 2 - вычетание, 3 - умножение, 4 - деление: ");

        while (op < 1 || op > 4) {
            System.out.println("Введите корректный номер операции!");
            op = view.getValue("Выберите операцию: 1 - сложение, 2 - вычетание, 3 - умножение, 4 - деление: ");
        }
        if (op == 1) {
            result = calc.resultSum();
            view.print(result, "Sum: ");
        } else if (op == 2) {
            result = calc.resultDifference();
            view.print(result, "Difference: ");
        } else if (op == 3) {
            result = calc.resultMultiplication();
            view.print(result, "Multiplication: ");
        } else if (op == 4) {
            result = calc.resultDegree();
            view.print(result, "Degree: ");
        }
    }
}
