package com.springboot.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class MyWebAppConfigurer implements EnvironmentAware {

	private RelaxedPropertyResolver propertyResolver;
	
	//方法一，较方便
	@Value("${spring.datasource.url}")
    private String myUrl;
	
	 /**
     * 这个方法只是测试实现EnvironmentAware接口，读取环境变量和application.properties配置文件属性的方法。
     */
	@Override
	public void setEnvironment(Environment env) {
		System.out.println(env.getProperty("JAVA_HOME")); 
		System.out.println(myUrl);
		String username = env.getProperty("spring.datasource.username"); //方法二
		System.out.println(username);
		propertyResolver = new RelaxedPropertyResolver(env, "spring.datasource.");
        String driverName = propertyResolver.getProperty("driver-class-name");  //方法三
        System.out.println(driverName);
	}
}
