package Model;

public class ComplexNumber {

        private double real;
        private double imagine;

        public ComplexNumber(){
            real = 0.0;
            imagine = 0.0;
        }

        public ComplexNumber(double real, double imagine) {
            this.real = real;
            this.imagine = imagine;
        }
        public void add(ComplexNumber z){
            set(add(this, z));
        }

        public void substract(ComplexNumber z){
            set(substract(this, z));
        }

        public void multiple(ComplexNumber z){set(multiple(this,z));}

        public void set(ComplexNumber z)
        {
            this.real = z.real;
            this.imagine = z.imagine;
        }

        public static ComplexNumber add(ComplexNumber z1, ComplexNumber z2)
        {
            return new ComplexNumber(z1.real + z2.real, z1.imagine + z2.imagine);
        }

        public static ComplexNumber substract(ComplexNumber z1, ComplexNumber z2)
        {
            return new ComplexNumber(z1.real - z2.real, z1.imagine - z2.imagine);
        }
        public static ComplexNumber multiple(ComplexNumber z1, ComplexNumber z2){
            return new ComplexNumber(z1.real * z2.real - z1.imagine * z2.imagine, z1.real* z2.imagine + z1.imagine * z2.real);

        }

        @Override
        public String toString()
        {
            String re = this.real+"";
            String im = "";
            if(this.imagine < 0)
                im = this.imagine+"i";
            else
                im = "+"+this.imagine+"i";
            return re+im;
        }
        public double getRe()
        {
            return this.real;
        }
        public double getIm()
        {
            return this.imagine;
        }
}



