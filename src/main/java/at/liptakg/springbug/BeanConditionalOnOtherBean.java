package at.liptakg.springbug;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(BeanConditionalOnProperty.class)
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS) //remove this and PropertyDoesNotExistsTest passes
public class BeanConditionalOnOtherBean {
	private final BeanConditionalOnProperty beanConditionalOnProperty;

	public BeanConditionalOnOtherBean(BeanConditionalOnProperty beanConditionalOnProperty) {
		this.beanConditionalOnProperty = beanConditionalOnProperty;
	}
}
