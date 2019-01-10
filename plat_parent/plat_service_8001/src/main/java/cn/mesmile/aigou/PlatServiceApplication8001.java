package cn.mesmile.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Created with IDEA
 * @author: Super Zheng
 * @Description: java类作用描述
 * @Date:2019/1/9
 * @Time:16:49
 */
@SpringBootApplication
@EnableEurekaClient
public class PlatServiceApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PlatServiceApplication8001.class);
    }
}
