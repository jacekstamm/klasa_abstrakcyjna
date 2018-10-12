package com.kodilla;

abstract class SalaryPayout {

    private Employee emloyee;

    public SalaryPayout(Employee employee) {
        this.emloyee = employee;
    }

    public void setEmployee(Employee employee) {
        this.emloyee = employee;
    }

    protected abstract void payout();

    public void processPayout() {
        System.out.println("Creating payout for: " + this.emloyee.calculateSalary() + "PLN");
        this.payout();
        System.out.println("Payout has been completed");
    }
}
