package Model;

public class ComplexNumber {

    private final double real;
    private final double imagine;

    public ComplexNumber(double real, double imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    public static ComplexNumber add(ComplexNumber x1, ComplexNumber x2) {
        return new ComplexNumber(x1.real + x2.real, x1.imagine + x2.imagine);
    }

    public static ComplexNumber substract(ComplexNumber x1, ComplexNumber x2) {
        return new ComplexNumber(x1.real - x2.real, x1.imagine - x2.imagine);
    }

    public static ComplexNumber multiple(ComplexNumber x1, ComplexNumber x2) {
        return new ComplexNumber(x1.real * x2.real - x1.imagine * x2.imagine, x1.real * x2.imagine + x1.imagine * x2.real);

    }

    @Override
    public String toString() {
        String re = this.real + "";
        String im;
        if (this.imagine < 0)
            im = this.imagine + "i";
        else
            im = "+" + this.imagine + "i";
        return re + im;
    }
}



