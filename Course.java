public class Course {
    // Base class
    private String courseTitle;
    private String courseNum;

    public void setCourseTitle(String classTitle) {
        courseTitle = classTitle;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseNum(String classNum) {
        courseNum = classNum;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public void printInfo(){
        System.out.println("Course Information:");
        System.out.println("\tCourse Number: " + courseNum);
        System.out.println("\tCourse Title: " + courseTitle);
    }
}