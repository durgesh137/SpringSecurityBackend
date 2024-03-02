package com.durgesh;
@org.springframework.boot.autoconfigure.SpringBootApplication
public class Main {
    public static void main(String[] args) {
        //todo how to prevent this package name included with SpringBootApplication class intellij
        org.springframework.boot.SpringApplication.run(Main.class, args);
    }
}
