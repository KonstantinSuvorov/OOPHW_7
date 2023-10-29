package View;

import Loger.Loger;
import Model.ComplexNumber;

import java.io.IOException;
import java.util.Scanner;

public final class View {

    public void Calc() {
        Loger loger = new Loger();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1-е комплекcное число ");
        System.out.println("- вещественная часть: ");
        double re = scanner.nextDouble();
        System.out.println("- мнимая часть: ");
        double im = scanner.nextDouble();

        ComplexNumber a = new ComplexNumber(re, im);

        System.out.println("Введите 2-е комплекcное число ");
        System.out.println("- вещественная часть: ");
        double re1 = scanner.nextDouble();
        System.out.println("- мнимая часть:  ");
        double im1 = scanner.nextDouble();

        ComplexNumber b = new ComplexNumber(re1, im1);

        System.out.println("Выберите действие над комплексными числами");
        System.out.println("1 - Сложение ");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");

        int swt = scanner.nextInt();
        if (swt == 1) {
            var add = ComplexNumber.add(a, b);
            System.out.println("Сумма комплексных чисел: ");
            System.out.println(a + " + " + b + " = " + add);
            try {
                loger.loger1("Сумма комплексных чисел", add);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        if (swt == 2) {
            var substract = ComplexNumber.substract(a, b);
            System.out.println("Разность комплексных чисел: ");
            System.out.println(a + " - " + b + " = " + substract);
            try {
                loger.loger1("Разность комплексных чисел", substract);
            } catch (IOException e) {
                 System.out.println(e.getMessage());
            }
        }
        if (swt == 3) {
            var multiple = ComplexNumber.multiple(a, b);
            System.out.println("Произведение комплексных чисел: ");
            System.out.println(a + " * " + b + " = " + multiple);
            try {
                loger.loger1("Произведение комплексных чисел", multiple);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}