class Solution {
    public int pivotIndex(int[] nums) {
        int index=-1;
        
        for(int i=0;i<nums.length;i++)
        {
            int suml=0;
        int sumr=0;
            if(i!=0){
            for(int k=i-1;k>=0;k--){
                suml=suml+nums[k];
            }}
            if(i!=nums.length){
          for(int j=i+1;j<nums.length;j++){
             sumr=sumr+nums[j];
          }}
          if(suml==sumr){
              index=i;
              break;
          }
         
        }
   return index;     
    }
}