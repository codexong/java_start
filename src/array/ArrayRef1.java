package array;

public class ArrayRef1 {

    public static void main(String[] args) {

        int[] students; //int형 배열 변수 선언

        students = new int[5]; //int가 5개 있는 배열

        System.out.println(students);

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("학생1 점수 : " + students[0]);
        System.out.println("학생1 점수 : " + students[1]);
        System.out.println("학생1 점수 : " + students[2]);
        System.out.println("학생1 점수 : " + students[3]);
        System.out.println("학생1 점수 : " + students[4]);

    }
}
