package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer input;
    public WuTangConcatenator(Integer input) {
    }

    public Boolean isWu() {


        return this.input % 3 == 0;
    }

    public Boolean isTang() {

        return this.input % 5 == 0;
    }

    public Boolean isWuTang() {
  if (this.input % 5 == 0 && this.input % 3 == 0){
        return true;}
  return false;
    }
}
