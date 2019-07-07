package com.liulang.eureka;

import java.lang.management.ManagementFactory;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 服务注册中心
 * @author lanyangli
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaserverApplication {

	public static void main(String[] args) {
		List<String> inputArguments = ManagementFactory.getRuntimeMXBean().getInputArguments();   
	    System.out.println("===================java options=============== ");  
	    System.out.println(inputArguments); 
		SpringApplication.run(EurekaserverApplication.class, args);
	}
}
