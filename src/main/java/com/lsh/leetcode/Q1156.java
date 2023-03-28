package com.lsh.leetcode;

public class Q1156 {

    public int maxRepOpt1(String text) {
        if (text == null) {
            return 0;
        }
        if (text.length() == 1) {
            return 1;
        }
        int anx = 0, l = 0, r = 0;
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char start = chars[l];
            while (r < chars.length) {
                r++;
                if (start == chars[r]) {
                    continue;
                } else {

                }

            }
        }
        return 0;
    }
}
