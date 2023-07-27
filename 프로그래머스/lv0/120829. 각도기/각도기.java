class Solution {
    public int solution(int angle) {
        boolean val = 0<angle&&angle<=180;
        int answer = 0;
        if(val) {
            answer = (angle == 180) ? 4 : (angle > 90) ? 3 : (angle == 90) ? 2 : 1;
        }        
        return answer;
    }
}