package at.liptakg.springbug;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Config.class)
public class PropertyDoesNotExistsTest {
	@Autowired(required = false)
	public BeanConditionalOnOtherBean beanConditionalOnOtherBean;

	@Test
	void test() {
		assertThat(beanConditionalOnOtherBean).isNull();
	}
}
