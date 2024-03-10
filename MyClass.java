public class MyClass {
    public static void main(String[] args) {
        Course course = new Course();
        OfferedCourse myClass = new OfferedCourse();

        course.setCourseTitle("Digital Systems Design");
        course.setCourseNum("ECE287");

        myClass.setInstName("Mark Patterson");
        myClass.setLocation("Wilson Hall 231");
        myClass.setTime("WF: 2-3:30 pm");

        course.printInfo();
        course.printInfo();
        myClass.printDetails();
    }
}
