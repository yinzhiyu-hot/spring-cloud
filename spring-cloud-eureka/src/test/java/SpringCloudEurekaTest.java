import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import spring.cloud.eureka.SpringCloudEurekaApplication;

/**
 * @Description Spring Cloud Eureka 单元测试
 * @Remark
 * @PackagePath PACKAGE_NAME.SpringCloudEurekaTest
 * @Author YINZHIYU
 * @Date 2020/8/27 12:01
 * @Version 1.0.0.0
 **/
@SpringBootTest(classes = SpringCloudEurekaApplication.class)
public class SpringCloudEurekaTest {

    @Test
    public void test() {
        System.out.println("Im's Spring Cloud Application");
    }
}
