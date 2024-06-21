package org.example.hri;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class RobotTest {

    @Test
    public void robotMovesCorrectlyOnXAxis() {
        Robot r = new Robot();
        r.moveX(3);
        ArrayList<Double> expectedPosition = new ArrayList<>(Arrays.asList(3.0, 0.0, 0.0));
        assertEquals(expectedPosition, r.getPosition());
    }

    @Test
    public void robotMovesCorrectlyOnYAxis() {
        Robot r = new Robot();
        r.moveY(-4);
        ArrayList<Double> expectedPosition = new ArrayList<>(Arrays.asList(0.0, -4.0, 0.0));
        assertEquals(expectedPosition, r.getPosition());
    }

    @Test
    public void robotMovesCorrectlyOnZAxis() {
        Robot r = new Robot();
        r.moveZ(5);
        ArrayList<Double> expectedPosition = new ArrayList<>(Arrays.asList(0.0, 0.0, 5.0));
        assertEquals(expectedPosition, r.getPosition());
    }

    @Test
    public void robotMovesCorrectlyOnAllAxes() {
        Robot r = new Robot();
        r.moveX(2);
        r.moveY(3);
        r.moveZ(4);
        ArrayList<Double> expectedPosition = new ArrayList<>(Arrays.asList(2.0, 3.0, 4.0));
        assertEquals(expectedPosition, r.getPosition());
    }

    @Test
    public void robotStaysInPlaceWhenNotMoved() {
        Robot r = new Robot();
        ArrayList<Double> expectedPosition = new ArrayList<>(Arrays.asList(0.0, 0.0, 0.0));
        assertEquals(expectedPosition, r.getPosition());
    }

    @Test
    public void robotMovesBackToOrigin() {
        Robot r = new Robot(2, 3, 4);
        r.moveX(-2);
        r.moveY(-3);
        r.moveZ(-4);
        ArrayList<Double> expectedPosition = new ArrayList<>(Arrays.asList(0.0, 0.0, 0.0));
        assertEquals(expectedPosition, r.getPosition());
    }

    @Test
    public void pickUpObject3_0_9Remain() {
        Robot r = new Robot();
        r.pickUpObject3_0_9Remain();
        ArrayList<Double> expectedPosition = new ArrayList<>(Arrays.asList(3.0, 0.0, 9.0));
        assertEquals(expectedPosition, r.getPosition());
    }
}