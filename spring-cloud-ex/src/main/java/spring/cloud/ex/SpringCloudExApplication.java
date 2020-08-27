package spring.cloud.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description 服务提供者与消费者
 * @Remark 示例
 * @PackagePath spring.cloud.ex.SpringCloudExApplication
 * @Author YINZHIYU
 * @Date 2020/8/27 17:39
 * @Version 1.0.0.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //这个功能类似于Retrofit2
public class SpringCloudExApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudExApplication.class, args);
    }

}
