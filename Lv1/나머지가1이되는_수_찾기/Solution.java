package Lv1.나머지가1이되는_수_찾기;


class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if(n % i == 1) {
                return answer = i;
            }
        }
      return -1;
    }
}