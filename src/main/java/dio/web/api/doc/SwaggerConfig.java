package dio.web.api.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    private Contact contato() {
        return new Contact()
                .name("Seu nome")
                .url("http://www.seusite.com.br")
                .email("voce@seusite.com.br");
    }

    private Info informacoesApi() {
        return new Info()
                .title("Title - Rest API")
                .description("API exemplo de uso do Spring Boot REST API")
                .version("1.0")
                .termsOfService("Termo de uso: Open Source")
                .license(
                        new License()
                                .name("Licença - Sua empresa")
                                .url("http://www.seusite.com.br")
                )
                .contact(this.contato());
    }

    @Bean
    public OpenAPI detalheApi() {
        return new OpenAPI()
                .info(this.informacoesApi());
    }
}