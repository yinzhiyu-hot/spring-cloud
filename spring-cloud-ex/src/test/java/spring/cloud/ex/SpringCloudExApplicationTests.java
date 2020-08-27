package spring.cloud.ex;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import spring.cloud.ex.rest.api.IHelloService;

import javax.annotation.Resource;

@SpringBootTest
class SpringCloudExApplicationTests {

    @Resource
    private IHelloService iHelloService;

    @Test
    void contextLoads() {
    }

    @Test
    public void testApi(){
        iHelloService.hello();
    }
}
