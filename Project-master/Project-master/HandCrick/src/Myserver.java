
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avivilla
 */
public class Myserver {
	 public static void main(String[] args) throws IOException, ClassNotFoundException {
        int portNum = 4444;
        ServerSocket listener = new ServerSocket(portNum);
        //ServerSocket listener2 =new ServerSocket(portNum);
//        System.out.println("Server is now running at port: " + portNum);
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int innings=1;
        int target=0;
      
        int Score=0;
        while (true)
      {
            try {
                Socket clientSocket = listener.accept();
                //Socket clientSocket1= listener.accept();
	    //outputstream first #avi
                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
               
             //  ObjectOutputStream out1 = new ObjectOutputStream(clientSocket1.getOutputStream());
               // ObjectInputStream in1 = new ObjectInputStream(clientSocket1.getInputStream());

                // Reading in Integer Object from input stream.
                int shot1 = (Integer) in.readObject();
                //int shot2=(Integer) in1.readObject();
                int shot2=sc.nextInt();
//                System.out.println("You gave "+Integer.toString(shot2));
//                System.out.println("Your opponent gave "+Integer.toString(shot1));
                String response="" ;
	     if(shot1==shot2)
		 { 
			 System.out.println("Wicket");
                         innings++;
                         if(innings==3)
                         {
                             response="Wicket";
                             response+="\nMatch Over!!!\n";
                             if(Score<target)
                             {
                                 response+="You gave "+Integer.toString(shot1)+"\nOpponent gave"+Integer.toString(shot2)+"\nOpponent is out\n"+"His score is "+Integer.toString(Score)+"\nYou won the match by "+Integer.toString(target-1-Score)+" runs\n";
                                 System.out.println("Match Over!!!"+"\nYou gave "+Integer.toString(shot2)+"\nOpponent gave "+Integer.toString(shot1)+"Your score is "+Integer.toString(Score)+"\nYou lost by "+Integer.toString(target-1-Score)+" runs\n");
                             }
//                             try{
//                                     out.close();
//                                     in.close();
//                                     listener.close();
//                                 }catch(IOException e)
//                                 {
//                                     e.printStackTrace();
//                                 }
                         }
                         else
                         {
                             response="You gave "+Integer.toString(shot1)+"\nOpponent gave "+Integer.toString(shot2)+"\nYou are Out ! Your Score is "+Integer.toString(Score)+"\n";
                             target=Score+1;
                             System.out.println("\nTarget is "+Integer.toString(target));
                             response+="Target is "+Integer.toString(target)+"\n";
                         }
			 Score=0;
			 
		 }
		 else  {
                         if(innings==1)
                         {
                             Score+=shot1;
                             System.out.println("You gave "+Integer.toString(shot2)+"\nOpponent gave "+Integer.toString(shot1));
                             System.out.println("Opponent's score is "+Integer.toString(Score)+"\n");
                             response="You gave "+Integer.toString(shot1)+"\nOpponent gave "+Integer.toString(shot2)+"\nYour Score is "+Integer.toString(Score)+"\n";
                         }
                         else if(innings==2)
                         {
                             Score+=shot2;
                             if(Score>=target)
                             {
                                 System.out.println("You gave "+Integer.toString(shot2)+"\nOpponent gave "+Integer.toString(shot1)+"\nYour Score is "+Integer.toString(Score)+"\n");
                                 System.out.println("You won the match\n");
                                 response="Match Over!!!";
                                 response+="\nYou gave "+Integer.toString(shot1)+"Your opponent gave "+Integer.toString(shot2)+"Opponent's score is "+Integer.toString(Score)+"\nYou lost the match\n";
//                                 try{
//                                     out.close();
//                                     in.close();
//                                     listener.close();
//                                 }catch(IOException e)
//                                 {
//                                     e.printStackTrace();
//                                 }
                             }
                             else
                             {
                                 System.out.println("You gave "+Integer.toString(shot2)+"\nOpponent gave "+Integer.toString(shot1)+"\nYour Score is "+Integer.toString(Score)+"\n");
                                 response="You gave "+Integer.toString(shot1)+"\nOpponent gave "+Integer.toString(shot2);
                                 response+="\nOpponent's score is "+Integer.toString(Score)+"\n";
                             }
                         }
		 };
                //Sending response back to client
              
                out.writeObject(response);
             in.close();
	 out.close();
	  //clientSocket.close();
     
            } finally {
                                     
               
            }
            
             
                
        }
    }


}
