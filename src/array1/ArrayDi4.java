package array1;

public class ArrayDi4 {
    public static void main(String[] args) {

        //2행 3열 이차원 배열 -> 행이 배열의 길이
        int[][] arr = new int[4][4];

        int i = 1;
        for(int row = 0; row< arr.length; row++){

            for(int col = 0; col < arr[row].length; col++){

                arr[row][col] = i++;
            }
        }
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
