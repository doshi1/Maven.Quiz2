package com.zipcodewilmington.assessment2.part2;
import java.lang.reflect.Array;
import java.util.*;
import java.util.HashMap;

public class Router {
    HashMap<String, String> map;

    public Router(){
        this.map = new HashMap<String, String>();
    }
    public void add(String path, String controller) {
        map.put(path,controller);
    }

    public Integer size() {
        return map.size();
    }


    public String getController(String path) {

        return map.get(path);
    }

    public void update(String path, String studentController) {
        map.remove(path);
        map.put(path, studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }
}
