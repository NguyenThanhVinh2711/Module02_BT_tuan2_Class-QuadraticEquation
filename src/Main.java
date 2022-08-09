import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a : ");
        double a = scanner.nextDouble();
        System.out.println("Enter the b : ");
        double b = scanner.nextDouble();
        System.out.println("Enter the c : ");
        double c = scanner.nextDouble();
        QuadraticEquation phuongtrinh = new QuadraticEquation(a, b, c);
        double delta = phuongtrinh.getDiscriminant();
        if (delta > 0) {
            System.out.println("Nghiem1 : " + phuongtrinh.getRoot1());
            System.out.println("Nghiem2 : " + phuongtrinh.getRoot2());
        } else if (delta == 0) {
            System.out.println("Nghiem1 : " + phuongtrinh.getRoot1());
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
