import java.util.Collection;

/**
 * Class representing Employee
 */
public class Employee {

    /**
     * Default constructor
     */
    public Employee() {

    }

    /**
     * Employee acctNo
     */
    private int acctNo;

    /**
     * @return acctNo
     */
    public int getAcctNo() {
        return acctNo;
    }

    /**
     * Each employee can have 0 or more cE
     */
    private Collection<Support> cE;
}
