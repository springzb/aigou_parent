package cn.mesmile.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Created with IDEA
 * @author: Super Zheng
 * @Description: java类作用描述
 * @Date:2019/1/10
 * @Time:15:05
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServerApplication4399 {
    public static void main(String[] args) {
        // 访问地址：http://localhost:4399/application-plat-user
        SpringApplication.run(ConfigServerApplication4399.class);
    }
}
