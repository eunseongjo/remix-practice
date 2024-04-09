package com.ohgiraffers.remixPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeController employeeController = new EmployeeController();

        do{
            System.out.println("===== 직원 관리 =====");
            System.out.println("1. 직원 전체 조회");
            System.out.println("2. 직원 상세 조회");
            System.out.println("3. 직원 추가");
            System.out.println("4. 직원 정보 수정");
            System.out.println("5. 직원 탈퇴");
            System.out.print("직원 관리 번호를 입력하세요 : ");
            int inputNum = sc.nextInt();

            switch (inputNum) {
                case 1 : employeeController.selectAllEmployee();break;
                case 2 : employeeController.selectEmployeeByCode(inputEmployeeCode());break;
                case 3 : employeeController.addEmployee(inputEmployee());break;
                case 4 : employeeController.modifyEmployee(inputModifyEmployee());break;
                case 5 : employeeController.deleteEmployee(inputEmployeeCode());break;

            }

        }while(true);
    }

    private static Map<String, String> inputModifyEmployee() {

        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 직원의 id를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.println("수정할 직원의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("수정할 직원 번호를 입력하세요 : ");
        String no = sc.nextLine();
        System.out.println("수정할 직원의 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.println("수정할 직원의 전화번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.println("수정할 직원의 잡코드를 입력하세요 : ");
        String jobCode = sc.nextLine();
        System.out.println("수정할 직원의 직책을 입력하세요 : ");
        String salLevel = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);
        parameter.put("name", name);
        parameter.put("no", no);
        parameter.put("email", email);
        parameter.put("phone", phone);
        parameter.put("jobCode", jobCode);
        parameter.put("salLevel", salLevel);

        return parameter;
    }

    private static Map<String, String> inputEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("직원 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("직원 번호를 입력하세요 : ");
        String no = sc.nextLine();
        System.out.println("직원 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.println("직원의 전화번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.println("직원의 잡코드를 입력하세요 : ");
        String jobCode = sc.nextLine();
        System.out.println("직원의 직책을 입력하세요 : ");
        String salLevel = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);
        parameter.put("no", no);
        parameter.put("email", email);
        parameter.put("phone", phone);
        parameter.put("jobCode", jobCode);
        parameter.put("salLevel", salLevel);

        return parameter;
    }

    private static Map<String, String> inputEmployeeCode() {

        Scanner sc = new Scanner(System.in);
        System.out.print("직원 ID(number)를 입력하세요 : ");
        String id = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);

        return parameter;

    }
}
