package com.example.mothertochild.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mothertochild.model.Mother;

@Repository
public interface MotherRepo extends JpaRepository<Mother, Long>{

}
