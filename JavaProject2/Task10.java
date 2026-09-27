import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();

        int x = c * 100 + d - (a * 100 + b);

        System.out.println(x / 100 + " " + x % 100);
    }
}

