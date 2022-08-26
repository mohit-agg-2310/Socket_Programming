package networkProgramming;


import java.io.*;    
import java.net.*;

public class HttpURLConnectionDemo
{    
public static void main(String[] args)
{    
try
{    
URL url=new URL("https://academy.carterradley.com/mod/page/view.php?id=8908");    
HttpURLConnection huc=(HttpURLConnection)url.openConnection();  

for(int i=1;i<=8;i++)
{  
System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
}  
huc.disconnect();   
}catch(Exception e)
{
	System.out.println(e);
	}    
}    
}    