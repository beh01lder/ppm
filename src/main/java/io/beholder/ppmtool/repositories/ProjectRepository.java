package io.beholder.ppmtool.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<ProjectRepository, Long> {

    @Override
    Iterable<ProjectRepository> findAllById(Iterable<Long> iterable);
}
