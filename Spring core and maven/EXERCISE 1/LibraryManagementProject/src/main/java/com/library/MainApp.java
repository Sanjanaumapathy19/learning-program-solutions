package com.library;

import com.library.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            BookService bookService = (BookService) context.getBean("bookService");
            bookService.addBook("The Great Gatsby");
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}