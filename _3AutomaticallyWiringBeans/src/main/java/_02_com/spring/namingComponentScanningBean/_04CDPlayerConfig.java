package _02_com.spring.namingComponentScanningBean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "_02_com.spring.namingComponentScanningBean")
public class _04CDPlayerConfig {

	public _04CDPlayerConfig() {
		super();
	}

}
