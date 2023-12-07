import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Homework9 {
    public static void main(String[] args) {
        // 미리 저장된 ID와 비밀번호 맵 생성
        HashMap<String, String> credentials = new HashMap<>();

        // 파일에서 ID와 비밀번호 읽어와서 맵에 저장
        try {
            File file = new File("db.txt");
            Scanner fileScanner = new Scanner(file);
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split("\\s+"); // Split the line into ID and password using whitespace as a separator
                if (parts.length == 2) {
                    credentials.put(parts[0], parts[1]);
                }
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found");
            System.exit(1);
        }

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
