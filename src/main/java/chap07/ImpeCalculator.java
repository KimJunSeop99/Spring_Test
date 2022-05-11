package chap07;

/**
 * packageName : chap07
 * fileName : ImpeCalculator
 * author : init
 * date : 2022/05/11
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/11         init          최초 생성
 */
public class ImpeCalculator implements Calculator{

    @Override
    public long factorial(long num) {
//          팩토리얼의 결과를 저장할 변수
//          팩토리얼 : 지정된 숫자 만큼 계속 곱셈
//          1) 개발자가 팩토리얼 계산에 필요한 살향사건울 측정하고자 함
//        2) 실행 전에 미리 시간 계산 : a
//        3) 실행 종류 후 시간 측정 : b
//        4) 실행 b-a = 실행 시간

//        2) 실행 전에 시간 측정
//       long start = System.currentTimeMillis(); // 밀리초(ms) 시간 측정

//        단축키 for문 : fori
        long result = 1;
        for(long i=1; i<= num; i++) {
            result *= i;
        }
//        3) 실행 후 종료 시간 측정
        long end = System.currentTimeMillis(); // 밀리초(ms) 시간 측정
//        System.out.println("ImpeCalculator : 팩토리얼 계산 실행 시간 : " + (end - start));
        return 0;
    }
}
