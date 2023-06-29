package com.xttc.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan({"com.xttc.controller","com.xttc.config"})
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {
    @Bean   //将自定义拦截器放入到spring容器中
    public MyInterceptor interceptor() {
        return new MyInterceptor();
    }

    @Autowired  //创建自定义的拦截器
     public  MyInterceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new MyInterceptor()) // 添加拦截器
                .addPathPatterns("/**");       // 添加需要拦截的路径
                //.excludePathPatterns("/users");        // 放行的路径
    }
}
