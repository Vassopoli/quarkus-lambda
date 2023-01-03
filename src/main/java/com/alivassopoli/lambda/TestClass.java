package com.alivassopoli.lambda;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestClass implements TestInterface {

    @Override
    public void execute() {
        System.out.println("Executing");
    }
}
