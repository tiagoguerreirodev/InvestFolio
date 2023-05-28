package br.com.tiagoguerreirodev.investfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@ComponentScan(basePackages = {"br.com.tiagoguerreirodev"})
@ConfigurationPropertiesScan(basePackages = {"br.com.tiagoguerreirodev"})
public class InvestfolioApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvestfolioApplication.class, args);
    }

}
