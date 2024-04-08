package com.ohgiraffers.remixPractice;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmployeeController {

    private final EmployeeService employeeService;
    private final PrintResult printResult;
    public EmployeeController(){
        employeeService = new EmployeeService();
        printResult = new PrintResult();
    }
    public void selectAllEmployee() {
        List<EmployeeDTO> employeeDTOList = employeeService.selectAllEmployee();

        if(employeeDTOList != null){
            printResult.printEmployeeList(employeeDTOList);
        }else{
            printResult.printErrorMassage("selectList");
        }


    }

    public void selectEmployeeByCode(Map<String, String> parameter) {
        int id = Integer.parseInt(parameter.get("id"));

        EmployeeDTO emp = employeeService.selectEmployeeByCode(id);

        if(emp != null){
            printResult.printEmployeeList(emp);
        }else{
            printResult.printErrorMassage("selectEmp");
        }

    }

    public void addEmployee(Map<String, String> parameter) {
        String name = parameter.get("name");
        String no = parameter.get("no");
        String email = parameter.get("email");
        String phone = parameter.get("phone");

        EmployeeDTO emp = new EmployeeDTO();
        emp.setName(name);
        emp.setEmpNo(no);
        emp.setEmail(email);
        emp.setPhone(phone);

        if(EmployeeService.addEmployee(emp)){
            printResult.printSuccessMessage("insert");
        }

    }

    public void modifyEmployee(Map<String, String> parameter) {
        String name = parameter.get("name");
        String no = parameter.get("no");
        String email = parameter.get("email");
        String phone = parameter.get("phone");

        EmployeeDTO emp = new EmployeeDTO();
        emp.setName(name);
        emp.setEmpNo(no);
        emp.setEmail(email);
        emp.setPhone(phone);

        if(EmployeeService.modifyEmployee(emp)){
            printResult.printSuccessMessage("update");
        }else{
            printResult.printErrorMassage("update");
        }
    }

    public void deleteEmployee(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.put("id"));

        if (EmployeeService.deleteEmployee(id)) {
            printResult.printSuccessMessage("delete");
    }else{
            printResult.printErrorMassage("delete");
        }
    }
}
