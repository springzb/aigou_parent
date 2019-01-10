package cn.mesmile.aigou.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Created with IDEA
 * @author: Super Zheng
 * @Description: java类作用描述
 * @Date:2019/1/9
 * @Time:17:44
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //  此项为对外暴露服务的包，以controller的方式暴露
                .apis(RequestHandlerSelectors.basePackage("cn.mesmile.aigou.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 访问地址：http://127.0.0.1:8001/swagger-ui.html
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("商品系统api")
                .description("商品系统接口文档说明")
                .contact(new Contact("zbtest", "www.mesmile.cn", "springzb@aliyun.com"))
                .version("1.0")
                .build();
    }

}
