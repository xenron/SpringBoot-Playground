package com.example.dao;

import com.example.entity.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * xxx
 */
public interface JobEntityRepository extends JpaRepository<JobEntity, Long> {

    JobEntity getById(Integer id);

}
