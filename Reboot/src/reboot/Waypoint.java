/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reboot;

import java.awt.Color;

/**
 *
 * @author Michael Van Camp
 * 
 * 
 * You are working on it
 */
public class Waypoint extends Entity {
     private int width;
    private int height;
    private int x; // Upper left corner of wall
    private int y;

    public Waypoint(int x, int y, int width, int height) {
        super(x, y, width, height, Color.BLUE);
        this.height = height;
        this.x = x;
        this.y = y;
    }
    
     public boolean checkCollision(Entity e) {
        if (intersects(e)) {
            return true;
        }
        else {
            return false;
        }
    }
}
