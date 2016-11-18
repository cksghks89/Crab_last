import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    private int addWorms = 0;
    private int addLobsters = 0;
    
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        
        super(560, 560, 1);
		
        addObject( new Crab(), 280, 280);
       
        while (addLobsters < 1)
        {
            addObject( new Lobster(), Greenfoot.getRandomNumber(540), Greenfoot.getRandomNumber(540));
            addLobsters++;
        }
       
        while (addWorms < 10)
        {
            addObject( new Worm(), Greenfoot.getRandomNumber(540), Greenfoot.getRandomNumber(540));
            addWorms++;
        }
        addObject(new Turtle(), Greenfoot.getRandomNumber(540), Greenfoot.getRandomNumber(540));
        addObject(new Score(0),540,20);
    }
}