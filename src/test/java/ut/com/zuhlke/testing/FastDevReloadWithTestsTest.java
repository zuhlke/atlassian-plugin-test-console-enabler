package ut.com.zuhlke.testing;

import com.zuhlke.testing.FastDevReloadWithTests;
import com.zuhlke.testing.FastDevReloadWithTestsModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;

public class FastDevReloadWithTestsTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void messageIsValid() {
        final FastDevReloadWithTests resource = new FastDevReloadWithTests();

        final Response response = resource.withTest();
        assertEquals("status code", Response.Status.NO_CONTENT.getStatusCode(), response.getStatus());

        final FastDevReloadWithTestsModel message = (FastDevReloadWithTestsModel) response.getEntity();
        assertEquals("wrong message",null, message);
    }
}
