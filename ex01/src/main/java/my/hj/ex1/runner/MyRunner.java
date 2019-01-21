package my.hj.ex1.runner;

import my.hj.ex1.config.Config;
import my.hj.ex1.config.CustomBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner {
    @Autowired
    private Config config;
    @Autowired
    private CustomBean customBean;

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("=====servers======");
        logger.info(config.getServers().toString());
        logger.info("=====customBean=====");
        logger.info(customBean.getName());
    }
}
