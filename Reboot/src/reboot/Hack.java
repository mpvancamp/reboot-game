/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reboot;

import java.awt.Color;

/**
 * Nonplayer character Hack, who chases player.
 * @author Michael Van Camp
 */
public class Hack extends Opponent {
    
    public static double SPEED = 3; // Hack moves up to 3 units/turn
    
    // Feel free to add your own member variables here.
    
    
    /**
     * Initialization for Hack. Feel free to add to this to initialize your member variables.
     * @param x Initial location
     * @param y Initial location
     */
    public Hack(double x, double y) {
        super(x, y, SPEED, Color.YELLOW);
        
    }
    
    /**
     * Code to move Hack. This is the main method you will define.
     * @param dot Reference to Dot object
     * @param bob Reference to Bob object
     * @param slash Reference to Slash object (so you can create cooperative motion)
     * @param wires List of Wire objects (so you can avoid)
     * @param walls List of Wall objects (need to be passed to super move, and can 
     *              do raycasting to find where they are).
     */
    public void move(Dot dot, Bob bob, Slash slash, Moving[] wires, Wall[] walls) {
        
        double direction = 0; // Set this to the direction to move.
        double speed = 0; // Speed to move in this direction. It should not exceed SPEED.
        
        // This is where your code goes. It must set direction and speed based on things
        // like Dot, Bob, Slash, the wires and the walls using whatever strategy you create.
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Call to superclass method to actually move Hack in this direction. 
        // DO NOT MODIFY!
        if (speed > SPEED) speed = SPEED;
        move(direction, speed, walls);        
    }
}
