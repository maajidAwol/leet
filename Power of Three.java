class Solution {
    public boolean isPowerOfThree(int n) {
        boolean b=false;
                   if(n==1){
                 b=true;
            }
        while(n>1 && n!=0){
 
            
            if(n%3==0){
                n=n/3;
              if(n==1){
              b=true;
              break;
        }
            }
            else{
            b=false;
            break;
            }
        }
     return b;   
    }
}