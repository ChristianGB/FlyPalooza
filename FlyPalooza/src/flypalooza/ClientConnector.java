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
public class ClientConnector extends Thread{
        private Socket s;
        private ServerSocket ss;
        private InputStreamReader entradaSocket;
        private DataOutputStream salida;
        private BufferedReader entrada;
        final int puerto = 8000;
        
        public ClientConnector(String ip){
            try{
                
                this.s = new Socket(ip, this.puerto);
                
                //Creacion de Entrada de Datos paralctura de mensajes
                this.entradaSocket = new InputStreamReader(s.getInputStream());
                this.entrada = new BufferedReader(entradaSocket);
                
                //Creacion de salida de datos para envio de mensajes
                this.salida = new DataOutputStream(s.getOutputStream());
                //this.salida.writeUTF(VCliente.jTextField3.getText()+" se a Conectado- \n");
                
            }catch(Exception ex){};
        }
        
    @Override
        public void run(){
            String texto;
            while(true){
                try{
                   texto = entrada.readLine();
                  // VCliente.jTextArea1.setText(VCliente.jTextArea1.getText()+"\n"+texto);
                }catch(IOException e){};
            }
        }
        
        public void Enviar(String msg){
            System.out.println("Enviado");
            try{
                this.salida = new DataOutputStream(s.getOutputStream());
                this.salida.writeUTF(msg+"\n");
            }catch(IOException e){
                System.out.println("Problema al enviar");
            };
        }
        
        public String Leer(){
            try{
                return entrada.readLine();
            }catch(IOException ex){};
            return null;
        }
        
        public void Desconectar(){
            try{
                this.s.close();
            }catch(Exception e){};
            
            try{
                this.ss.close();
            }catch(Exception e){};
            
        }
}
