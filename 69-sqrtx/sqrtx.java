class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        long i;
        for (i = 1; i <= x / 2; i++) { 
            if (i * i == x) {
                return (int)i;
            }
            if (i * i < x && (i + 1) * (i + 1) > x) {
                return (int)i;
            }
        }
        return (int)i;

    }
}