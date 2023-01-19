class Solution {
    
    public int fib(int n) {
       int x=0,y=1,r=1;
       if (n==0){
       x=0; 
       r=x;}
       if (n==1)
       {y=1; 
 r=y;}
       for(int i=2;i<=n && n>=2;i++){
           
           r=x+y;
           x=y;
           y=r;
       }
       return r;
    }
}
