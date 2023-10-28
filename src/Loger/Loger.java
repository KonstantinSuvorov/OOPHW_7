package Loger;

import Model.ComplexNumber;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Loger {
    public void loger1 (String s, ComplexNumber result) throws IOException {
        try (FileWriter fileWriter = new FileWriter("ComplexCalc.txt", true)){
                fileWriter.append(new Date()+ "\nВыполнена математическая операция: " + s + "\n" + "Результат: " + result + "\n\r");
        }
    }
}

