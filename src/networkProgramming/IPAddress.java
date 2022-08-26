package networkProgramming;

import java.net.InetAddress;

class IPAddress
{
   public static void main(String args[]) throws Exception
   {
      InetAddress myIP=InetAddress.getLocalHost();
 
      /* public String getHostAddress(): Returns the IP 
       * address string in textual presentation.
       */
      System.out.println("My IP Address is:" + myIP.getHostAddress() + " and Host name is " + myIP.getHostName());
      System.out.println();
  }
}