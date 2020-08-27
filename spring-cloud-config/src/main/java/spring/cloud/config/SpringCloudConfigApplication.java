package spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description 配置管理中心
 * @Remark
 * @PackagePath spring.cloud.config.SpringCloudConfigApplication
 * @Author YINZHIYU
 * @Date 2020/8/27 17:38
 * @Version 1.0.0.0
 **/
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class SpringCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigApplication.class, args);
    }

}
