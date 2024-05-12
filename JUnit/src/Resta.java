public class Resta {
    double a;
    double b;

    //a
    public Resta(double a) {
        this.a = a;
    }

    public Resta(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double decrementa() {
        return (a - 1);
    }
    public double getResta() {
        return (a - b);
    }
}
