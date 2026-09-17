package com.campusconnect.controller;

import com.campusconnect.entity.Job;
import com.campusconnect.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
@CrossOrigin
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    // CREATE
    @PostMapping
    public Job addJob(@RequestBody Job job) {

        return jobService.addJob(job);
    }

    // READ ALL
    @GetMapping
    public List<Job> getAllJobs() {

        return jobService.getAllJobs();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Job getJobById(@PathVariable Long id) {

        return jobService.getJobById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Job updateJob(
            @PathVariable Long id,
            @RequestBody Job job) {

        return jobService.updateJob(id, job);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteJob(@PathVariable Long id) {

        return jobService.deleteJob(id);
    }
}