package com.xttc.controller;

import com.xttc.domain.User;
import com.xttc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public void login(User user,HttpServletRequest request, HttpServletResponse response){
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            User user1 = userService.login(user);
            if (user1!=null && user1.getUsername().equals(username) && user1.getPassword().equals(password)){
                request.getSession().setAttribute("NAME",user.getUsername());
                request.getSession().setAttribute("USER",user);
                request.getRequestDispatcher("/User.jsp").forward(request,response);
            }
            request.getSession().setAttribute("msg","用户名密码错误");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
