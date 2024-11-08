package org.alquama00s.controller;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@ApplicationScoped
@Path("/status")
public class Status {

    @Path("/")
    @GET
    public String status(){
        return "Hello World";
    }

}
