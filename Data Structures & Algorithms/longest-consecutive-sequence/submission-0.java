class Solution {
    public int longestConsecutive(int[] nums) {
        int longestSequenceSize = 0;

       Set<Integer> numsSet = new HashSet();;

       for(int num : nums) {
        numsSet.add(num);
       }

       for (int num : nums) {
        if (!numsSet.contains(num-1)) {
            int sequence = num;
            int sequenceSize = 1;
            while (numsSet.contains(sequence + 1)) {
                sequence++;
                sequenceSize++;
            }
            longestSequenceSize = Math.max(longestSequenceSize, sequenceSize);
        }

       }

       return longestSequenceSize;
        
    }
}
