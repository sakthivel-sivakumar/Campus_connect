package com.campusconnect.service;

import com.campusconnect.entity.Job;
import com.campusconnect.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    // CREATE
    public Job addJob(Job job) {

        return jobRepository.save(job);
    }

    // READ ALL
    public List<Job> getAllJobs() {

        return jobRepository.findAll();
    }

    // READ ONE
    public Job getJobById(Long id) {

        return jobRepository.findById(id)
                .orElse(null);
    }

    // UPDATE
    public Job updateJob(Long id, Job job) {

        Job existingJob =
                jobRepository.findById(id)
                        .orElse(null);

        if (existingJob == null) {
            return null;
        }

        existingJob.setTitle(job.getTitle());
        existingJob.setCompanyName(job.getCompanyName());
        existingJob.setLocation(job.getLocation());
        existingJob.setJobType(job.getJobType());
        existingJob.setSalary(job.getSalary());
        existingJob.setDescription(job.getDescription());

        return jobRepository.save(existingJob);
    }

    // DELETE
    public String deleteJob(Long id) {

        if (!jobRepository.existsById(id)) {
            return "Job not found";
        }

        jobRepository.deleteById(id);

        return "Job deleted successfully";
    }
}