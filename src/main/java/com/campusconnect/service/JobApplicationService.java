package com.campusconnect.service;

import com.campusconnect.entity.JobApplication;
import com.campusconnect.repository.JobApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationService {

    private final JobApplicationRepository jobApplicationRepository;

    public JobApplicationService(
            JobApplicationRepository jobApplicationRepository) {

        this.jobApplicationRepository = jobApplicationRepository;
    }

    // CREATE
    public JobApplication applyForJob(JobApplication application) {

        return jobApplicationRepository.save(application);
    }

    // READ ALL
    public List<JobApplication> getAllApplications() {

        return jobApplicationRepository.findAll();
    }

    // READ ONE
    public JobApplication getApplicationById(Long id) {

        return jobApplicationRepository.findById(id)
                .orElse(null);
    }

    // UPDATE
    public JobApplication updateApplication(
            Long id,
            JobApplication application) {

        JobApplication existingApplication =
                jobApplicationRepository.findById(id)
                        .orElse(null);

        if (existingApplication == null) {
            return null;
        }

        existingApplication.setStudentId(
                application.getStudentId());

        existingApplication.setJobId(
                application.getJobId());

        existingApplication.setApplicationDate(
                application.getApplicationDate());

        existingApplication.setStatus(
                application.getStatus());

        return jobApplicationRepository.save(existingApplication);
    }

    // DELETE
    public String deleteApplication(Long id) {

        if (!jobApplicationRepository.existsById(id)) {
            return "Application not found";
        }

        jobApplicationRepository.deleteById(id);

        return "Application deleted successfully";
    }
}