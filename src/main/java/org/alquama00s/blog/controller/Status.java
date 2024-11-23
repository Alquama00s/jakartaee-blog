package org.alquama00s.blog.controller;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import javax.naming.*;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ApplicationScoped
@Path("/status")
@Produces(MediaType.APPLICATION_JSON)
public class Status {

    @Path("/")
    @GET
    public String status(){
        return "v1";
    }

    @Path("ds")
    @GET
    public Map<String,Object> checkDataSource() throws NamingException {
        InitialContext ctx = new InitialContext();

        DataSource ds =  (DataSource) ctx.lookup("jdbc/blog");

        return Map.of("db",ds.toString());
    }

}
