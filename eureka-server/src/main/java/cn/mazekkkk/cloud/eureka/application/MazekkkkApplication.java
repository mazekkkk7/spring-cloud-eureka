package cn.mazekkkk.cloud.eureka.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类
 *
 * @author maze
 * @createTime 18/10/15
 */
@SpringBootApplication
@EnableEurekaServer
@EnableAutoConfiguration
@RefreshScope
public class MazekkkkApplication {
    public static void main(String[] args) {
        SpringApplication.run(MazekkkkApplication.class, args);
    }
}
