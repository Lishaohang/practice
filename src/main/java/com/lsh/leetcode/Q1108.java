package com.lsh.leetcode;

public class Q1108 {

    public static String defangIPaddr(String address) {
        if (address ==null || "".equals(address) )
            return address;
        return address.replaceAll("\\.","[\\.]");
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1"));
    }
}
