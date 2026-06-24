class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int pos1 = -1;
        int pos2 = -1;
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<size;i++) {
            int diff = target - nums[i];
            System.out.println("diff" + diff);
            if(!map.containsKey(diff)) {
                System.out.println("map.put=" + nums[i] + "pos=" + i);
                map.put(nums[i], i);
            } else {
                System.out.println("map.get" + map.get(diff));
                pos1=map.get(diff);
                pos2=i;
                break;
            }
        } 
        System.out.println("Pos="+pos1+","+pos2);
        return new int[] {pos1,pos2};
    }
}
