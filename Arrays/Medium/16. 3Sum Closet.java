class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            int fixed = nums[i];
            int start = i + 1;
            int end = nums.length - 1;

            while(start<end){
                 int sum = fixed + nums[start] + nums[end];
                if (Math.abs(target - sum) < Math.abs(target - res)) {
                    res = sum;
                }
                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return res;
    }
}