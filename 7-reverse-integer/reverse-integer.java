class Solution {
    public int reverse(int x) {
int rev=0;
      if(x<0)
      {
        x=-x;
      
      while(x>0)
      {
        int k=rev;
        rev=(rev*10)+(x%10);
        if(k!=rev/10)
        return 0;
        x=x/10;
      }
      rev=-rev;
      }
      else{
       while(x>0)
      {
        int k=rev;
        rev=(rev*10)+(x%10);
        if(k!=rev/10)
        return 0;

        x=x/10;
    
      }}


      return rev; 



    }
}