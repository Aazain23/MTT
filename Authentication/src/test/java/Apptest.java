import static org.junit.Assert.*;

import org.junit.Test;

import App.App;
import junit.framework.TestCase;
import junit.framework.TestSuite;


	public class Apptest 
    extends TestCase
{
 
	
    public void testAuthenticateSuccess() {
        assertTrue(App.authenticate("ram", "3025"));
    }

    
    public void testAuthenticateFailure() {
        assertFalse(App.authenticate("wronguser", "wrongpass"));
    }



}
