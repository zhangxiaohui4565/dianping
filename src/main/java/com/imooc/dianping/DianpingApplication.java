package com.imooc.dianping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = {"com.imooc.dianping"})
@MapperScan("com.imooc.dianping.dal")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableScheduling
public class DianpingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DianpingApplication.class, args);
	}

}
