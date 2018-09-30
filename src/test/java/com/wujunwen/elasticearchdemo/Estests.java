package com.wujunwen.elasticearchdemo;

import com.wujunwen.elasticearchdemo.entity.EmployeesDO;
import com.wujunwen.elasticearchdemo.repositories.EmployeesRepository;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class Estests {
    @Autowired
    EmployeesRepository employeesRepository;

    @Test
    public void Test() {
        EmployeesDO employeesDO = new EmployeesDO();
        employeesDO.setEmpNo(123);
        employeesDO.setFirstName("Tom");
        employeesDO.setLastName("jery");
        employeesDO.setGender("M");
        employeesRepository.save(employeesDO);
    }
}
