package array1;

public class ArrayDi1 {

    public static void main(String[] args) {

        //2*3 이차원 배열
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for(int row = 0; row< arr.length; row++){
            System.out.print(arr[row][0] + " ");
            System .out.print(arr[row][1] + " ");
            System.out.print(arr[row][2] + " ");
            System.out.println();
        }
    }
}