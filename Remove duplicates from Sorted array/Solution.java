// Runtime: 0 ms
// Memory Usage: 41 MB

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length>0){
            int tmp = nums[0], len = 1;
            for(int i=1; i<nums.length; i++) {
                if(tmp == nums[i])
                    continue;
                nums[len++]=nums[i];
                tmp = nums[i];
            }
            return len;
        }
        return 0;
        
    }
}
