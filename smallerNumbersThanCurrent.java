class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] cnt=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            cnt[i]=0;
            for(int j=0;j<nums.length;j++){
                 
                if(nums[i]>nums[j]){
                   cnt[i]=cnt[i]+1;
                }

            }
        }
       return cnt; 
    }
}