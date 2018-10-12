package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillacourseApplication {

    public static void main(String[] args) {

        HourlySalaryEmployee salaryPerProduct = new HourlySalaryEmployee(163.0, 7.00);
        SalaryPayoutProcess procesor = new SalaryPayoutProcess(salaryPerProduct);
        procesor.processPayout();

        FixedSalaryEmployee fixedSalaryWithoutExtra = new FixedSalaryEmployee(3000.00);
        procesor.setEmployee(fixedSalaryWithoutExtra);
        procesor.processPayout();

        FixedSalaryEmployee fixedSalaryWithExtra = new FixedSalaryEmployee(3200.00 + 3200.00 * 0.20);
        procesor.setEmployee(fixedSalaryWithExtra);
        procesor.processPayout();
    }
}
