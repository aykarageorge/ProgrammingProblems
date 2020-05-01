// Runtime: 1 ms
// Memory Usage: 40.7 MB

class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length-1, tmp;
        int greatest = -1;
        for(int i=n; i>=0; i--) {
            tmp = arr[i];
            arr[i] = greatest;
            greatest = Math.max(greatest, tmp);
        }
        return arr;
    }
}
