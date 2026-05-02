package com.abhinav.Task.Manager.repository;

import com.abhinav.Task.Manager.Model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
