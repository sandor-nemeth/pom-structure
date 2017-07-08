/**
 * Copyright © 2017 Corporation
 *
 * All rights reserved.
 */
package com.github.sandornemeth;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * A service saying hello.
 *
 * @author Sandor Nemeth <sandor.nemeth.1986@gmail.com>
 */
@Path("/sayHello")
public interface HelloService {

    /**
     * Say hello to somebody.
     *
     * @param to whom we should say hello
     * @return the hello
     */
    @GET
    @Path("/{to}")
    @Produces(MediaType.TEXT_PLAIN)
    String sayHello(@PathParam("to") String to);

}
