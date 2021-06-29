package com.example.Blueprint.repositories;

import com.example.Blueprint.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

    Project findByProjectIdentifier(String projectID);

    @Override
    Iterable<Project> findAll();

    Iterable<Project>findAllByProjectLeader(String username);

}
