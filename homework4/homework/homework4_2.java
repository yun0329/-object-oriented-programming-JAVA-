package homework;

import java.util.Scanner;
public class homework4_2 {
	public static int gcd(int m, int n) {
        while (n != 0) {
            int temp = m;
            m = n;
            n = temp % n;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("�� ���� �Է��ϼ���: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        int result = gcd(m, n);
        System.out.println("�ִ�����: " + result);
    }
}
