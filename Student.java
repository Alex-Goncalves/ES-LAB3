import java.util.Collection;

/**
 * Class representing Student
 */
public class Student extends UniversityMember {

    /**
     * Default constructor
     */
    public Student() {

    }

    /**
     * Student matNo
     */
    public int matNo;

    /**
     * Each student can have 0 or more cC
     */
    private Collection<CourseExecution> cC;
}
