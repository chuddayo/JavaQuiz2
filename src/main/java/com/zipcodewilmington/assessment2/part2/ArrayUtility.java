package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        List<Integer> arrayCopy1 = new ArrayList<>(Arrays.asList(array1));
        List<Integer> arrayCopy2 = new ArrayList<>(Arrays.asList(array2));
        List<Integer> mergedList = new ArrayList<>();

        while (arrayCopy1.size() - arrayCopy2.size() > 1) {
            mergedList.add(arrayCopy1.get(arrayCopy1.size()-1));
            arrayCopy1.remove(arrayCopy1.size()-1);
            mergedList.add(arrayCopy1.get(arrayCopy1.size()-1));
            arrayCopy1.remove(arrayCopy1.size()-1);
            mergedList.add(arrayCopy2.get(arrayCopy2.size()-1));
            arrayCopy2.remove(arrayCopy2.size()-1);
        }

        mergedList.addAll(arrayCopy1);
        mergedList.addAll(arrayCopy2);

        return mergedList.toArray(new Integer[0]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        index = index % array.length;
        List<Integer> arrayCopy = new ArrayList<>(Arrays.asList(array));
        List<Integer> rotated = new ArrayList<>(arrayCopy.subList(index, arrayCopy.size()));
        rotated.addAll(arrayCopy.subList(0, index));
        return rotated.toArray(new Integer[0]);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer[] mergedArray = merge(array1, array2);
        Integer counter = 0;
        for (Integer i : mergedArray) {
            if (i == valueToEvaluate) counter++;
        }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        List<Integer> arrayCopy = new ArrayList<>(Arrays.asList(array));
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer i : arrayCopy) {
            if (frequencyMap.containsKey(i)) {
                int currentFreq = frequencyMap.get(i);
                frequencyMap.put(i, currentFreq + 1);
            } else {
                frequencyMap.put(i, 1);
            }
        }
        int max = Collections.max(frequencyMap.values());
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == max) return entry.getKey();
        }
        return null;
    }
}
