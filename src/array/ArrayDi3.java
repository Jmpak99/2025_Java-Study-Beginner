package array;

public class ArrayDi3 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다
        int[][] arr = {
            {1,2,3,},
            {4,5,6,}
        }; //행 2, 열 3

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " "); //0열 출력
            }
            System.out.println();
        }
    }
}
