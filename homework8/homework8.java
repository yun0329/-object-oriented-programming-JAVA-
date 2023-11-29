package homework;

import java.util.HashMap;
import java.util.Scanner;

public class homework8 {
    public static void main(String[] args) {
        // �̸� ����� ID�� ��й�ȣ �� ����
        HashMap<String, String> credentials = new HashMap<>();
        credentials.put("myId", "myPass");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("id�� password�� �Է����ּ���.");
            System.out.print("id: ");
            String enteredId = scanner.nextLine().trim();

            // �Էµ� ID�� �������� ������ �޽��� ����ϰ� ���Է� ��û
            if (!credentials.containsKey(enteredId)) {
                System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
                continue;
            }

            System.out.print("password: ");
            String enteredPassword = scanner.nextLine().trim();

            // �Էµ� ��й�ȣ�� ��ġ���� ������ �޽��� ����ϰ� ���Է� ��û
            if (!credentials.get(enteredId).equals(enteredPassword)) {
                System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
            } else {
                // ID�� ��й�ȣ�� ��ġ�� ��� �α��� ���� �޽��� ���
                System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
                break;
            }
        }

        scanner.close();
    }
}
