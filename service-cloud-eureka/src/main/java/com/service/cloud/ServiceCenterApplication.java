package com.service.cloud;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 项目启动类
 * 
 * @author zhangchao
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceCenterApplication  {
	private static Log logger = LogFactory.getLog(ServiceCenterApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ServiceCenterApplication.class, args);

		logger.info("The Service Center STARTED !");
	}
}