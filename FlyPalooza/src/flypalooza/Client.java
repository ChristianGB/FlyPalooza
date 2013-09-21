package flypalooza;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Client {
    public static ClientConnector servidor,cliente;
//    public static void main(String[] args) {
//         VCliente cliente = new VCliente();
//         cliente.main();
//    }
    
    public static void initCliente(String ip){
        cliente = new ClientConnector(ip);
        cliente.start();
    }
}
