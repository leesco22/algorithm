class Solution {
    public int solution(int[][] sizes) {
        int l_max = 1;
        int s_max = 1;

        for(int i = 0; i < sizes.length; i++){
            int longer = Math.max(sizes[i][0], sizes[i][1]);
            int shorter = Math.min(sizes[i][0], sizes[i][1]);

            if(longer > l_max) {
                l_max = longer;
            }
            if(shorter > s_max) {
                s_max = shorter;
            }
        }

        return l_max * s_max;
    }
}