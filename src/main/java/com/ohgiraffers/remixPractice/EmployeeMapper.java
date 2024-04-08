package com.ohgiraffers.remixPractice;

import java.util.List;

public interface EmployeeMapper {
    EmployeeDTO selectEmployeeByCode(int id);
    List<EmployeeDTO> selectAllEmployee();

    int insertEmployee(EmployeeDTO emp);

    int modifyEmployee(EmployeeDTO emp);

    int deleteEmployee(int id);
}
