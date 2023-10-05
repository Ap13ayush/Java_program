package Pattern;

import java.util.Scanner;

public class pattern_3 {
    public static void main(String[] args) {
        Scanner pre = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = pre.nextInt();
        int row = 1;
        int star = 1;
        while (row < n) {
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;

            }
            row++;
            star++;
            System.out.println();
        }
    }

}