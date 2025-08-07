package org.first.em.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
   //custom method
   //List<EmployeeEntity>findByName(List<EmployeeEntity> findByName(String name));
    //save,delete,findbyId , findAll
} 
