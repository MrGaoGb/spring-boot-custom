package com.mrgao.demo;

import com.mrgao.demo.annotation.CustomSpringBootApplication;
import com.mrgao.demo.boot.CustomSpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author Mr.Gao
 * @date 2023/3/29 17:43
 * @apiNote:
 */
@CustomSpringBootApplication
public class TestApplication {

    @Bean
    public DispatcherServlet dispatcherServlet(){
        return new DispatcherServlet();
    }

    public static void main(String[] args) {
        CustomSpringApplication.run(TestApplication.class);
    }

}
