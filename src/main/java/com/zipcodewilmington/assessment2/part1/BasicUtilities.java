package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        return value >= 5;
    }

    public Boolean isLessThan7(Integer value) {
        return value <= 7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        return isGreaterThan5(valueToEvaluate) && isLessThan7(valueToEvaluate);
    }

    public Boolean startsWith(String string, Character character) {
        string = string.toLowerCase();
        character = Character.toString(character).toLowerCase().charAt(0);
        return string.charAt(0) == character;
    }
}
