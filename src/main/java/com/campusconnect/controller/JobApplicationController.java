package com.campusconnect.controller;

import com.campusconnect.entity.JobApplication;
import com.campusconnect.service.JobApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
@CrossOrigin
public class JobApplicationController {

    private final JobApplicationService jobApplicationService;

    public JobApplicationController(
            JobApplicationService jobApplicationService) {

        this.jobApplicationService = jobApplicationService;
    }

    // CREATE
    @PostMapping
    public JobApplication applyForJob(
            @RequestBody JobApplication application) {

        return jobApplicationService.applyForJob(application);
    }

    // READ ALL
    @GetMapping
    public List<JobApplication> getAllApplications() {

        return jobApplicationService.getAllApplications();
    }

    // READ ONE
    @GetMapping("/{id}")
    public JobApplication getApplicationById(
            @PathVariable Long id) {

        return jobApplicationService.getApplicationById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public JobApplication updateApplication(
            @PathVariable Long id,
            @RequestBody JobApplication application) {

        return jobApplicationService.updateApplication(
                id, application);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteApplication(
            @PathVariable Long id) {

        return jobApplicationService.deleteApplication(id);
    }
}