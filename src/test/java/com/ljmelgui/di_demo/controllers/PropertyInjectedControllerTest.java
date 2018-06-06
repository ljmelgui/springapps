package com.ljmelgui.di_demo.controllers;

import com.ljmelgui.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void sayHello() {
        assertEquals(GreetingServiceImpl.HELLO_WORLD_MESSAGE, propertyInjectedController.sayHello());
    }
}