package Pattern;
import java.util.Scanner;
public class pattern_4 {
    public static void main(String[] args) {
        Scanner pere = new Scanner(System.in);
        System.out.println("print new pattern");
        int n = pere.nextInt();
        int row = 1;
        int star = n;
        int space = 0;
        while(row <=n) {
            int i = 1;
            while(i <=space) {
                System.out.print("  ");
                i++;
            }
            int j =1;
            while(j <=star) {
                System.out.print("* ");
                j++;
            }
            row++;
            star--;
            space++;
            System.out.println();
        }


    }
}
