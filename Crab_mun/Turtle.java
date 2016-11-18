import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Animal
{
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter = 100;
    public void act() 
    {
        // Add your action code here.
          if(counter <= 0){
            move(2);
            if(isAtEdge())
                turn(17);
            if(Greenfoot.getRandomNumber(100)<10)
                turn(Greenfoot.getRandomNumber(90)-45);
            counter--;
        }
        else
            counter--;
            
        if(counter == -40){
            counter = 100;
        }
        if( isTouching(Lobster.class)){
            removeTouching(Lobster.class);
        }
    }    
}
