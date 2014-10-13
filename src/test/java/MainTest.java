import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

public class MainTest extends TestCase {

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MainTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testMain()
    {
        assertTrue( true );
    }

} 
