package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //maneiras de realizar um select no DB
    //@Query("SELECT s FROM Students s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
