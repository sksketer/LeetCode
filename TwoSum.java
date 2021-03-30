// 1. Two Sum
//     Easy
//     Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//     You may assume that each input would have exactly one solution, and you may not use the same element twice.
//     You can return the answer in any order.

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i=0; i<nums.length; i++) {
            int p1, p2;
            p1 = nums[i];
            p2 = target - p1;
            for(int j=0; j<nums.length; j++) {
                if(i == j)
                    continue;
                if(p2 == nums[j]) {
                    arr[0] = i;
                    arr[1] = j;
                }                    
            }
        }
        return arr;
    }
}

