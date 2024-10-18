class Solution {
    List<List<Integer>> res = new ArrayList();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){
            if(i==0 || nums[i-1]!=nums[i]) twoSum(i+1,nums.length-1,nums,0-nums[i]);
        }
        return res;

    }
    void twoSum(int i, int j,int[] num,int target){
        int a1 = num[i-1];
        while(i<j){
            if(num[i]+num[j] > target) j--;
            else if(num[i]+num[j] < target) i++;
            else {
                List<Integer> list = new ArrayList();
                list.add(a1);
                list.add(num[i]);
                list.add(num[j]);

                res.add(list);

                while(i<j && num[i]==num[i+1]) i++;
                while(i<j && num[j]==num[j-1]) j--;


                i++;
                j--;

            }
        }
    }
}