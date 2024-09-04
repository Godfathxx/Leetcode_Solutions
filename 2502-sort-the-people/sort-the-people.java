class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int temp;
        String s="";
        int n=names.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(heights[j]<heights[j+1])
                {
                    temp=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=temp;

                    s=names[j];
                    names[j]=names[j+1];
                    names[j+1]=s;
                

                }

            }
        }
        return names;

        
    }
}