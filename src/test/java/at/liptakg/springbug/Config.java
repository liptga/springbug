package at.liptakg.springbug;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = BeanConditionalOnOtherBean.class)
public class Config {

}
