package array;

public class ArrayRef2 {

    public static void main(String[] args) {

        int[] students; //int형 배열 변수 선언

//        선언과 동시에 초기화
//        students = new int[]{90, 80, 70 ,60, 50, 40};

        students = new int[5]; //int가 5개 있는 배열

        System.out.println(students);

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for(int i = 0; i < students.length; i++){
            System.out.println("학생" + (i+1) + "점수 : " + students[i]);
        }

    }
}
