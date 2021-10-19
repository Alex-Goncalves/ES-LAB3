import java.util.Collection;

/**
 * Class representing CourseExecution
 */
public class CourseExecution {

    /**
     * Default constructor
     */
    public CourseExecution() {

    }

    /**
     * CourseExecution year
     */
    public int year;

    /**
     * CourseExecution semester
     */
    public ESemester semester;

    /**
     * Students that are in the CourseExecution
     */
    private Collection<Student> students;

    /**
     * Supports of the CourseExecution
     */
    private Collection<Support> supports;

    /**
     * CourseExecution course
     */
    private Course course;
}
