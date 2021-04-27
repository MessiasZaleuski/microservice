package com.application.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
