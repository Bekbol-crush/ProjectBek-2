import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if ((a - c) == 2 && (b - d) == 1 || (a - c) == 1 && (b - d) == 2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

