public class Suma {
    double a;
    double b;
    public Suma(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Suma(double a) {
        this.a = a;
    }

    public double getSuma() {
        return (a+b);
    }

    public double incrementar() {
        return a+1;
    }
}
