package handcricketnew;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avivilla
 */
public class Game {
           int score;
	int innings;
	int target;
	Player batsman;
	Player bowler;
	int  shot1;
	int shot2;
	Player curPlayer;
	boolean ok;

	public void initGame(Player curPlayer,Player batsman,Player bowler)
	{
		this.batsman=batsman;
	          this.curPlayer=curPlayer;
	          this.bowler=bowler;
	         innings=1;
	         score=0;
	        target=0;
	       ok=false;
	}
	public String whowon()
	{
	     if(score>target)
			 return "Player2";
	     else return  "Player1";
	}
                      public boolean yourturn(Player player)
		{
			if(player!=curPlayer) return false;
			return true;
		}
		public void endgame()
		{
		    ok=true;
                    return ;
		}
                      public String getScore()
		 {
			 return "Score "+Integer.toString(score)+"\nTarget "+Integer.toString(target);
		 }
	public  synchronized  String legalMove(Player player,int shot)
	{

	  if(curPlayer==batsman)
	  {
		  shot1=shot;
		  curPlayer=bowler;
		   return "wait for bowlers Move";
	  }
	  else
	  {
		  shot2=shot;
		  if(shot2!=shot1)
		  {
			  score+=shot1;
			  curPlayer=batsman;
		  }
		  else
		  {
			 if(innings==2)
			 {
				return "Game Over";
			 }
			 else
			 {
				 innings++;
				 target=score;
				 curPlayer=bowler;
				 bowler=batsman;
				 batsman=curPlayer;
				 score=0;
				 return "Out";
				 
			 }
		  }
	  }
	  if(innings==2 && score > target)
		  return "Game Over";
            
 			return "Next Move";
	}

	
}
