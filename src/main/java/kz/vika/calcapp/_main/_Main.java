package kz.vika.calcapp._main;

import kz.vika.calcapp.util.Calculator;
import kz.vika.calcapp.service.ResultWriterService;

public class _Main {

    public static void main(String[] args) {
        // Выполнение операций с помощью калькулятора
        int num1 = 10;
        int num2 = 5;
        int sum = Calculator.sum(num1, num2);
        int difference = Calculator.subtract(num1, num2);
        int product = Calculator.multiply(num1, num2);

        // Вывод результатов
        ResultWriterService.printResult(num1, num2, sum, "сумма");
        ResultWriterService.printResult(num1, num2, difference, "разность");
        ResultWriterService.printResult(num1, num2, product, "произведение");
    }
}