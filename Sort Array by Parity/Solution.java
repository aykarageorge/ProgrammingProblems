// Runtime: 1 ms
// Memory Usage: 40.5 MB

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int n = A.length-1, tmp, idx = 0;
        for(int i=n; i>idx; i--)
            if(A[i]%2 == 0)
                for(; idx<i; idx++)
                    if(A[idx]%2 != 0) {
                        tmp = A[i];
                        A[i] = A[idx];
                        A[idx] = tmp;
                        break;
                    }
        return A;
    }
}
