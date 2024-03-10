public class OfferedCourse extends Course{
    private String instName;
    private String location;
    private String time;

    public void setInstName(String profName) {
        instName = profName;
    }

    public String getInstName() {
        return instName;
    }

    public void setLocation(String classLoc) {
        location = classLoc;
    }

    public String getLocation() {
        return location;
    }

    public void setTime(String courseTime) {
        time = courseTime;
    }

    public String getTime() {
        return time;
    }

    public void printDetails() {
        System.out.println("\tInstructor Name: " + getInstName());
        System.out.println("\tLocation: " + getLocation());
        System.out.println("\tClass Time: " + getTime());
    }
}
