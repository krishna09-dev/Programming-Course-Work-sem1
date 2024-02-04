public class Teacher {
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;

    // Constructor
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }

    // Accessor methods
    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getAddress() {
        return address;
    }

    public String getWorkingType() {
        return workingType;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    // Mutator method for workingHours
    public void setWorkingHours(int WorkingHours) {
        this.workingHours = WorkingHours;
    }

     // Display method
    public void display() {
        System.out.println("The teacher ID is " + teacherId);
        System.out.println("The name of " + teacherId + " ID is" + teacherName);
        System.out.println("The address of " + teacherName + " is " + address);
        System.out.println("The working type of "+ teacherName + " is " + workingType);
        System.out.println("The employment status of " + teacherName + " is " + employmentStatus);

        if (workingHours > 0) {
            System.out.println("The working hours assigned for " + teacherName + " is " + workingHours);
        } else {
            System.out.println("The working Hours is not assigned yet for " + teacherName);
        }
    }
}


