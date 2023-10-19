package homework;

import java.util.Scanner;
public class homework4_1 {
    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else if (m % n == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("�� ���� �Է��ϼ���: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        int result = gcd(m, n);
        System.out.println("�� ���� �ִ������� " + result + "�Դϴ�.");
    } 
}
