class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        System.out.println("Size=" + size);
        int pos1 = -1;
        int pos2 = -1;
        for(int i=0; i < size; i++) {
            for(int j=0; j < size; j++) {
                System.out.println("i="+i);
                System.out.println("j="+j);
                if(i != j && (nums[i] + nums[j]) == target) {
                    pos1 = i;
                    pos2 = j;
                    break;
                }
            }
            if(pos1 != -1 && pos2 != -1) {
                break;
            }
        }
        System.out.println("Pos="+pos1+","+pos2);
        return new int[]{pos1,pos2};
    }
}