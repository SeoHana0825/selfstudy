package SelfTraining.Calculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Part7 {

    // 7단계 매뉴 선택에 따른 구현
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> history = new ArrayList<>();

        while (true) {
            System.out.println("===Java 계산기===");
            System.out.println("1. 계산하기");
            System.out.println("2. 계산 이력보기");
            System.out.println("3. 이력 지우기");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            int menu;

            try {
                menu = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요");
                scanner.nextLine();
                continue;
            }

            if (menu == 0) {
                System.out.println("계산기를 종료합니다");
                break;
            }
            switch (menu) {
                case 1:
                    //계산하기
                    double num1,num2 = 0;
                    String op;

                    try {
                        System.out.println("첫 번째 숫자: ");
                        num1 = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("숫자를 입력해주세요");
                        scanner.nextLine();
                        continue;
                    }

                    System.out.println("연산자 (+,-,*,/,%,^,s: ");
                    op = scanner.next();

                    if (!op.equals("s")) {
                        try {
                            System.out.println("두 번째 숫자: ");
                            num2 = scanner.nextDouble();
                        } catch (InputMismatchException e) {
                            System.out.println("숫자를 입력해주세요");
                            scanner.nextLine();
                            continue;
                        }
                    }

                    Double result = null;

                    switch (op) {
                        case "+": result = num1 + num2; break;
                        case "-": result = num1 - num2; break;
                        case "*": result = num1 * num2; break;
                        case "/":
                         if (num2 == 0) {
                             System.out.println("0으로 나눌 수 없습니다");
                             continue;
                         } result = num1 / num2; break;
                        case "%": result = num1 % num2; break;
                        case "^": result = Math.pow(num1, num2); break;
                        case "s":
                            if (num1 < 0) {
                                System.out.println("음수의 제곱근은 불가능합니다");
                                continue;
                            } result = Math.sqrt(num1); break;
                    }
                    System.out.println("결과: " + result);

                    history.add(result);
                    System.out.println("저장: " + history);

                    break;

                    case 2:
                        // 이력보기
                        System.out.println("=== 계산이력 ===");
                        if (history.isEmpty()) {
                            System.out.println("저장된 이력이 없습니다");
                        } else {
                            for (Double d : history) {
                                System.out.println(d);
                            }
                        }
                        break;

                case 3:
                    // 이력삭제
                    history.clear();
                    System.out.println("이력이 모두 삭제되었습니다");
                    break;

                    default:
                        System.out.println("올바른 메뉴를 선택하세요");
            }
        }
        scanner.close();
    }
}
