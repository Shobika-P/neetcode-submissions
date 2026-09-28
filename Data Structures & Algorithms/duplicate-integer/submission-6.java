
class Solution {
    public boolean hasDuplicate(int[] nums) {
        int left=0,right= left+1;
        Arrays.sort(nums);
        while(left <right && right<=nums.length-1)
        {
            if(nums[left]==nums[right])
            {
                return true;
            }
            left++;
            right++;
        }
    return false;
    }
}