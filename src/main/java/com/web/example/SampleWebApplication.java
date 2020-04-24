package com.web.example;

import org.apache.geode.cache.client.ClientRegionShortcut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

import com.web.example.model.Member;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ClientCacheApplication(name="CrudGemFireExample", logLevel = "fatal") // the pivotal gemfire cache
@EnableEntityDefinedRegions(basePackageClasses = Member.class, clientRegionShortcut = ClientRegionShortcut.LOCAL) // enable the creation of Pivotal GemFire/Apache Geode Regions based on the application persistent entities
@EnableGemfireRepositories
@EnableSwagger2
public class SampleWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleWebApplication.class, args);
	}

}
