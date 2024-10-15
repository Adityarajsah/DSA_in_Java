class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target) return i;
        }
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]<target && target<nums[j]) return j;
            }
        }

        if(nums[nums.length-1]<target) return nums.length;
        else return 0;
    }
}