class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int prev = 1;

        for (int i = 0; i < nums.length; i++) {
            res[i] = prev;
            prev = prev * nums[i];       
        }

        int post = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            res[j] = res[j] * post;
            post = post * nums[j];
        }

        return res;
    }
}
