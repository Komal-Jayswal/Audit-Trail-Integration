package net.learning.Audit.Trail.Integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import reactor.kafka.sender.KafkaSender;

//@SpringBootApplication
//@SpringBootApplication(scanBasePackages = {"net.apmoller.telikos.library", "com.maersk.shared"})
@SpringBootApplication()
public class AuditTrailIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditTrailIntegrationApplication.class, args);
	}

}
