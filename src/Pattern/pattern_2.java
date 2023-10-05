package Pattern;

import java.util.Scanner;

public class pattern_2 {
    public static void main(String[] args) {
        Scanner pre = new Scanner(System.in);
        System.out.println("enter the vale for pattern");
        int n= pre.nextInt();
        int row =1;
        int star = 1;

        while(row< n) {
            int i = 1;
            while(i<n) {
                System.out.print("* ");
                i++;

            }
            System.out.println();
            row++;
        }


    }
}
