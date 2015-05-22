package com.rebel.scan;

import java.net.InetAddress;
import java.net.Socket;

public class Scan {
    
    private Socket socket;
    private final String remote;
    
    public Scan(InetAddress target){
    
        remote = target.getHostName();
    }
    
    public boolean status(final int port) {

        try {
            socket = new Socket(remote,port);
            socket.setSoTimeout(200);
            socket.close();
            
            return true;
            
        } catch (Exception ex) {

            return false;
        }
    }
}
