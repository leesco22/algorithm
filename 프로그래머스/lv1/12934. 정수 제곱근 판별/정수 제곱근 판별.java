class Solution {
    public long solution(long n) {
        long answer = 0;
        
        long longSquare = (long) (int) Math.sqrt(n);

        if(longSquare * longSquare == n) {
            answer = (longSquare+1) * (longSquare+1);
        } else {
            answer = -1;
        }
        System.out.println(answer);

        return answer;
    }
}