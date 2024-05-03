package repositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfiguration {

    @Bean
    public void runEveryTime() {
        // Código para ser executado toda vez que o projeto é executado no modo de teste
    }
}

