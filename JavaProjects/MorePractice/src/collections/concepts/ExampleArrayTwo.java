package collections.concepts;

/**
 * Created by Tunde on 20/11/2016.
 */
public class ExampleArrayTwo {

    private int[] studentAges;

    public ExampleArrayTwo(){

        studentAges = new int[5];
        studentAges[0] = 23;
        studentAges[1] = 25;
        studentAges[2] = 30;
        studentAges[3] = 20;
        studentAges[4] = 35;
    }

    public void showMyStudentAges(){

        for (int studentAge:
             studentAges) {
            if(studentAge >= 30){
                System.out.println("Old Student, your age is: ");
            }
            else {
                System.out.println("Young student, your age is:");
            }
            System.out.println(studentAge);
        }

    }

    public String findStudentAge(int studentAge){

        for (int age : studentAges){
            if (age == studentAge){
                return "Yes";
            }
        }
        return "No";
    }

    public int getTotalStudents(){  //total number of student is the length of the array
        return studentAges.length;
    }
}
