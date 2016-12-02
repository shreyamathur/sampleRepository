package com.aem.tutorials;

/**
 * A simple service interface
 */
public interface HelloService {
    
    /**
     * @return the name of the underlying JCR repository implementation
     */
    public String getRepositoryName();

}
public class HelloService{

    public static void main(String[] args) {
            System.out.println("Hello Maven!");
    }
}