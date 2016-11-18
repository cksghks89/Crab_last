import greenfoot.*; 

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Animal
{
    private int spawnCounter;
    private int newscore = 0;
    private boolean isLobster = true;
    private int spawnNum = 1;
    public Crab()
    {
        setImage("crab.png");
        spawnCounter = 0;
    }
    public void act()
    {
        lookForWorm();
        checkKeyPress();
        addNewWorm();
        spawnLobster();
    }
    public void lookForWorm()
    {
        if ( canSee(Worm.class) )
        {
            eat();
            spawnCounter++;
        }
    }
    public void checkKeyPress()
    {
        //Checks if the left key is down, then turn left with -4 degrees.
        if ( Greenfoot.isKeyDown("left") == true )
        {
            turn(-4);
        }
        //Checks if the right key is down, then turn right with 4 degrees.
        if ( Greenfoot.isKeyDown("right") == true )
        {
            turn(4);
        }
        //Checks if the up key is down, then move the crab.
        if ( Greenfoot.isKeyDown("up") == true )
        {
            move();
         
        }
    }
    public void addNewWorm()
    {
        if ( spawnCounter == 1 )
        {
            getWorld().addObject( new Worm(), Greenfoot.getRandomNumber(520), Greenfoot.getRandomNumber(520));
            spawnCounter = 0;
        }
    }
    
    /**
     * End the game if there is a value of 15 in the wormsEaten field.
     * it will then print the winning message to the user.
     */
    
    public void eat(){
        Actor warm;
        warm = getOneObjectAtOffset(0,0,Worm.class);
        if(warm != null) {
            newscore += 10;
            World myworld;
            myworld = getWorld();
            myworld.removeObject(warm);
            myworld.removeObjects(myworld.getObjects(Score.class));
            Score score = new Score(newscore);
            myworld.addObject(score,540,20);
            
        }
        
    }
    public void spawnLobster(){
        if((newscore % 100 == 0 && newscore != 0)&&isLobster){
            for(int i = 0;i<spawnNum;i++){
            	World myworld;
            	myworld = getWorld();
           	 	myworld.addObject( new Lobster(), Greenfoot.getRandomNumber(540), Greenfoot.getRandomNumber(540));
            	isLobster = false;
       		}
			spawnNum++;
        }
        if(newscore % 100 == 10){
            isLobster = true;
        }
    }
}


