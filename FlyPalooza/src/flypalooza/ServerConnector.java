/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flypalooza;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Christian
 */
public class ServerConnector extends Thread{
    private Socket s;
        private ServerSocket ss;
        private InputStreamReader entradaSocket;
        private DataOutputStream salida;
        private BufferedReader entrada;
        final int puerto = 8000;
        
        public ServerConnector(String nombre){
            super(nombre);
        }
        
        
        
        public void Enviar(String msg){
            try{
                this.salida.writeUTF(msg+"\n");
            }catch(IOException e){};
        }
        
    @Override
        public void run(){
            String text = "test";
            try{
                this.ss = new ServerSocket(puerto);
                this.s = ss.accept();
                
                this.entradaSocket = new InputStreamReader(s.getInputStream());
                this.entrada = new BufferedReader(entradaSocket);
                
                //Creacion de salida de datos para envio de mensajes
                this.salida = new DataOutputStream(s.getOutputStream());
                while(true){
                    text = this.entrada.readLine();
                    System.out.println(text);
                    //VServidor.jTextArea1.setText(VServidor.jTextArea1.getText()+"\n"+text);
                }
            }catch(IOException e){
              System.out.println("Algun tipo de error a sucedido");  
            };
        }
        
        
        public String Leer(){
            try{
                return this.entrada.readLine();
            }catch(IOException ex){};
            return null;
        }
        
        public void Desconectar(){
            try{
                s.close();
            }catch(Exception e){};
            
            try{
                ss.close();
            }catch(Exception e){};
            
        }
}
