package go1ove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author chenxiang36
 * @version 1.0
 * @date 2021/11/19 17:35
 */

// 启动类注解 能够扫描Spring组件并自动配置Spring Boot
@SpringBootApplication
public class SpringBootDemo {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootDemo.class, args);
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		System.out.println("项目启动 run ...");
	}
}
