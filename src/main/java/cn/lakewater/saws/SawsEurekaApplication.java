package cn.lakewater.saws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
@ComponentScan
public class SawsEurekaApplication {

    public static void main(String[] args){
        SpringApplication.run(SawsEurekaApplication.class);
    }
}
