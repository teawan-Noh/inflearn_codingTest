package main.java.ch01;

import java.util.Scanner;

/**
 * 설명
 *
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 *
 * 예시 입력 1
 * a#b!GE*T@S
 *
 * 예시 출력 1
 * S#T!EG*b@a
 */

public class ReverseSpecificCharacter {
    public String Solution(String str){
        String answer = " ";
        String pattern = "^[a-zA-Z]*$";
        // 순수 문자열 뽑기
        String pureStr = str.replaceAll("[^a-zA-z]","");
        // 역순으로 배치
        StringBuilder sb = new StringBuilder().append(pureStr).reverse();

        for (int i = 0; i < str.length(); i++) {
            if(!str.substring(i, i+1).matches(pattern)){
                sb.insert(i, str.charAt(i));
            }
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        ReverseSpecificCharacter T = new ReverseSpecificCharacter();
        Scanner sc = new Scanner(System.in);
        String str =  sc.next();
        System.out.println(T.Solution(str));
    }
}
