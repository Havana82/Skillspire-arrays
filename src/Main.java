public class Main {
    public static void main(String[] args) {

        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }
        System.out.println("Done");
        String[] students = {"Cate", "Mark", "Anthony", "Jacob", "Robert"};
        double[] grades = {5.0, 2.5, 4.2, 4.0, 5.0};
        System.out.println(getStudentGrades(2, students, grades));
    }

    public static String getStudentGrades(int ind, String[] student, double[] grades){
        return "Student:"+ student[ind] + "Grade:" + grades[ind];
    }


}