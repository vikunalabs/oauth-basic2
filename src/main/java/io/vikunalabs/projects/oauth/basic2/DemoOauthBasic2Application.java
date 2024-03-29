package io.vikunalabs.projects.oauth.basic2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class DemoOauthBasic2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoOauthBasic2Application.class, args);
    }

}
