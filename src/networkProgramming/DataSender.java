package networkProgramming;

import java.net.*;  
public class DataSender
{  
  public static void main(String[] args) throws Exception 
  {  
    DatagramSocket ds = new DatagramSocket();  
    String str = "Welcome in Java Network Sessions!!";  
    InetAddress ip = InetAddress.getByName("192.168.46.59");  
     
    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);  
    ds.send(dp);  
    ds.close();  
  }  
}  
