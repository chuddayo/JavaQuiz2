package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird {
    String color;
    Integer speed;
    String migrationMonth;
    public RedRobin() {
        color = "red";
        speed = 10;
    }
    public String color() {
        return color;
    }
    public String getMigrationMonth() {
        return migrationMonth;
    }
    public void setMigrationMonth(String migrationMonth) {
        this.migrationMonth = migrationMonth;
    }
}
