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

    @Funq("v1/hello")
    public String world(APIGatewayProxyRequestEvent event) {
        LOG.error("Request : {}", event);
        return "REST API input: " + event.getBody();
    }

    @Funq("v2/hello")
    public String hello(APIGatewayV2HTTPEvent event) {
        LOG.error("Request : {}", event);
        return "HTTP API input: " + event.getBody();

    }
}
