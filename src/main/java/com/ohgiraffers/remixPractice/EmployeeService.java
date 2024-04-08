package com.ohgiraffers.remixPractice;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.remixPractice.Template.getSqlSession;

public class EmployeeService {
    public static boolean addEmployee(EmployeeDTO emp) {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = employeeMapper.insertEmployee(emp);

        if(result > 0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result >0? true : false;
    }

    public static boolean modifyEmployee(EmployeeDTO emp) {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = employeeMapper.modifyEmployee(emp);

        if(result > 0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result >0? true : false;
    }

    public static boolean deleteEmployee(int id) {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = employeeMapper.deleteEmployee(id);

        if(result > 0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0? true:false;
    }

    public List<EmployeeDTO> selectAllEmployee() {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        List<EmployeeDTO> employeeDTOList = employeeMapper.selectAllEmployee();

        sqlSession.close();

        return employeeDTOList;
    }

    public EmployeeDTO selectEmployeeByCode(int id) {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        EmployeeDTO employee = employeeMapper.selectEmployeeByCode(id);

        sqlSession.close();

        return employee;
    }
}
