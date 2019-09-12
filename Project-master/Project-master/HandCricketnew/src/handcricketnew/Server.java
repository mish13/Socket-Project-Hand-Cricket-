package handcricketnew;


import handcricketnew.Game;
import handcricketnew.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avivilla
 */
public class Server {
	 public static void main(String[] args) throws IOException, ClassNotFoundException {
        int portNum = 3333;
        ServerSocket listener = new ServerSocket(portNum);
        System.out.println("Server is now running at port: " + portNum);
         System.out.println("Welcome To Hand Cricket ");
       // Random random=new Random();
   
	Socket socket1=listener.accept();
          System.out.println("Player1 Connected");
	Socket socket2=listener.accept();
          System.out.println("Player 2 Connected");
         ObjectOutputStream out1 = new ObjectOutputStream(socket1.getOutputStream());
          ObjectInputStream in1 = new ObjectInputStream(socket1.getInputStream());
         ObjectOutputStream out2 = new ObjectOutputStream(socket2.getOutputStream());
          ObjectInputStream in2 = new ObjectInputStream(socket2.getInputStream());
          Game game =new Game();
          Player player1=new Player(socket1,in1,out1,game,"Player1");
          Player player2=new Player(socket2, in2,out2,game,"Player2");
           game.initGame(player1, player1, player2);
          player1.setOpponent(player2);
          player2.setOpponent(player1);
          out1.writeObject("your opponent "+player2.GetId() +" is online");
          out2.writeObject("your opponent "+player1.GetId() +" is online");
          player1.start();
          player2.start();
        
    }


	
}
