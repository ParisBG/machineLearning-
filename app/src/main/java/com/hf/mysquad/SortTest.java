package com.hf.mysquad;

import java.util.ArrayList;
import java.util.HashMap;

public class SortTest implements Comparable<SortTest> {
    public static SortTest theObj = new SortTest(22);
    public static SortTest nullObj;

    private String name;
    private int number;
    private static ArrayList<String> testArray;
    private static HashMap<Integer,String> testMap;
    private String age = "29";

    private static final String DUH = "DUH";

    public SortTest(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(SortTest st){
        return Integer.compare(number, st.number);
    }

    @Override
    public String toString(){
        return String.valueOf(number);
    }

    public String getAge() {
        return age;
    }

    public void loadAllVariables(){
        testArray = new ArrayList<>();
        testMap = new HashMap<>();

        for (int x = 0; x < 10; x++){
            testArray.add("test_String"+ x);
            testMap.put(x,"map_Test" + (x+10));
        }
        setName("Paris");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<String> getTestArray() {
        return testArray;
    }

    public HashMap<Integer, String> getTestMap() {
        return testMap;
    }
}
