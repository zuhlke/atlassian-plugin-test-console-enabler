package it.com.zuhlke.testing;

import org.apache.wink.client.ClientResponse;
import org.apache.wink.client.Resource;
import org.apache.wink.client.RestClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;

public class FastDevReloadWithTestsFuncTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void messageIsValid() {

        final String baseUrl = System.getProperty("baseurl");
        final String resourceUrl = baseUrl + "/rest/fastdev/1.0/reload/withtests";

        final RestClient client = new RestClient();
        final Resource resource = client.resource(resourceUrl);

        final ClientResponse clientResponse = resource.contentType("application/json").post("{}");
        assertEquals("status code", Response.Status.NO_CONTENT.getStatusCode(), clientResponse.getStatusCode());

    }
}
