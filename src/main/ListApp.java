package main;

/**
 * This class contains a main method
 * to test the ArrayList class with 
 * three different object types
 * 
 * @author chessicanation
 * Lab 3
 * CS131ON
 *
 */

import arraylist.*;

public class ListApp 
{

	public static void main(String[] args) 
	{
		//===================== Testing Strings ================================

		ArrayList<String> stringList = new ArrayList<String>(6);
		
		stringList.addItem("red");
		stringList.addItem("orange");
		stringList.addItem("yellow");
		stringList.addItem("green");
		stringList.addItem("blue");
		stringList.addItem("indigo");
		//violet is outside the limits of the array
		stringList.addItem("violet");

		System.out.println(stringList.toString());
		
		
		//===================== Testing Squares ================================
		ArrayList<Square> squareList = new ArrayList<Square>(5);
		
		Square square1 = new Square(1.1);
		Square square2 = new Square(2.2);
		Square square3 = new Square(3.3);
		Square square4 = new Square(4.4);
		Square square5 = new Square(5.5);
		Square square6 = new Square(6.6);
		
		System.out.println("Area of square4: " + square4.getArea());
		System.out.println();
		
		squareList.addItem(square1);
		squareList.addItem(square2);	
		squareList.addItem(square3);
		squareList.addItem(square4);
		squareList.addItem(square5);
		//square6 is outside the limits of the array
		squareList.addItem(square6);
		
		System.out.println(squareList.toString());
		
		
		//==================== Testing PointThreeDs ============================
		ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD>(10);
		
		PointThreeD point1 = new PointThreeD(11.1, 22.2, 33.3);
		PointThreeD point2 = new PointThreeD(44.4, 55.5, 66.6);
		PointThreeD point3 = new PointThreeD(77.7, 88.8, 99.9);
		
		pointList.addItem(point1);
		pointList.addItem(point2);	
		pointList.addItem(point3);
		
		System.out.println(pointList.toString());
		
	}//end main

}//end class
