class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> numsCount = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (numsCount.get(nums[i]) != null && numsCount.get(nums[i]) == 1) {
                return true;
            }
            numsCount.put(nums[i], 1);
        }
        return false;
    }
}
