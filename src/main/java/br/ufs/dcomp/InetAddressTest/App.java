package br.ufs.dcomp.InetAddressTest;

import java.net.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            
            String name = "www.google.com";
            InetAddress[] address = InetAddress.getAllByName(name); 
            //System.out.println( "Name:      "+ name);
            for (InetAddress addr:address){
                System.out.println( "Address:   "+ addr.getHostAddress());
            }
            
        } catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }                
    }
}
