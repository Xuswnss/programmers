package Lv0.나머지_구하기;

/*
* 정수 num1, num2가 매개변수로 주어질 때,
* num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.

 */
class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 % num2;
        return answer;
    }// end solution

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3, 3));
    }
}// end Solution