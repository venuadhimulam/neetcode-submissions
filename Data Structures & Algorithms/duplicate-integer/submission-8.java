class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> counter = new ArrayList<>();

        for (int num : nums) {
            if (counter.contains(num)) {
                return true;
            }
            counter.add(num);
        }

        return false;
    }
}