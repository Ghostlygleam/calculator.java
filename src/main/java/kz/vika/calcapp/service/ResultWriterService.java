package kz.vika.calcapp.service;

public class ResultWriterService {

    public static void printResult(int num1, int num2, int result, String operation) {
        System.out.println("Операция: " + operation + " " + num1 + " и " + num2 + " = " + result);
    }
}
