package spring.bug;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import at.liptakg.springbug.BeanConditionalOnOtherBean;
import at.liptakg.springbug.Config;

@SpringBootTest(classes = Config.class)
@TestPropertySource(properties = "beanExists=true")
public class PropertyExistsTest {
	@Autowired(required = false)
	public BeanConditionalOnOtherBean beanConditionalOnOtherBean;

	@Test
	void test() {
		assertThat(beanConditionalOnOtherBean).isNotNull();
	}
}
