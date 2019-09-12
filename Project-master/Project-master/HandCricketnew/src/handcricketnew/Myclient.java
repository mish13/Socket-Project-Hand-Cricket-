package handcricketnew;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
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
public class Myclient {
	public static void main(String arg[]) throws IOException, ClassNotFoundException {

        int portNum = 3333;

        
        Scanner sc=new Scanner(System.in);
       Socket socket = new Socket("10.100.32.23", portNum);
	
             ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
	  ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        while(true)
		{
			         
			           String response;
			           String tem="Give Your Move Now";
			           response = (String) in.readObject();
				System.out.println("Server message: " + response);
				if(response.equals(tem))
				{
					int x=sc.nextInt();
			                      out.writeObject(x);
				           out.flush();
				}
			          
				if(response.startsWith("Game Over"))
				{
					
					break;
				}
								     
					
		}
		
		socket.close();
      
    }
}
