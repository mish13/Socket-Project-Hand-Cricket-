package handcricketnew;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import static java.lang.Thread.sleep;
import java.net.Socket;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avivilla
 */
public class Player extends Thread {
	 private String id;
	 private Socket socket;
	 private Player opponent;
	 private ObjectOutputStream out;
	 private  ObjectInputStream in; 
	 Game game;
	 int myScore;
	 int target;
	public Player(Socket socket,ObjectInputStream in,ObjectOutputStream out, Game game,String id)
	{
		this.id=id;
		this.socket=socket;
		this.out=out;
		this.in=in;
		this.game=game;
		target=0;
		myScore=0;
		
	}
	public void setOpponent(Player opponent) {
		this.opponent = opponent;
	}
	public String GetId()
	{
		return this.id;
	}
	public void run()
	{
		
		while(true)
		{
			// Check for State
			if(game.ok==true)
			{
						try {
							out.writeObject("Game Over\n"+game.whowon()+" has won");

						} catch (IOException ex) {
							Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
						}

					
			}
			
			//check for turn
			if(game.yourturn(this))
			{
						try {
							out.writeObject("Give Your Move Now");
						} catch (IOException ex) {
							Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
						}

					  int x=0;
						try {
							Object tem = null;
							try {
								tem=in.readObject();
							} catch (ClassNotFoundException ex) {
								Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
							}
							x=(int) tem;
							out.writeObject("You Gave " + x);
									  } 
						catch (IOException ex) 
						{
							Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
						}


					 String ss=game.legalMove(this, x);
						 try {
							out.writeObject(ss+game.curPlayer.GetId() );
						} catch (IOException ex) {
							Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
						}
						 if(ss.equals("Game Over"))
						 {
							 {
							 game.endgame();
						          }
						try {
							out.writeObject(ss +game.whowon()+" has won");
						} catch (IOException ex) {
							Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
						}
						break;
						 }
						
						 try {
							 out.writeObject(game.getScore());
						 } catch (IOException ex) {
							 Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
						 }
						 try {
							 sleep(250);
						 } catch (InterruptedException ex) {
							 Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
						 }
			 
			}
			else
			{
				try {
                                                         out.writeObject("Wait for your move");
							 out.writeObject(game.getScore());
						 } catch (IOException ex) {
							 Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
						 }
			}
	}
}
}
