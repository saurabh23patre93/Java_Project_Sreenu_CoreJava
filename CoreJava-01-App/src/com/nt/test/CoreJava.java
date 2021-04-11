package com.nt.test;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.nt.model.Customer;

public class CoreJava {

	public static void main(String[] args) {
		try {
			String[] tokens=null;
			List<Customer> customerList=null;
			
			//File to be  opened for reading
			FileInputStream fis=new FileInputStream("E:\\sreenu.txt");
			//file to scanned
			Scanner sc=new Scanner(fis);
			
			while (sc.hasNextLine()) {
				//System.out.println(sc.nextLine());
				tokens=sc.nextLine().split(",");
			}
			System.out.println(Arrays.asList(tokens)+" "+tokens.length);
			customerList=new ArrayList<Customer>();
			Customer customer=new Customer();
			customer.setCustId(tokens[0]);
			customer.setName(tokens[1]);
			customer.setMobileNo(tokens[2]);
			customer.setCarNum(tokens[3]);
			customer.setCvv(tokens[4]);
			customer.setExpDate(tokens[5]);
			customer.setBalence(tokens[6]);
			
			customerList.add(customer);
			System.out.println(customer);
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
