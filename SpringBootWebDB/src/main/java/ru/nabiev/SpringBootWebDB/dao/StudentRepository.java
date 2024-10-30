package ru.nabiev.SpringBootWebDB.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nabiev.SpringBootWebDB.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
