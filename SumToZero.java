import java.util.Scanner;

public class SumToZero {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter number: " +(i+1));
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        System.out.println("The triplets are :");
        for(int i=0; i < arr.length-2; i++) {
            for(int j=i+1; j < arr.length-1; j++) {
                for(int k=i+2; k < arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k] == 0) {
                        System.out.print(arr[i] + " " + arr[j] + " " + arr[k]);
                        System.out.print("\n");
                        count++;
                    }
                }
            }
        }
        if (count == 0)
            System.out.println("Not triplets exist in array whose sum is zero");
        else
            System.out.println("Number of distint triplets with sum zero is " + count);
    }
}