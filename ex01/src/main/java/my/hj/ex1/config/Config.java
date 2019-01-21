package my.hj.ex1.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "my")
public class Config {
    private List<String> servers = new ArrayList<String>();

    public List<String> getServers() {
        return servers;
    }
}
