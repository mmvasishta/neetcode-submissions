class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        
        for (char c : tasks) {
            count[c - 'A']++;
        }

        Arrays.sort(count);

        int maxf = count[25];

        int idle = (maxf - 1) * n;

        for (int i = 24; i >= 0 ; i--) {
            idle = idle - Math.min(count[i], maxf - 1);
        }

        return Math.max(idle, 0) + tasks.length;
        
    }
}
