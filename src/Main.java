import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tử 1 (a) : ");
        int a = sc.nextInt();
        System.out.print("Mẫu 1 (b) : ");
        int b = sc.nextInt();
        System.out.print("Tử 2 (c) : ");
        int c = sc.nextInt();
        System.out.print("Mẫu 2 (d) : ");
        int d = sc.nextInt();

        int tu = (b == d) ? (a + c) : (a * d + b * c);
        int mau = (b == d) ? b : (b * d);

        System.out.printf("Kết quả: %d/%d", tu, mau);
    }
}
