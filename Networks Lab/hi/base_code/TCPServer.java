import java.net.*;
import java.io.*;

public class TCPServer{
    public static void main (String args []){
        int port = 8080;
        try{
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Connected to port"+ port);
            Socket clientsocket= serverSocket.accept();
            System.out.println("Client Connected");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientsocket.getOutputStream(),true);

            String msg;
       
                msg = in.readLine();
                System.out.println("Recived: "+ msg);

                






            in.close();
            out.close();
            clientsocket.close();
            serverSocket.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{

        }
    }
}
