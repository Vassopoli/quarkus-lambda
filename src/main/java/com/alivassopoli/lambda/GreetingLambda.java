package com.alivassopoli.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import javax.inject.Inject;

public class GreetingLambda implements RequestHandler<Person, String> {

    @Inject
    TestInterface testClass;

    @Override
    public String handleRequest(Person input, Context context) {
        testClass.execute();
        return "Hello " + input.getName();
    }
}
