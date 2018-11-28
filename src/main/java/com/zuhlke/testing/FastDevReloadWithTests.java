package com.zuhlke.testing;

import com.atlassian.annotations.security.XsrfProtectionExcluded;
import com.atlassian.plugin.spring.scanner.annotation.component.Scanned;
import com.atlassian.plugin.spring.scanner.annotation.export.ExportAsService;
import com.atlassian.plugins.rest.common.security.AnonymousAllowed;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

/**
 * A resource of base URL.
 */
@Provider
@Path("/")
@Scanned
@ExportAsService({FastDevReloadWithTests.class})
@Named("atlassian-plugin-test-console-enabler")
public class FastDevReloadWithTests {

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("/reload/withtests")
    @AnonymousAllowed
    @XsrfProtectionExcluded
    public Response withTest() {
        return Response.status(Response.Status.NO_CONTENT).build();
    }

}
