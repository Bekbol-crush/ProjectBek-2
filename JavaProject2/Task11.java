import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int k = s.nextInt();

        if (k % 3 == 0 || k % 5 == 0 || k >= 8)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

