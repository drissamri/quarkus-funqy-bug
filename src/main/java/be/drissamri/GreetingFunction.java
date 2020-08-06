package be.drissamri;

import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPResponse;
import io.quarkus.funqy.Funq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class GreetingFunction {
    private Logger LOG = LoggerFactory.getLogger(GreetingFunction.class);

    @Funq("hello")
    public APIGatewayV2HTTPResponse hello(APIGatewayV2HTTPEvent event) {
        LOG.error("Request: {}", event);
        return APIGatewayV2HTTPResponse.builder()
                .withBody("Hello!")
                .withStatusCode(200)
                .withHeaders(Map.of("Content-Type", "application/json"))
                .build();
    }

    @Funq("world")
    public APIGatewayV2HTTPResponse world(APIGatewayV2HTTPEvent event) {
        LOG.error("Request: {}", event);
        return APIGatewayV2HTTPResponse.builder()
                .withBody("Hello World!")
                .withStatusCode(200)
                .withHeaders(Map.of("Content-Type", "application/json"))
                .build();
    }
}
