package com.tejasumate.springbackendlearning.controller;

import com.tejasumate.springbackendlearning.model.Job;
import com.tejasumate.springbackendlearning.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JobController {
    @Autowired
    JobService jobService;
    @GetMapping("/jobs")
    public List<Job> getJobService() {
        return jobService.getAllJobs();
    }
    @GetMapping("/jobs/{id}")
    public Optional<Job> getJobService(@PathVariable int id) {
        return jobService.getJobById(id);
    }
    @PostMapping("/jobs")
    public String addJob(@RequestBody Job job) {
        jobService.addJob(job);
        if(jobService.getJobById(job.getId())!=null) {
            return "Job added successfully";
        }
        else {
            return "Job not added";
        }
    }
    @DeleteMapping("/jobs/{id}")
    public String deleteJob(@PathVariable int id) {
        jobService.deleteJob(id);
        if(jobService.getJobById(id)!=null) {
            return "Job deleted successfully";
        }
        else {
            return "Job not deleted";
        }
    }
}
