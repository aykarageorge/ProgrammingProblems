// Runtime: 1 ms
// Memory Usage: 38.7 MB

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(long num : nums) {
            if(Long.toString(num).length()%2 == 0)
                count++;
        }
        return count;        
    }
}
