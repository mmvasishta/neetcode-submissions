class Solution {
    public int jump(int[] nums) {
        int res = 0;
        int l = 0;
        int r = 0;

        while (r < nums.length - 1) {
            int forthest = 0;
            for (int i = l; i < r + 1; i++) {
                forthest = Math.max(forthest, i + nums[i]);
            }
            l = r + 1;
            r = forthest;
            res++;
        }

        return res;
    }
}
