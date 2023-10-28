package View;

import Loger.Loger;

import java.io.IOException;
import java.util.Scanner;


public class View {

    public void StartCalc() {
        Loger loger = new Loger();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1-е комплекcное число ");
        System.out.println("- вещественная часть: ");
        double re = scanner.nextDouble();
        System.out.println("- мнимая часть: ");
        double im = scanner.nextDouble();

        Model.ComplexNumber a = new Model.ComplexNumber(re, im);

        System.out.println("Введите 2-е комплекcное число ");
        System.out.println("- вещественная часть: ");
        double re1 = scanner.nextDouble();
        System.out.println("- мнимая часть:  ");
        double im1 = scanner.nextDouble();

        Model.ComplexNumber b = new Model.ComplexNumber(re1, im1);

        System.out.println("Выберите действие над комплексными числами");
        System.out.println("1 - Сложение ");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");

        int swt = scanner.nextInt();
        if (swt == 1) {
            Model.ComplexNumber.add(a, b);
            System.out.println("Сумма комплексных чисел: ");
            System.out.println(a.toString() + " + " + b.toString() + " = " + Model.ComplexNumber.add(a, b).toString());
            try {
                loger.loger1("Сумма комплексных чисел", Model.ComplexNumber.add(a, b));
            } catch (IOException e) {
                e.getMessage();
            }
        }
        if (swt == 2) {
            Model.ComplexNumber.substract(a, b);
            System.out.println("Разность комплексных чисел: ");
            System.out.println(a.toString() + " - " + b.toString() + " = " + Model.ComplexNumber.substract(a, b).toString());
            try {
                loger.loger1("Разность комплексных чисел", Model.ComplexNumber.substract(a, b));
            } catch (IOException e) {
                e.getMessage();
            }
        }
        if (swt == 3) {
            Model.ComplexNumber.multiple(a, b);
            System.out.println("Произведение комплексных чисел: ");
            System.out.println(a.toString() + " * " + b.toString() + " = " + Model.ComplexNumber.multiple(a, b).toString());
            try {
                loger.loger1("Произведение комплексных чисел", Model.ComplexNumber.multiple(a, b));
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }
}