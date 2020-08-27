package spring.cloud.ex.rest.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 配置服务提供者
 * @Remark spring-cloud-ex 是服务提供者的 application.name
 * 其用法类似于类似于Retrofit2 API定义
 * @PackagePath spring.cloud.ex.rest.api.IHelloService
 * @Author YINZHIYU
 * @Date 2020/8/27 16:32
 * @Version 1.0.0.0
 **/
@FeignClient("spring-cloud-ex")
public interface IHelloService {

    @RequestMapping(value = "/hello")
    String hello();
}