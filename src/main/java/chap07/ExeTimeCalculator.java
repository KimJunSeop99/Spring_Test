package chap07;

/**
 * packageName : chap07
 * fileName : ExeTimeCalculator
 * author : init
 * date : 2022/05/11
 * description : 팩토리얼 측정할 때 시간 (나노시간 측정), 공통 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/11         init          최초 생성
 */
public class ExeTimeCalculator implements Calculator {
    private Calculator delegate;

    //    생성자의 매개변수를 통해
    public ExeTimeCalculator(Calculator delegate) {
        this.delegate = delegate;
    }

    @Override
    public long factorial(long num) {
        //    1) 실행전 시간 : 나노시간 측정
        long start = System.nanoTime(); // 나노 시간 측정
//        팩토리얼 실행
        long result = delegate.factorial(num);
//        2) 실행 후 시간 : 나노시간 측정
        long end = System.nanoTime();

//        실행시간 출력
        System.out.println("factorial 실행 시간 : " + (end - start));
        return 0;
    }
}
