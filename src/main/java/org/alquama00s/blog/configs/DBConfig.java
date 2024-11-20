package org.alquama00s.blog.configs;


import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.ejb.Stateless;
import jakarta.enterprise.context.ApplicationScoped;

@DataSourceDefinition(
        name = "java:app/blog/ds",
        className = "org.postgresql.Driver",
        url = "jdbc:postgresql://localhost:5434/postgres",
        user = "postgres",
        password = "postgres"
)
@Stateless
public class DBConfig {



}
