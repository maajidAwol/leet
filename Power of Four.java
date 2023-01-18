class Solution {
    public boolean isPowerOfFour(int n) {
        boolean b=false;
                   if(n==1){
                 b=true;
            }
        while(n>1 && n!=0){
 
            
            if(n%4==0){
                n=n/4;
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