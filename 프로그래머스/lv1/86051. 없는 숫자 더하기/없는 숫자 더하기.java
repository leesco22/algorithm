import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 0;
        Arrays.sort(numbers);
        
        for(int i = 0; i<numbers.length; i++)
        {
            sum = sum + numbers[i];
        }
        sum = 45 - sum;
        answer = sum;
        
        return answer;
    }
}