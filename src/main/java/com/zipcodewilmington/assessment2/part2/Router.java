package com.zipcodewilmington.assessment2.part2;

import sun.awt.image.ImageWatched;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Router {
    LinkedHashMap<String, String> routerAddresses;
    LinkedHashMap<String, String> duplicateAddresses;
    public Router() {
        routerAddresses = new LinkedHashMap<>();
        duplicateAddresses = new LinkedHashMap<>();
    }
    public void add(String path, String controller) {
        if (routerAddresses.containsKey(path)) {
            duplicateAddresses.put(path, controller);
        } else {
            routerAddresses.put(path, controller);
        }
    }
    public Integer size() {
        return routerAddresses.size();
    }

    public String getController(String path) {
        return routerAddresses.get(path);
    }

    public void update(String path, String studentController) {
        routerAddresses.put(path, studentController);
    }
    public void remove(String path) {
        routerAddresses.remove(path);
    }
    @Override
    public String toString() {
        StringBuilder mapString = new StringBuilder();
        for (Map.Entry<String, String> entry : routerAddresses.entrySet()) {
            mapString.append(entry.getKey()).append(entry.getValue()).append("\n");
        }
        for (Map.Entry<String, String> entry : duplicateAddresses.entrySet()) {
            mapString.append(entry.getKey()).append(entry.getValue()).append("\n");
        }
        return String.valueOf(mapString);
    }
}
