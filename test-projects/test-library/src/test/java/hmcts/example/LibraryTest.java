package hmcts.example;

import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod not be null", classUnderTest != null);
    }

    public void mustGenerateUncheckedWarning() {
        ArrayList a = new ArrayList<Integer>();
        a.add(1);
    }
}
