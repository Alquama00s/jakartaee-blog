package org.alquama00s.blog.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.alquama00s.blog.entity.Blog;

@Transactional
@ApplicationScoped
public class BlogService {

    @PersistenceContext(unitName = "pu")
    EntityManager entityManager;


    public Blog saveBlog(Blog blog){
        entityManager.persist(blog);
        return blog;
    }

    public Blog getBlog(long id){
        return entityManager.find(Blog.class,id);
    }


}
