public class Tutor extends Teacher {
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;

    // Constructor
    public Tutor(int teacherId, String teacherName, String address, String workingType, String employmentStatus, int workingHours, double salary,
                 String specialization, String academicQualifications, int performanceIndex) {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        setWorkingHours(workingHours);
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }

    // Accessor methods 
    public double getSalary() {
        return this.salary;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public String getAcademicQualifications() {
        return this.academicQualifications;
    }

    public int getPerformanceIndex() {
        return this.performanceIndex;
    }

    public boolean getIsCertified() {
        return this.isCertified;
    }

    // Mutator method for salary and isCertified
    public void setSalary(double salary, int performanceIndex) {
        if (performanceIndex >= 5 && getWorkingHours() > 20) {
            double appraisalPercentage;
            if (performanceIndex >= 5 && performanceIndex <= 7) {
                appraisalPercentage = 0.05;
            } else if (performanceIndex >= 8 && performanceIndex <= 9) {
                appraisalPercentage = 0.10;
            } else {
                appraisalPercentage = 0.20;
            }

            this.salary = salary + (appraisalPercentage * salary);
            this.isCertified = true;
            System.out.println("Salary approved. Tutor is  eligible for appraisal.");
        } else {
            System.out.println("Salary cannot be approved. Tutor is not eligible for appraisal.");
        }
    }

    // Method to remove tutor
    public void removeTutor() {
        if (!isCertified) {
            this.salary = 0;
            this.specialization = "";
            this.academicQualifications = "";
            this.performanceIndex = 0;
            this.isCertified = false;
            System.out.println("Tutor removed successfully.");
        } else {
            System.out.println("Certified tutors cannot be removed.");
        }
    }
    
        // Method to display details of the Tutor class
    @Override
    public void display() {
        super.display(); // Call the display method in the superclass

        if (isCertified) {
            System.out.println("The Salary for " + getTeacherName() + " is " + salary);
            System.out.println("The Specialization of " + getTeacherName() + " is " + specialization);
            System.out.println("The Academic Qualifications of " + getTeacherName()+ " is " + academicQualifications);
            System.out.println("The Performance Index of " + getTeacherName()+ " is " + performanceIndex);
        }
    }
}
