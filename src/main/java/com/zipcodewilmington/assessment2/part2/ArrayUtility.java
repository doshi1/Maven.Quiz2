package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;

// import org.apache.commons.lang3.ArrayUtils;
public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
       // ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i : array1){
            result.add(i);
        }
        for(int i : array2){
            result.add(i);
        }
        return result.toArray(new Integer[result.size()]);

    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
