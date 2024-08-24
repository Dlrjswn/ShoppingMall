package com.example.ShoppingMall.config;



import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    // url: http://localhost:8080/swagger-ui/index.html#/

    @Bean
    public OpenAPI getOpenApi() {
        Server server = new Server().url("/");
        return new OpenAPI()
                .info(getSwaggerInfo());
    }

    private Info getSwaggerInfo() {
        License license = new License();
        license.setName("{Application}");

        return new Info()
                .title("ShoppingMall API Document")
                .description("ShoppingMall Server's API document.")
                .version("v0.0.1")
                .license(license);
    }
}
