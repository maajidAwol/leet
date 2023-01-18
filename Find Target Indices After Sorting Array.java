class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ab=new ArrayList<>();
        
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp;
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        
        for(int k=0;k<nums.length;k++){
            if(target==nums[k]){
                ab.add(k);
            }
        }return ab;
    }
}
