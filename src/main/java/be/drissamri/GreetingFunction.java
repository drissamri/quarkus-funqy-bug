package be.drissamri;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
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
    public APIGatewayProxyResponseEvent world(APIGatewayProxyRequestEvent event) {
        LOG.error("Request: {}", event);
        APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();
        response.setBody("Hello World!");
        response.setStatusCode(200);
        response.setHeaders(Map.of("Content-Type", "application/json"));

        return response;
    }
}
