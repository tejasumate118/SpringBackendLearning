package com.tejasumate.springbackendlearning.service;

import com.tejasumate.springbackendlearning.model.Job;
import com.tejasumate.springbackendlearning.repository.JobRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;


    public List<Job> getAllJobs() {
        for( Job job:jobRepository.findAll()){
            System.out.println(job);
        }
        return jobRepository.findAll();
    }

    public Optional<Job> getJobById(int id) {
        return jobRepository.findById(id);
    }

    public void addJob(Job job) {
        System.out.println("In addJob Service");
        jobRepository.save(job);
    }
    public void deleteJob(int id) {
        jobRepository.deleteById(id);
    }
}

