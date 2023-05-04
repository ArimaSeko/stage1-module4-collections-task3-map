package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        HashMap<String,Integer> hm = new HashMap<>();
        StringTokenizer st1 = new StringTokenizer(sentence, " ,.");
        while (st1.hasMoreTokens()){
            String t = st1.nextToken().toLowerCase();
            if(hm.containsKey(t))hm.replace(t,hm.get(t)+1);
            else hm.put(t,1);
        }

        return hm;
    }
}
