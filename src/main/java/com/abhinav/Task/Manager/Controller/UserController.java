package com.abhinav.Task.Manager.Controller;

import com.abhinav.Task.Manager.Model.User;
import com.abhinav.Task.Manager.Service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private UserService userService;

    // Register (from form)
    @PostMapping("/register")
    public String register(@RequestParam String email,
                           @RequestParam String password) {

        User user = new User();
        user.setEmail(email);
        user.setPassword(password);

        userService.register(user);

        return "redirect:/"; // back to login
    }

    // Login (from form)
     @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password,
                        HttpSession session) {

        User user = userService.login(email, password);

        if (user != null) {
            session.setAttribute("user", user); // 🔥 session set
            return "redirect:/dashboard";
        } else {
            return "redirect:/?error=true";
        }
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}