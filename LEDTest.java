package LEDButton;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LEDTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LEDTest
{
    /**
     * Default constructor for test class LEDTest
     */
    public LEDTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        System.out.println("starting Mike...");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
                System.out.println("finishing Mike...");
    }

    @Test
    public void LEDflash()
    {
        LEDButton.LED lED1 = new LEDButton.LED(6);
        lED1.on();
        lED1.off();
        lED1.on();
    }
}

