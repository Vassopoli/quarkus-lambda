package com.alivassopoli.lambda;

import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestClass implements TestInterface {
    private static final Logger LOG = Logger.getLogger(TestClass.class);

    @Override
    public void execute() {
        LOG.info("Executing");
    }
}
