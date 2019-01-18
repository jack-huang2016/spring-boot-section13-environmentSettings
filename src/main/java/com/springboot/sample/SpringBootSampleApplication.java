package com.springboot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 现在可以直接运行 SpringBootSampleApplication的main方法，和执行普通java程序一样
 * 然后可以看到spring-boot 内置server容器（默认为Tomcat），这一切spring-boot 都帮我们做好了。
 * Started SpringBootSampleApplication in 4.895 seconds (JVM running for 5.532)
 * 
 * @author huang.yj
 * @date 2018.12.06
 *
 */

@SpringBootApplication
public class SpringBootSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleApplication.class, args);
	}

}


