import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of row");
        int row = scanner.nextInt();
        System.out.println("Enter number of column");
        int column = scanner.nextInt();

        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print("index: " + i + j + " value " + array[i][j] + " | ");
            }
            System.out.println("\n");
        }
    }

}
