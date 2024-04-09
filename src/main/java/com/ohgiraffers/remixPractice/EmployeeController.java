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
            printResult.printSuccessMessage("selectAll");
        }else{
            printResult.printErrorMassage("selectList");
        }


    }

    public void selectEmployeeByCode(Map<String, String> parameter) {
        int id = Integer.parseInt(parameter.get("id"));

        EmployeeDTO emp = employeeService.selectEmployeeByCode(id);

        if(emp != null){
            printResult.printEmployee(emp);
            printResult.printSuccessMessage("selectEmp");
        }else{
            printResult.printErrorMassage("selectEmp");
        }

    }

    public void addEmployee(Map<String, String> parameter) {
        String name = parameter.get("name");
        String no = parameter.get("no");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");

        EmployeeDTO emp = new EmployeeDTO();
        emp.setName(name);
        emp.setNo(no);
        emp.setEmail(email);
        emp.setPhone(phone);
        emp.setJobCode(jobCode);
        emp.setSalLevel(salLevel);

        if(employeeService.addEmployee(emp)){
            printResult.printSuccessMessage("insert");
        }else{
            printResult.printErrorMassage("insert");
        }

    }

    public void modifyEmployee(Map<String, String> parameter) {
        int id = Integer.parseInt(parameter.get("id"));
        String name = parameter.get("name");
        String no = parameter.get("no");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");

        EmployeeDTO emp = new EmployeeDTO();
        emp.setId(id);
        emp.setName(name);
        emp.setNo(no);
        emp.setEmail(email);
        emp.setPhone(phone);
        emp.setJobCode(jobCode);
        emp.setSalLevel(salLevel);

        if(employeeService.modifyEmployee(emp)){
            printResult.printSuccessMessage("update");
        }else{
            printResult.printErrorMassage("update");
        }
    }

    public void deleteEmployee(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));

        if (employeeService.deleteEmployee(id)) {
            printResult.printSuccessMessage("delete");
    }else{
            printResult.printErrorMassage("delete");
        }
    }
}
