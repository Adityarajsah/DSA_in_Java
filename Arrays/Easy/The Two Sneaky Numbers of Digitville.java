class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length - 2;  
        int[] count = new int[n]; 
        int[] result = new int[2]; 
        int index = 0;

        
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        
        for (int i = 0; i < n; i++) {
            if (count[i] == 2) {
                result[index++] = i;
                if (index == 2) break;  
            }
        }

        return result;
    }
}