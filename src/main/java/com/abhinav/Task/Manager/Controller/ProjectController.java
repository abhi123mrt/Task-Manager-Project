package com.abhinav.Task.Manager.Controller;

import com.abhinav.Task.Manager.Model.Project;
import com.abhinav.Task.Manager.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/create")
    public String createProject(@RequestParam String name) {

        Project project = new Project();
        project.setName(name);

        projectService.createProject(project);

        return "redirect:/projects";
    }

    @GetMapping
    public String getAllProjects(Model model) {
        model.addAttribute("projects", projectService.getAllProjects());
        return "projects";
    }

    @PostMapping("/complete")
    public String markComplete(@RequestParam Long id) {
        projectService.markComplete(id);
        return "redirect:/projects";
    }
}