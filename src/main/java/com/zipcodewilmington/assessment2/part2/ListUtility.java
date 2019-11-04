package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ListUtility {
    List<Integer> list;

    public ListUtility() {
        this.list = new ArrayList<>();
    }


    public Boolean add(int i) {
        return list.add(i);
    }

    public Integer size() {

        return list.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> unique = new HashSet<Integer>(list);
        return Arrays.asList(unique.toArray(new Integer[unique.size()]));
    }

    public String join() {

        List<String> list = Arrays.asList();
        String result = String.join(",", list);
        return result;
    }

    public Integer mostCommon() {
//        list<Integer> common = new ArrayList<Integer>(list);
//        return Arrays.asList(common.toArray(new Integer[common.size()]));


        return null;

    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
