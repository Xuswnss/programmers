package Lv0.배열자르기;

/*
* 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
*  numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을
* return 하도록 solution 함수를 완성해보세요.*/

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        answer = Arrays.copyOfRange(numbers, num1, num2+1);
        return answer;
    }
}