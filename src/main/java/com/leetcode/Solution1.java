package com.leetcode;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int iNum1 = nums[i];
            int iNum2 = target - iNum1;

            int iIndexNum2 = hm.getOrDefault(iNum2, -1);

            if (iIndexNum2 > -1) {
                return new int[]{iIndexNum2, i};
            }

            hm.put(iNum1, i);

            if (iNum1 != iNum2) {
                hm.put(iNum2, -1);
            }
        }
        return new int[]{};
    }
}
