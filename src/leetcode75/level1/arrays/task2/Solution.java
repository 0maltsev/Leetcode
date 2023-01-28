// 724. Find Pivot Index

package leetcode75.level1.arrays.task2;

public class Solution {
    public static int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            int sumLeft = 0;
            int sumRight = 0;
            int leftPointer = 0;
            int rightPointer = nums.length - 1;
            while (leftPointer < i){
                sumLeft = sumLeft + nums[leftPointer];
                leftPointer++;
            };
            while (rightPointer > i){
                sumRight = sumRight + nums[rightPointer];
                rightPointer = rightPointer - 1;
            };
            if (sumRight == sumLeft){
                return i;
            }
        };
        return -1;
    };
}
