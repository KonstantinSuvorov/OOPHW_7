package Model;

public class ComplexNumber {

    private double real;
    private double imagine;

    public ComplexNumber() {
        real = 0.0;
        imagine = 0.0;
    }

    public ComplexNumber(double real, double imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    public void add(ComplexNumber x) {
        set(add(this, x));
    }

    public void substract(ComplexNumber x) {
        set(substract(this, x));
    }

    public void multiple(ComplexNumber x) {
        set(multiple(this, x));
    }

    public void set(ComplexNumber x) {
        this.real = x.real;
        this.imagine = x.imagine;
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
        String im = "";
        if (this.imagine < 0)
            im = this.imagine + "i";
        else
            im = "+" + this.imagine + "i";
        return re + im;
    }

    public double getRe() {
        return this.real;
    }

    public double getIm() {
        return this.imagine;
    }
}



