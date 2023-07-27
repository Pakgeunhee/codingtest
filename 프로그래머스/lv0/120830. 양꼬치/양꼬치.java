class Solution {
    public int solution(int n, int k) {
        boolean val = (0<n&&n<1000) && ((n/10)<=k&&k<1000);
        int answer = 0;
        int service = n / 10;
        if(val) {
            answer = (n * 12000) + ((k-service) * 2000);
        }
        return answer;
    }
}