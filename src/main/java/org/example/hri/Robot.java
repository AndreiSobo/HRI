package org.example.hri;

import javax.print.attribute.standard.Severity;
import java.util.ArrayList;

public class Robot {
    public double x;
    public double y;
    public double z;
    public ArrayList<Double> coords = new ArrayList<>();

    // Constructor to initialize the robot's position at coordinates (x, y)
    public Robot() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public Robot(double X, double Y, double Z) {
        this.x = X;
        this.y = Y;
        this.z = Z;
    }
    // getters of x,y,z
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public double getZ() {
        return this.z;
    }

    // Method to move the robot on the X axis
    public void moveX(double distance) {
//        double oldX = this.x;
        this.x += distance;
//        double newX = this.x;
        System.out.println("Robot moved on x axis by " + distance + " units. New position: (" + this.x + ", " + this.y + ", " + this.z + ")");
    }
//    implementing the Y axis
    public void moveY(double distance) {
        this.y += distance;
        System.out.println("Robot moved on x axis by " + distance + " units. New position: (" + this.x + ", " + this.y + ", " + this.z + ")");
    }
//    implementing the Z axis
    public void moveZ(double distance) {
        this.z += distance;
        System.out.println("Robot moved on x axis by " + distance + " units. New position: (" + this.x + ", " + this.y + ", " + this.z + ")");
    }
    public ArrayList<Double> getPosition() {
        coords.add(getX());
        coords.add(getY());
        coords.add(getZ());
        System.out.println("Position: (" + this.x + ", " + this.y + ", " + this.z + ")");
        return coords;
    }
    public void returnToOrigin() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    // methods for gripper
    public void openGripper() {
        System.out.println("Opening gripper");
    }
    public void closeGripper() {
        System.out.println("Closing gripper");
    }
    public void pickUpObject_7_0_4() {
        this.returnToOrigin(); // Ensure the robot starts at the origin
        this.moveX(-7); // Move 7 cm to the left
        this.moveZ(4); // Move 4 cm forward
        this.openGripper(); // Open the gripper
        this.moveY(2); // Lower the arm 2 cm to reach the object
        this.closeGripper(); // Close the gripper to pick up the object
        this.moveY(-2); // Lift the object 2 cm
        this.returnToOrigin(); // Return to the origin
    }

    public void pickUpObject4_0_3() {
        this.returnToOrigin(); // Ensure the robot starts at the origin
        this.moveX(4); // Move 4 cm to the right
        this.moveZ(3); // Move 3 cm forward
        this.openGripper(); // Open the gripper
        this.moveY(2); // Lower the arm 2 cm to reach the object
        this.closeGripper(); // Close the gripper to pick up the object
        this.moveY(-2); // Lift the object 2 cm
        this.returnToOrigin(); // Return to the origin
    }

    public void pickUpObject3_0_9Remain() {
        this.returnToOrigin(); // Ensure the robot starts at the origin
        this.moveX(3); // Move 3 cm to the right
        this.moveZ(9); // Move 9 cm forward
        this.openGripper(); // Open the gripper
        this.moveY(2); // Lower the arm 2 cm to reach the object
        this.closeGripper(); // Close the gripper to pick up the object
        this.moveY(-2); // Lift the object 2 cm
        // Do not return to origin
    }

    // Main method to create a robot instance and move it to the left by 5 units
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.getPosition();
        robot.moveX(5);
        robot.getPosition();

        robot.pickUpObject_7_0_4();
        robot.pickUpObject4_0_3();
        robot.pickUpObject3_0_9Remain();
    }

}
