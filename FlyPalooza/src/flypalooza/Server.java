/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flypalooza;

/**
 *
 * @author Christian
 */
public class Server {
    public static ServerConnector servidor,cliente;
//    public static void main(String[] args) {
//        VServidor server =  new VServidor();
//        server.main();
//    }
    
    public static void initServer(){
        servidor = new ServerConnector("Servidor");
        servidor.start();
    }
}
