package at.liptakg.springbug;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = BeanConditionalOnProperty.BEAN_EXISTS)
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class BeanConditionalOnProperty {
	public static final String BEAN_EXISTS = "beanExists";
}
