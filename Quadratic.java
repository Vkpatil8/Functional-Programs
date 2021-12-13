import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("Enter c :");
        int c = sc.nextInt();

        //calculating roots are real or imaginary
        int delta = b*b - 4*a*c;

        //calculating roots
        if(delta >= 0) {
            double root1 = (-b + Math.sqrt(delta))/(2*a);
            double root2 = (-b - Math.sqrt(delta))/(2*a);

            System.out.println("Roots of equation are " + root1 + " and " + root2);
        }
        else {
            System.out.println("This equation have imaginary roots");
        }
    }
}