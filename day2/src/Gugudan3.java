import java.util.Scanner;

public class Gugudan3 {
    public static void main(String[] args) {

        boolean stop = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println(">> 구구단을 출력하는 프로그램 <<");

        do {

            System.out.print("출력하고자하는 구구단을 입력하세요 [Q]:종료 >> ");
            String input = scanner.nextLine(); //키보드로부터 엔터칠 때까지 입력된 값을 문자열로 반환

            if (input.equals("Q")) { //문자열비교 equal() 사용
                System.out.println("종료!");
                stop = true;
                continue; // 조건식으로 이동
            }

            int gugudan = Integer.parseInt(input); //문자열을 정수로 변환

            for (int i = 1; i <= 9; i++) {
                System.out.println(gugudan + "*" + i + "=" + (gugudan * i));
            }

            System.out.println(input);

        } while (!stop);
    }
}
