package org.jmsactivemq.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "org.jmsactivemq")
@Import({MessagingConfiguration.class})
public class AppConfig {

}
