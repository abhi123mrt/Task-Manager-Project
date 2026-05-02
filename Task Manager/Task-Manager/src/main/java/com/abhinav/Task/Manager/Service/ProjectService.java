package com.abhinav.Task.Manager.Service;

import com.abhinav.Task.Manager.Model.Project;
import com.abhinav.Task.Manager.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public void markComplete(Long id) {
        Project p = projectRepository.findById(id).orElse(null);
        if (p != null) {
            p.setCompleted(true);
            projectRepository.save(p);
        }
    }

}
