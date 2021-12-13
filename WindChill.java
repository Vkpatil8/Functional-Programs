import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //taking temperature and speed as input from user
        System.out.println("Enter temperature less than 50 Fahrenheit:");
        int t = sc.nextInt();

        System.out.println("Enter speed between 3 - 150 miles per hour:");
        int v = sc.nextInt();

        //temp should be less than 50 and speed should be between 3-150 miles per Hour
        if(t <= 50 && v <= 150 && v >= 3) {
            double windChill = 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v, 0.16);
            System.out.println("Wind chill is :" + windChill + " Fahrenheit");
        }
        else {
            System.out.println("You have enter the value out of range");
        }
    }
}