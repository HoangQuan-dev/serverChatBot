package com.example.serverchatbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.ServerSocket;

@SpringBootApplication
public class ServerChatBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerChatBotApplication.class, args);
		new webSocketServer().start();
	}

}
