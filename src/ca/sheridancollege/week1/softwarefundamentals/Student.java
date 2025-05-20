/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 * this is mine!
 * A class to model Student Objects
 * each student has: a name (first an last name)
 * each student can: say their name (getName)
 * 
 * @author dancye May 7, 2018
 */
public class Student 
{
    private String name;
    private String color;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }
    
    
}
