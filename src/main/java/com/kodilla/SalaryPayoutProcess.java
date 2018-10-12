package com.kodilla;

public class SalaryPayoutProcess extends SalaryPayout {

    public SalaryPayoutProcess(Employee employee) {
        super(employee);
    }

    public void payout() {
        System.out.println("Sending money to employee");
    }
}
