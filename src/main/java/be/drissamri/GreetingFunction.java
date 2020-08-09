package be.drissamri;

import io.quarkus.funqy.Funq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreetingFunction {
    private Logger LOG = LoggerFactory.getLogger(GreetingFunction.class);

    @Funq
    public String world(String event) {
        LOG.info("Request : {}", event);
        return "REST API input: " + event;
    }
}
