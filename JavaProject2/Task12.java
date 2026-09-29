import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int portions = (2 * n + k - 1) / k;
        int time = portions * m;

        System.out.println(time);
    }
}

