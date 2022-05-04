package com.mash.dinling;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: mash
 * @Description:
 * @ProjectName: journey-start
 * @Date: 2022/5/4 21:33
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.mash.dinling.*.mapper")
public class DinlingApplication {

    public static void main(String[] args) {
        SpringApplication.run(DinlingApplication.class);
    }
}
