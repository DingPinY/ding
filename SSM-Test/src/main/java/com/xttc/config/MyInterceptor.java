package com.xttc.config;

import com.xttc.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        User user = (User) request.getSession().getAttribute("USER");
        String requestURI = request.getRequestURI();
        if (user!=null){
            System.out.println(666);
            return true;
        }
        if (requestURI.indexOf("login")>=0){
            System.out.println(777);
            return true;
        }
        request.setAttribute("error","请先登录");
        request.getRequestDispatcher("/login.jsp").forward(request,response);
        return false;
    }

}
