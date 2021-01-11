package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"74829547612", "John", "Smith"},
            {"24674389221", "Ivone", "Novak"},
            {"23874543021", "Jessie", "Pinkman"},
            {"34739834011", "Walter", "White"},
            {"39246893232", "Clara", "Lanson"}
    };
    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00
    };

    public String getWorker(int n) {
        if( n > salaries.length) {
            return "";
        }
        return workers[n][0]+", "+workers[n][1]+", "+workers[n][2]+", "+salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
