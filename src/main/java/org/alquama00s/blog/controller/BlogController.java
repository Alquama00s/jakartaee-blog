package org.alquama00s.blog.controller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import lombok.extern.slf4j.Slf4j;
import org.alquama00s.blog.entity.Blog;
import org.alquama00s.blog.service.BlogService;


@Slf4j
@Path("blog")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BlogController {

    @Inject
    BlogService blogService;


    @GET
    @Path("{id}")
    public Blog getBlog(@PathParam("id")long id){
        return blogService.getBlog(id);
    }

    @POST
    public Blog saveBlog(Blog blog){
        log.error(blog.getBlog());
        return blogService.saveBlog(blog);
    }



}
