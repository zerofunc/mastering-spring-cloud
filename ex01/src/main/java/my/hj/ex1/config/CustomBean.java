package my.hj.ex1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomBean {
    @Value("${name}")
    private String name;

    public String getName() {
        return name;
    }

    public CustomBean setName(String name) {
        this.name = name;
        return this;
    }
}
