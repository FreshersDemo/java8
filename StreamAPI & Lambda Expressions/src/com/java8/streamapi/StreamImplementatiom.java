package com.java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamImplementatiom 
{
	public static void main(String[] args) 
	{  
	        List<Stream> productsList = new ArrayList<Stream>();  
	        //Adding Products  
	        productsList.add(new Stream(1,"HP Laptop",25000f));  
	        productsList.add(new Stream(2,"Dell Laptop",30000f));  
	        productsList.add(new Stream(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Stream(4,"Sony Laptop",28000f));  
	        productsList.add(new Stream(5,"Apple Laptop",90000f));
	       
	        List<Float> productPriceList2 =productsList.stream()  
            .filter(p -> p.price > 25000)
            // filtering data  
            .map(p->p.price)       
            // fetching price  
            .collect(Collectors.toList()); // collecting as list  
	        System.out.println(productPriceList2);  
	        // max() method to get max Product price   
	        Stream s = productsList.stream()  
	            .max((product1, product2)->product1.price > product2.price ? 1: -1).get();  
	        System.out.println(s.price);  
	        // min() method to get min Product price  
	        Stream s1 = productsList.stream()  
	        	.max((product1, product2)->product1.price < product2.price ? 1: -1).get();  
	        System.out.println(s1.price); 
	        // Using Collectors's method to sum the prices.  
	        double totalPrice3 = productsList.stream()  
	                        .collect(Collectors.summingDouble(product->product.price));  
	        System.out.println(totalPrice3);
	        // count number of products based on the filter  
	        long count = productsList.stream()  
	                    .filter(product->product.price<30000)  
	                    .count();  
	        System.out.println(count);  
	     // Approach for filtering data  
	        productsList.stream()  
	        .filter(product -> product.price == 30000) 
	        .forEach(product -> System.out.println(product.name));    
	}  
}  