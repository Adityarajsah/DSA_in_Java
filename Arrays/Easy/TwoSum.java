class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int remaining = target - nums[i];
            if(map.containsKey(remaining)){
                int index = map.get(remaining);
                return new int[] {i,index};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}