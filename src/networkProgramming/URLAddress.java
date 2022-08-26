package networkProgramming;

import java.net.*;

class URLAddress
{
   public static void main(String args[])
   {
      try
      {
         InetAddress in=InetAddress.getByName("www.google.com");
         System.out.println("The ip Address of site is:"+in.getHostAddress() + " and Host name is " + in.getHostName());
      }
      catch(Exception e)
      {
         System.out.println("Some Exception has occurred with details"+e.getMessage());
      }
   }
}
