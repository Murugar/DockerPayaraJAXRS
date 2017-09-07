package com.iqmsoft.payara.docker.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloResource {

    @GET
    public Response sayHi() {
        return Response.ok("Hello Docker Payara Java EE").build();
    }

}