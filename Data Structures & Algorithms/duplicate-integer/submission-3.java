class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();

        for (Integer num: nums) {
            if (numsSet.contains(num)) {
                return true;
            }
            numsSet.add(num);
        }
        return false;
    }
}