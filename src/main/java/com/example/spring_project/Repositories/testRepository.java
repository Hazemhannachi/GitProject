package com.example.spring_project.Repositories;

import com.example.spring_project.Entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface testRepository extends JpaRepository<Contrat, Integer> {
        /* eya frhi */
}
