package homework;

import java.util.HashMap;
import java.util.Scanner;

public class homework8 {
    public static void main(String[] args) {
        // 미리 저장된 ID와 비밀번호 맵 생성
        HashMap<String, String> credentials = new HashMap<>();
        credentials.put("myId", "myPass");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            String enteredId = scanner.nextLine().trim();

            // 입력된 ID가 존재하지 않으면 메시지 출력하고 재입력 요청
            if (!credentials.containsKey(enteredId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password: ");
            String enteredPassword = scanner.nextLine().trim();

            // 입력된 비밀번호가 일치하지 않으면 메시지 출력하고 재입력 요청
            if (!credentials.get(enteredId).equals(enteredPassword)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            } else {
                // ID와 비밀번호가 일치할 경우 로그인 성공 메시지 출력
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }

        scanner.close();
    }
}
