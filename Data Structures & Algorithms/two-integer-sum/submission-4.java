class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> counter = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int req = target - nums[i];

            if (counter.containsKey(req)) {
                return new int[]{counter.get(req), i};
            }

            counter.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
