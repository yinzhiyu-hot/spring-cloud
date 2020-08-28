package spring.cloud.ex.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.ex.config.GitAutoRefreshConfig;
import spring.cloud.ex.rest.api.IHelloService;

import javax.annotation.Resource;

@RestController
@RefreshScope
public class ProviderController {

    @Resource
    private IHelloService iHelloService;

    @Resource
    private GitAutoRefreshConfig gitAutoRefreshConfig;

    /*
     * @Description 注册到eureka 的服务
     * @Remark
     * @Params ==>
     * @Return java.lang.String
     * @Date 2020/8/27 16:31
     * @Auther YINZHIYU
     */
    @RequestMapping(value = "/hello")
    public String hello() {
        return "Hello spring cloud!";
    }

    /*
     * @Description 通过FeignClient 调用eureka 注册的服务
     * @Remark 提供一个测试的rest
     * @Params ==>
     * @Return java.lang.String
     * @Date 2020/8/27 16:31
     * @Auther YINZHIYU
     */
    @RequestMapping(value = "/testApi")
    public String testApi() {
        return iHelloService.hello();
    }

    /*
     * @Description 通过Config 获取Git上的配置信息
     * @Remark 如果Git 有变更，则用 http://localhost:8089/actuator/refresh 进行Post 请求一次
     *         或者去Git 中设置 Webhooks 当有push的时候，触发上面的Post 请求
     * @Params ==>
     * @Return java.lang.String
     * @Date 2020/8/27 16:53
     * @Auther YINZHIYU
     */
    @RequestMapping(value = "/testConfig")
    public String testConfig() {
        return String.format("%s %s", gitAutoRefreshConfig.getDesc(), gitAutoRefreshConfig.getUser().getPassword());
    }
}