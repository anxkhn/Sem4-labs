import java.net.*;
import java.io.*;

public class TCPClient{
    public static void main(String args[]){
        int serverport = 8080;
        String serveraddress="localhost";
        try{
            Socket socket = new Socket(serveraddress, serverport);
            System.out.println("Connected to Server");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

            BufferedReader  console = new BufferedReader(new InputStreamReader(System.in));
            String msg;
    
                System.out.print("Enter message");
                msg = console.readLine();
                out.println(msg);
 
            in.close();
            out.close();
            socket.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
        }
    }
}

