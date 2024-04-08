package com.ohgiraffers.remixPractice;

import java.util.List;

public class PrintResult {
    public void printEmployeeList(List<EmployeeDTO> employeeDTOList) {
        for(EmployeeDTO employee : employeeDTOList) {
            System.out.println(employee);
        }

    }

    public void printErrorMassage(String errorCode) {

        String errorMassage = "";
        switch (errorCode){
            case "selectList" : errorMassage = "직원 목록 조회를 실패했습니다."; break;
            case "selectEmp" : errorMassage = "직원 조회를 실패했습니다."; break;
            case "update" : errorMassage = "직원 정보 수정에 실패했습니다."; break;
            case "delete" : errorMassage = "직원 정보 삭제에 실패했습니다."; break;

        }
        System.out.println(errorMassage);
    }

    public void printSuccessMessage(String insert) {

        String successMassage = "";
        switch (successMassage){
            case "insert" : successMassage = "신규 직원이 추가 되었습니다."; break;
            case "update" : successMassage = "직원 정보가 수정되었습니다."; break;
            case "delete" : successMassage = "직원 정보가 삭제 되었습니다."; break;

        }
        System.out.println(successMassage);
    }
}
