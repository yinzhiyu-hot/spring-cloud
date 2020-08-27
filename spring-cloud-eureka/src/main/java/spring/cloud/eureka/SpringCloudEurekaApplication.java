package spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description 服务注册，发现中心
 * @Remark
 * @PackagePath spring.cloud.eureka.SpringCloudEurekaApplication
 * @Author YINZHIYU
 * @Date 2020/8/27 12:21
 * @Version 1.0.0.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaApplication.class, args);
    }

}
