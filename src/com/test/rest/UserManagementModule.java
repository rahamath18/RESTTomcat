package com.test.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

// http://localhost:8080/RESTTomcat/user-management/users
 
@ApplicationPath("/user-management")
public class UserManagementModule extends Application 
{
    @GET
    @Path("/users")
    public Response getAllUsers()
    {
        String result = "<h1>RESTful Demo Application</h1>In real world application, a collection of users will be returned !!";
        return Response.status(200).entity(result).build();
    }
}

