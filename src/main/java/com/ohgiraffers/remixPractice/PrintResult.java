package com.ohgiraffers.remixPractice;

import java.util.List;

public class PrintResult {
    public void printEmployeeList(List<EmployeeDTO> employeeDTOList) {
        for(EmployeeDTO employee : employeeDTOList) {
            System.out.println(employee);
        }

    }

    public void printEmployee (EmployeeDTO employeeDTO){
        System.out.println(employeeDTO);
    }

    public void printErrorMassage(String errorCode) {

        String errorMassage = "";
        switch (errorCode){
            case "selectList" : errorMassage = "직원 목록 조회를 실패했습니다."; break;
            case "selectEmp" : errorMassage = "직원 조회를 실패했습니다."; break;
            case "insert" : errorMassage = "신규 직원 추가를 실패하였습니다."; break;
            case "update" : errorMassage = "직원 정보 수정에 실패했습니다."; break;
            case "delete" : errorMassage = "직원 정보 삭제에 실패했습니다."; break;

        }
        System.out.println(errorMassage);
    }



    public void printSuccessMessage(String successCode) {

        String successMassage = "";
        switch (successCode){
            case "selectAll" : successMassage = "직원 목록 조회에 성공하였습니다."; break;
            case "selectEmp" : successMassage = "직원 조회에 성공하였습니다."; break;
            case "insert" : successMassage = "신규 직원이 추가되었습니다."; break;
            case "update" : successMassage = "직원 정보가 수정되었습니다."; break;
            case "delete" : successMassage = "직원 정보가 삭제 되었습니다."; break;

        }
        System.out.println(successMassage);
    }
}
