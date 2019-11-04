package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2  == 0;
    }

    public Integer[] range(int start, int stop) {
       int[] range = null;
        for(int i = start; i <= stop; i++){
            range[i] += range[i];

        }
        return null;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        return array[array.length-1] * array[array.length -2];
    }
}
