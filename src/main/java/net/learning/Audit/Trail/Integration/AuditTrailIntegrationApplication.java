package net.learning.Audit.Trail.Integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import reactor.kafka.sender.KafkaSender;

//@SpringBootApplication
//@SpringBootApplication(scanBasePackages={"net.apmoller.telikos.library", "com.maersk.shared","net.learning.Audit.Trail.Integration"})
//@SpringBootApplication(scanBasePackages={"net.apmoller.telikos.library", "com.maersk.shared","net.learning.Audit.Trail.Integration.controller"})
@SpringBootApplication(scanBasePackages={"net.learning.Audit.Trail.Integration"})
//@ComponentScan(basePackageClasses = KafkaSender.class)
public class AuditTrailIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditTrailIntegrationApplication.class, args);
	}

}
