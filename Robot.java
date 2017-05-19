/*
 * Authors: Jordan Aron, Michael Kipp
 * Date: 5/19/2017
 * Class: Evolutionary Computaion & Artificial Life
 * Final Assignment
 * Adapted from code by Sherri Goings
 */

public class Robot{

  private int robotX, robotY;
  private int stratey;
  private int robotFacing;
  private int goalX, goalY;
  char[] dirs = new char[] {'e','n','w','s'};

  public Robot(int strat, int startingX, int startingY, int endingX, int endingY){
    this.strategy = strat;
    this.robotX = startingX;
    this.robotY = startingY;
    this.goalX = endingX;
    this.goalY = endingY;
  }

  public int move(int fl, fm, fr){
    // Determine robots strategy
    // Exectue robots strategy to determine move
  }

  //Strategies

}
