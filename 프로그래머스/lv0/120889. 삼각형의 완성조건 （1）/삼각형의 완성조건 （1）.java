class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
        if(a > b && a > c) { 
            answer = a < (b+c)? 1 : 2;
        } else if(b > a && b > c) {
            answer = b < (a+c)? 1 : 2;
        } else {
            answer = c < (a+b)? 1 : 2;
        }
        return answer;
    }
}