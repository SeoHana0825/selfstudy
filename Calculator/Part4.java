package SelfTraining.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part4 {

    // 4단계 결과 출력 및 반복 처리
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //3단계 예외처리 try-catch
            //double num1;
            double num1, num2;

            try{
                System.out.println("첫 번째 숫자를 입력하세요: ");
                //double num1 = scanner.nextDouble(); // 1단계 -> 3단계 예외처리 들어가면서 상단에서 선언
                num1 = scanner.nextDouble();
            } catch(InputMismatchException e){
                System.out.println("숫자를 입력해주세요");
                scanner.nextLine();
                continue;
            }
            System.out.println("연산자를 입력하세요 (+,-,*,/): ");
            // switch 문
            //String op = scanner.next();
            //if 문
            char op = scanner.next().charAt(0);

            //3단계 예외처리 try-catch 다시 시작
            //double num2;

            try {
                System.out.println("두 번째 숫자를 입력하세요: ");
                //double num2 = scanner.nextDouble();
                num2 = scanner.nextDouble();
            } catch(InputMismatchException e){
                System.out.println("숫자를 입력해주세요");
                scanner.nextLine();
                continue;
            }
            //System.out.println("입력 완료!");

            // 2단계 숫자 2개, 연산자 입력했을 때 결과값 출력 코드
            double result = 0;

            if (op == '+') {
                result = num1 + num2;
            } else if (op == '-') {
                result = num1 - num2;
            } else if (op == '*') {
                result = num1 * num2;
            } else if (op == '/') {
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다!"); //3단계 나누기 예외
                    continue;
                }
                result = num1 / num2;
            } else {
                System.out.println("잘못된 연산입니다. 다시 입력해주세요");
            }
            System.out.println("결과: " + result);

            System.out.println("계속 하시겠습니까? (y/n): ");
            String answer = scanner.next();

            if (answer.toLowerCase().equals("y")) {
                System.out.println();
            } else {
                System.out.println("계산기를 종료합니다");
            }
            break;
        }
        scanner.close();
    }
}
