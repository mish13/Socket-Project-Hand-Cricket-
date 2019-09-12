
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

        int portNum = 4444;

        
        Scanner sc=new Scanner(System.in);
        // Integer Object to send to Server.
        while(true)
		{
			try (Socket socket = new Socket("localhost", portNum)) {
				Integer num =sc.nextInt();
				ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
				// System.out.println("1");
				ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
				// System.out.println("2");
				out.writeObject(num);
				String response = (String) in.readObject();
				System.out.println(response);
				if(response.startsWith("Wicket")||response.startsWith("Match")) {
					//System.out.println("Ekhane ashe");
					socket.close();
					break;
				}
				out.flush();
			      socket.close();
//								   in.flush();
			}
		}
      
    }
}
