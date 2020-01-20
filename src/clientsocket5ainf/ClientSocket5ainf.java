package clientsocket5ainf;
import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ClientSocket5ainf
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            Socket socket = new Socket("127.0.0.1", 2000);
            System.out.println("Connessione aperta.");
        }
        catch (ConnectException e)
        {
            System.err.println("Errore");
        }
    }
}