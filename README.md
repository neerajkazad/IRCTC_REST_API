SMNK29 - 27_IRCTC_REST_API

Provider Application and we are going to use this with 28_Make_My_Trip_App this is going to act as consumer applicaiton.

Developer REST API without using the swagger.

What we have to do to add the swagger in our Spring Boot Application?

Step 1: Add the SpringDoc OpenAPI dependency to your pom.xml file:

<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.4.0</version>
</dependency>

Step 2: (Optional) Customize OpenAPI Info
You can add an OpenAPI bean to customize title, version, description:

```java
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Product REST API")
                        .version("1.0")
                        .description("This is the Product API documentation using OpenAPI and Swagger UI."));
    }
}
```
---


