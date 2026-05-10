package com.example.springboot;
// Package declaration.
// Defines the folder structure and namespace of the class.

import java.util.Arrays;
// Imports the Arrays utility class.
// Used for array operations like sorting and printing arrays.

import org.springframework.boot.CommandLineRunner;
// Interface used to run code after the Spring Boot application starts.

import org.springframework.boot.SpringApplication;
// Class used to start and launch a Spring Boot application.

import org.springframework.boot.autoconfigure.SpringBootApplication;
// Main Spring Boot annotation.
// Combines:
// @Configuration -> marks class as configuration class
// @EnableAutoConfiguration -> enables automatic Spring setup
// @ComponentScan -> scans for Spring components automatically

import org.springframework.context.ApplicationContext;
// Represents the Spring container.
// Used to access and manage Spring beans (objects).

// -------------------- Annotations --------------------

import org.springframework.web.bind.annotation.GetMapping;
// Annotation for handling HTTP GET requests.
// Example: loading data from the server.

import org.springframework.web.bind.annotation.PostMapping;
// Annotation for handling HTTP POST requests.
// Example: sending form or API data to the server.

import org.springframework.web.bind.annotation.RestController;
// Marks a class as a REST API controller.
// Combines:
// @Controller -> marks class as a web controller
// @ResponseBody -> returns data directly as HTTP response

import org.springframework.context.annotation.Bean;
// Marks a method whose returned object should be managed by Spring.

// -------------------- Annotation Usage --------------------

// @GetMapping
// Maps GET requests to a method.
// Example:
// GET /hello

// @PostMapping
// Maps POST requests to a method.
// Example:
// POST /users

// @RestController
// Tells Spring this class handles REST API requests.
// Returned values are sent directly as HTTP responses.

// @Bean
// Registers the returned object as a Spring bean inside the container.
