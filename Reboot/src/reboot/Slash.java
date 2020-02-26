/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reboot;


import java.awt.Color;
import java.util.Random;

/**
 * Nonplayer character Slash, who chases player.
 * @author Michael Van Camp
 */
public class Slash extends Opponent {
    
    public static double SPEED = 3; // Hack moves up to 3 units/turn
    
    // Feel free to add your own member variables here.
    Random rand = new Random();
    int randomWaypointAlive = WaypointSelection();
    
    
    
    /**
     * Initialization for Hack. Feel free to add to this to initialize your member variables.
     * @param x Initial location
     * @param y Initial location
     */
    
    public Slash(double x, double y) {
        super(x, y, SPEED, Color.ORANGE);
    }
    
    /**
     * Code to move Slash. This is the main method you will define.
     * @param dot Reference to Dot object
     * @param bob Reference to Bob object
     * @param hack Reference to Hack object (so you can create cooperative motion)
     * @param wires List of Wire objects (so you can avoid)
     * @param walls List of Wall objects (need to be passed to super move, and can 
     *              do raycasting to find where they are).
     * @param waypoints List of waypoint objects
     */
    
    public void move(Dot dot, Bob bob, Hack hack, Moving[] wires, Wall[] walls, Waypoint[] waypoints) {
        
        
        
        
        double direction = 0; // Set this to the direction to move.
        double speed = 3; // Speed to move in this direction. It should not exceed SPEED.
        double distance = 0;

        
        // YOU DID THIS, FIX IT
        double xWaypoint;
        double yWaypoint;
        
        
            
            xWaypoint = waypoints[randomWaypointAlive].getX();
            yWaypoint = waypoints[randomWaypointAlive].getY();
            
            distance = getWaypointDistance(waypoints[randomWaypointAlive]);
            System.out.println(randomWaypointAlive);
            direction = Math.atan(distance)/Math.PI*180;
           
             
       //  if (waypoints[randomWaypointAlive].checkCollision(m))
      //   {
             
       //  }

       
       
       
        // This is where my code goes. It must set direction and speed        
        
        
        
        // Call to superclass method to actually move Slash in this direction. 
        // DO NOT MODIFY!
        if (speed > SPEED) speed = SPEED;
        move(direction, speed, walls);        
    }
    
    //  Code to select a random waypoint, is not necessarily the route to go 
    // (just a theory)
     public int WaypointSelection () {
        int randomWaypointAlive = rand.nextInt(4); // Choose from waypoints 0-3 
      
        return randomWaypointAlive;
    }
}
