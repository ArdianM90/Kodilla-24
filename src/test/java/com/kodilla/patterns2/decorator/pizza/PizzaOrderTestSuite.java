package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        String description = pizzaOrder.getDescription();

        //Then
        assertEquals("Basic pizza with tomato sauce and cheese", description);
    }

    @Test
    public void testPizzaWithBaconOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconDecorator(pizzaOrder);

        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(18), calculatedCost);
    }

    @Test
    public void testPizzaWithBaconOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconDecorator(pizzaOrder);

        //When
        String description = pizzaOrder.getDescription();

        //Then
        assertEquals("Basic pizza with tomato sauce and cheese + bacon", description);
    }

    @Test
    public void testPizzaWithDoubleCheeseAndMushroomsOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new DoubleCheeseDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);

        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(19), calculatedCost);
    }

    @Test
    public void testPizzaWithDoubleCheeseAndMushroomsOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new DoubleCheeseDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);

        //When
        String description = pizzaOrder.getDescription();

        //Then
        assertEquals("Basic pizza with tomato sauce and cheese + double cheese + mushrooms", description);
    }
}