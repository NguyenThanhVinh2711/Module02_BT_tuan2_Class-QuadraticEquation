public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation() {
    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        double delta =(b*b) - (4*a*c);
        return delta ;
    }
    public double getRoot1(){
        return (-b + Math.sqrt((b*b) - (4*a*c)))/2*a;
    }
    public double getRoot2(){
        return (-b - Math.sqrt((b*b) - (4*a*c)))/2*a;
    }
}
