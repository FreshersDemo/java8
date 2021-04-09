package com.java8.encode_decode;

import java.util.Base64;

public class Encode_Decode 
{
	public static void main(String[] args) 
	{  
        Base64.Encoder encoder = Base64.getEncoder();   
      
        String str = encoder.encodeToString("Goutham KK".getBytes());  
        System.out.println("Encoded string: "+str);  
        Base64.Decoder decoder = Base64.getDecoder();  
        String dStr = new String(decoder.decode(str));  
        System.out.println("Decoded string: "+dStr);  
        String elink = encoder.encodeToString("http://www.github.com/FreshersDemo/java8".getBytes());  
        System.out.println("Encoded URL: "+elink);  
        Base64.Decoder decoder1 = Base64.getUrlDecoder();  
        String dlink = new String(decoder1.decode(elink));  
        System.out.println("Decoded URL: "+dlink);
        String message = "Hello, please do check with the updated repos";  
        String emessage = encoder.encodeToString(message.getBytes());  
        System.out.println("Encoded MIME message: "+emessage);  
          
        // Getting MIME decoder  
        Base64.Decoder decoder3 = Base64.getMimeDecoder();  
        // Decoding MIME encoded message  
        String dmessage = new String(decoder3.decode(emessage));  
        System.out.println("Decoded message: "+dmessage);   
        
    }
}
