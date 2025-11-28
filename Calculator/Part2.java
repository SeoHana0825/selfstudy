package SelfTraining.Calculator;

import java.util.Scanner;

public class Part2 {

    // 2단계 숫자 2개와 연산자 입력 코드

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("=== java 계산기 ===");

        while (true) {
            System.out.println("첫 번째 숫자를 입력해주세요: ");
            double num1 = num.nextDouble();

            System.out.println("연산자를 입력해주세요: ");
            char ch = num.next().charAt(0);
            // String op = scanner.next();

            System.out.println("두 번째 숫자를 입력해주세요: ");
            double num2 = num.nextDouble();

            double result = 0;
            if (ch == '+') {
                result = num1 + num2;
            } else if (ch == '-') {
                result = num1 - num2;
            } else if (ch == '*') {
                result = num1 * num2;
            } else if (ch == '/') {
                result = num1 / num2;
            } else {
                System.out.println("지원하지 않는 연산자입니다.");
            }
            System.out.println("결과: " + result);
            break;
        }
    }
}
