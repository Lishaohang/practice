package com.lsh.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Test1 {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums ==null || nums.length==0){
            return result;
        }
       boolean[] used = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        dfs(result,list,used,nums,0);
        return result;
    }

    static  void  dfs (List<List<Integer>> result,List<Integer> list,boolean[] used,int[] nums,int index){
        if (list.size() == nums.length){
            result.add(new ArrayList<>(new HashSet<>(list)));
            list = new ArrayList<>();
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]){
                used[i] = true;
                list.add(nums[index]);
                dfs(result,list,used,nums,index+1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
}
