//1480. Running Sum of 1d Array

package leetcode75.level1.task1;

class Solution {
    public static int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        int temp = 0;
        for (int i = 0; i < nums.length; i++){
            sums[i] = temp + nums[i];
            temp = sums[i];
        }
        return sums;
    };
}

