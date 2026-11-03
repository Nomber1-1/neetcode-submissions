class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int count = 0;
        for (Integer num: nums) {
            if (num == 0) {
                ans = Math.max(count, ans);
                count = 0;
                continue;
            }
            count += 1;
        }
        ans = Math.max(count, ans);
        return ans;
    }
}