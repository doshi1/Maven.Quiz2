package com.zipcodewilmington.assessment2.part3;

public class RedRobin  extends Bird{
 private String getMigrationMonth;

    public void setGetMigrationMonth(String getMigrationMonth) {
        this.getMigrationMonth = getMigrationMonth;
    }

    @Override
    public int getSpeed() {
        return 60;
    }


    @Override
    public String color() {
        return "red";
    }

}
