package com.tejasumate.springbackendlearning.repository;

import com.tejasumate.springbackendlearning.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface JobRepository extends JpaRepository<Job,Integer> {
    //Class Name and Primary Key

}