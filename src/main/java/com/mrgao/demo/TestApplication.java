package com.mrgao.demo;

import com.mrgao.demo.annotation.CustomSpringBootApplication;
import com.mrgao.demo.boot.CustomSpringApplication;

/**
 * @author Mr.Gao
 * @date 2023/3/29 17:43
 * @apiNote:
 */
@CustomSpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        CustomSpringApplication.run(TestApplication.class);
    }

}
