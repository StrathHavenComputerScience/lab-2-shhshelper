public class Lab2
{
  
    public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);
    for(int i=24;i>0;i--){
    if(!Robot.frontIsClear()){
        Robot.turnLeft();
    }
    else if(Robot.onDark()){
        Robot.makeLight();
        
    }
    Robot.move();
}
    }
  
  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    for(int n=5;n>0;n--){
     combRow();   
    }
    
    
  }
  
  public static void makeCheckered()
  {
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    for(int o=4;o>0;o--){
        checkerRow();
        turn(3);
        if(Robot.frontIsClear()){
            Robot.move();
            turn(3);

    }
    checkerRow();
        turn(1);
        if(Robot.frontIsClear()){
            Robot.move();
            turn(1);

    }
    }
    
  }
  public static void turn(int j){
        for(int k=j;k>0;k--){
            Robot.turnLeft();
        }
    }
    public static void combRow(){
        turn(3);
        Robot.makeDark();
        for(int l=6;l>0;l--){
         Robot.move();
         Robot.makeDark();
        }
        turn(2);
        for(int m=6;m>0;m--){
         Robot.move();   
        }
        turn(3);
        if(Robot.frontIsClear()){
            Robot.move();
            Robot.makeDark();
            Robot.move();
        }
}
public static void checkerRow(){
 for(int p=3;p>0;p--){
     Robot.makeDark();
     Robot.move();
     Robot.move();
    }
    Robot.makeDark();
    Robot.move();
}
}
