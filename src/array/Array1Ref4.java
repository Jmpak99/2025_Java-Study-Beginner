package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        // 배열 생성 간략 버전, 배열 선언와 함께 사용 시 new int[] 생략 가능
        int[] students = {90, 80, 70, 60, 50, 40, 30}; // 배열 생성과 초기화


        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }
    }
}
