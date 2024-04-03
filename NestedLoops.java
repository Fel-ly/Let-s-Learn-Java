import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";

        System.out.println("Let us draw a block!");
        System.out.println("Enter number of rows:");
        rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        columns = sc.nextInt();
        System.out.println("Enter symbol you want to use:");
        symbol = sc.next();

        for(int r=1; r<=rows; r++){
            System.out.println();
            for (int c=1; c<=columns; c++){
                System.out.print(symbol);
            }
        }

    }
}
