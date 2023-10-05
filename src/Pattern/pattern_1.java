package Pattern;

import java.util.Scanner;

public class pattern_1 {
    public static void main(String[] args) {
        Scanner pre = new Scanner(System.in);
        System.out.println("enter the number for pattern");
        int n = pre.nextInt();
        int i = 1;
        while (i<=n) {
            System.out.print("* ");
            i++;
        }

    }
}
