package com.lsh.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q17 {
    static Map<String, String> map = new HashMap<>();

    static {

        map.put("2", "abc");
        map.put("3", "def");
//             map.put("4", "abc");
//             map.put("5", "abc");
//             map.put("6", "abc");
//             map.put("7", "abc");
//             map.put("8", "abc");
//             map.put("9", "abc");

    }

    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        String[] split = digits.split("");
        for (int i = 0; i < split.length; i++) {

        }
        return result;
    }

    void dfs (String num, int index,List<String> result){}

    public static void main(String[] args) {
        System.out.println(letterCombinations("2c"));
    }
}
