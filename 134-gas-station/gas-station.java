class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int yt=0;
        int n=gas.length;
        int k=0;
        int j=0;
        int rf=0;
        int si=0;
        for(int i=0;i<n;i++)
        {
            k=k+gas[i];
            j=j+cost[i];
        }
        if(k<j)
        {
            return -1;
        }
        for(int i=0;i<n;i++)
        {
            rf=rf+gas[i]-cost[i];

             if(rf<0)
            {
                si=i+1;
                rf=0;
            }
        }
        return si;        
    }
}