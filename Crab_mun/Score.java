import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public Score(int nowScore)
    {
        
        
        String score = "Score ="+String.valueOf(nowScore);
        GreenfootImage img = new GreenfootImage(150,50);
        img.drawString(score, 20, 30);
        setImage(img);
    
    }
    public void act() 
    {
        // Add your action code here.
       
    }    
}
