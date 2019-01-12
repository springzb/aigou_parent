package cn.mesmile.aigou.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created with IDEA
 * @author: Super Zheng
 * @Description: java类作用描述
 * @Date:2019/1/9
 * @Time:18:32
 */
@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider {

    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        resources.add(swaggerResource("平台服务系统", "/services/plat/v2/api-docs", "2.0"));
        resources.add(swaggerResource("商品服务系统", "/services/product/v2/api-docs", "2.0"));
        resources.add(swaggerResource("基础系统", "/services/common/v2/api-docs", "2.0"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
