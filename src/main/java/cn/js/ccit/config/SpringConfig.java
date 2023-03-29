package cn.js.ccit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MyBatisConfig.class)
@ComponentScan("cn.js.ccit")
public class SpringConfig {
}
