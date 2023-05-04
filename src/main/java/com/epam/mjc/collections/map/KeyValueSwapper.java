package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        for(int i =1;i<sourceMap.size()+1;i++){

            if(sourceMap.get(i)!=null)hashMap.put(sourceMap.get(i),i);
        }
        return hashMap;
    }
}
