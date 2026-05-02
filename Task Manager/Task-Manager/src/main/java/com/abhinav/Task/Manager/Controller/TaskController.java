package com.abhinav.Task.Manager.Controller;

import com.abhinav.Task.Manager.Model.Task;
import com.abhinav.Task.Manager.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // Show all tasks
    @GetMapping
    public String getAllTasks(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "tasks"; // tasks.html
    }

    // Create task (from form)
    @PostMapping("/create")
    public String createTask(@RequestParam String title,
                             @RequestParam String status) {

        Task task = new Task();
        task.setTitle(title);
        task.setStatus(status);

        taskService.createTask(task);

        return "redirect:/tasks";
    }

    // Update status
    @PostMapping("/update")
    public String updateStatus(@RequestParam Long id,
                               @RequestParam String status) {

        taskService.updateStatus(id, status);

        return "redirect:/tasks";
    }
}