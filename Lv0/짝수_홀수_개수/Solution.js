function solution(num_list) {
    let answer = [0,0];
    for(let num of num_list){
        if(num % 2 === 0){
            answer[0]++;
        }else{
            answer[1]++;
        }
    }
    return answer;
}