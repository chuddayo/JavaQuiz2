package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListUtility {
    List<Integer> integerList;
    public ListUtility() {
        integerList = new ArrayList<>();
    }
    public Boolean add(Integer i) {
        return integerList.add(i);
    }

    public Integer size() {
        return integerList.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> uniqueIntegers = new HashSet<>(integerList);
        return new ArrayList<>(uniqueIntegers);
    }

    public String join() {
        if (integerList.size() == 1) return Integer.toString(integerList.get(0));
        StringBuilder joinedString = new StringBuilder();
        for (int i = 0; i < integerList.size()-1; i++) {
            joinedString.append(integerList.get(i)).append(", ");
        }
        joinedString.append(integerList.get(integerList.size() - 1));
        return joinedString.toString();
    }

    public Integer mostCommon() {
        Integer[] integerArray = integerList.toArray(new Integer[0]);
        return ArrayUtility.mostCommon(integerArray);
    }

    public Boolean contains(Integer valueToAdd) {
        return integerList.contains(valueToAdd);
    }
}
