package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        int checkAnswer = (requiredValue-2)/5;
        if(functionMap.containsKey(checkAnswer))return true;
        else return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> hashMap =new HashMap<>();
        for(int i =0;i<sourceList.size();i++)hashMap.put(sourceList.get(i),i);
        return hashMap;
    }
}
