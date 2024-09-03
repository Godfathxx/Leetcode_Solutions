class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        char a[]=new char[n];
        char b[]=new char[n];

        a=s.toCharArray();
        b=t.toCharArray();

        if(s.length()!=t.length())
        {
            return false;
        }
        int c=0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++)
        {
            if(a[i]==b[i])
            {
                c++;
            }
        }
        if(c==n)
        {
            return true;
        }
        return false;
        
    }
}