package com.zipcodewilmington.assessment2.part2;

import java.util.*;

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
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int idxToCopy = index; idxToCopy < array.length ; idxToCopy++){
            newArray.add(array[idxToCopy]);
        }
        for(int idxToCopy = 0; idxToCopy < index ; idxToCopy++){
            newArray.add(array[idxToCopy]);
        }
        return newArray.toArray(new Integer[newArray.size()]);

    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        List asListArray1 = Arrays.asList(array1);
        List asListArray2 = Arrays.asList(array2);
        int sum = Collections.frequency(asListArray1,valueToEvaluate) +
                Collections.frequency(asListArray2,valueToEvaluate);
        return sum;
    }

    public Integer mostCommon(Integer[] array) {

        //Integer[] array1 = new Integer[newList.size()];
        //ArrayUtility arrayUtility = new ArrayUtility();
      //  return arrayUtility.mostCommon(newList.toArray(array));
        return null;
    }
}
