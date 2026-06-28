class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Set<Integer> duplicates = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (duplicates.contains(nums[i])) return true;
        //     duplicates.add(nums[i]);
        // }
        // return false;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}