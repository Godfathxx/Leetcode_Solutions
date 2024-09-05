class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int count=0;

        String a[]=s.split(" ");
        return a[a.length-1].length();
    }

}