package uk.gov.hmcts;

import java.util.ArrayList;


public class JavaPluginFunctionalTest {
    public void mustGenerateUncheckedWarning() {
        ArrayList a = new ArrayList<Integer>();
        a.add(1);
    }
}
