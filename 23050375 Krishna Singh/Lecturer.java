public class Lecturer extends Teacher {
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;

    // Constructor
    public Lecturer(int teacherId, String teacherName, String address, String workingType,
                    String employmentStatus, int workingHours, String department, int yearsOfExperience) {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        setWorkingHours(workingHours);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;
    }


    // Accessor methods
    public String getDepartment() {
        return this.department;
    }

    public int getYearsOfExperience() { 
        return this.yearsOfExperience;
    }

    public int getGradedScore() {
        return this.gradedScore;
    }

    public boolean getHasGraded() {
        return this.hasGraded;
    }

    // Mutator method for gradedScore
    public void setGradedScore(int gradedScore) {
        this.gradedScore = gradedScore;
    }

    // Method to grade assignments
    public void gradeAssignment(int gradedScore, String department , int yearsOfExperience) {
        if (yearsOfExperience >= 5 && this.department==department) {
            if (gradedScore >= 70) {
                System.out.println("Grade obtained is A");
            } else if (gradedScore >= 60) {
                System.out.println("Grade obtained is B");
            } else if (gradedScore >= 50) {
                System.out.println("Grade obtained is C");
            } else if (gradedScore >= 40) {
                System.out.println("Grade obtained is D");
            } else {
                System.out.println("Grade obtained is E");
            }
            hasGraded = true;
            this.gradedScore = gradedScore;
            System.out.println("Assignments graded.");
        }
        else{
            System.out.println("Sorry, Lecturer does not meet the criteria to grade assignments.");
        }
    }

    // Method to display details of the Lecturer
    @Override
    public void display() {
        super.display(); // Call the display method in the superclass

        System.out.println("The department of " + getTeacherName() + " is " + department);
        System.out.println("The years of Experience of " + getTeacherName() + " is " + yearsOfExperience);

        if (hasGraded) {
            System.out.println("The graded Score by " + getTeacherName() + " is " + gradedScore);
        } else {
            System.out.println("The Assignments is not yet graded by " + getTeacherName());
        }
    }
}


