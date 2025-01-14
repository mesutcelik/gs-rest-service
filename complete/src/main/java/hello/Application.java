package hello;

import com.hazelcast.client.config.ClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	ClientConfig config() {
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.setInstanceName("Istanbul");
		return clientConfig;
	}
}
