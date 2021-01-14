package cn.itsource.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //eureka的客户端
public class PlatServiceAppllication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PlatServiceAppllication8001.class,args);
    }
}
