package org.alquama00s.blog.controller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.alquama00s.blog.entity.Blog;
import org.alquama00s.blog.service.BlogService;

@ApplicationScoped
@Path("blog")
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
        return blogService.saveBlog(blog);
    }



}
