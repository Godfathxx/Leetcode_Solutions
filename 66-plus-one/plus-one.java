class Solution {
    public int[] plusOne(int[] d) {
        int n = d.length;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a.add(d[i]);

        }
        int k=a.size();
        for (int i = n - 1; i >= 0; i--) {
            if (a.get(i) < 9) 
            {
                a.set(i, a.get(i) + 1);
                return a.stream().mapToInt(Integer::intValue).toArray();
            } 
            else 
            {
                a.set(i, 0);
            }
        }
        a.add(0, 1);
        return a.stream().mapToInt(Integer::intValue).toArray();
        
    }
}