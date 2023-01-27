package javaSDET;

import java.util.HashSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_01_Data_Type_Java_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		//cách khai báo: 
			//1: khai báo trước - khởi tạo sau
				String fullName;//khai báo: kiểu dữ liệu + tên biến 
				fullName = "truong khanh linh"; //khởi tạo - gán dữ liệu
				
			//2: khai báo + khởi tạo cùng lúc
				String addressName = "Hà Nội";
				
		//Kiểu dữ liệu nguyên thuỷ: Primitive type
			//Ký tự: char
			char a = 'A'; //chỉ 1 ký tự,dùng nháy đơn ' 
		
			//số nguyên: byte short int long: không dấu, không có thập phân
			byte bNumber = 120; // nhỏ hơn 128
			
			short sNumber = 32767; // nhỏ hơn 32768
			
			int iNumber = 12343; //nhỏ hơn 2 tỷ
			
			long lNumber = 2323343;
			
			//số thực: float double
			float fNumber = 15.8F;
			
			double dNumber = 15.9D;
			
			//logic: boolean
			boolean status = true;
			status = false; //cập nhật lại giá trị mới
			System.out.println(status);
		
		//Kiểu dữ liệu tham chiếu: Reference type
			//chuỗi ký tự: Sting
			String cityName = "Hà Nội"; //dùng nháy đôi "
			
			//Class
			FirefoxDriver fDriver;
			
			//Interface
			WebDriver wDriver;
			
			//Collection: set list queue
				//HashSet | linkedHashSet | TreeSet
				HashSet hashSet = new HashSet<>();
				
				//ArrayList | LinkedList | Vector...
				//...
			
			//Object
			Object number;
			
			//Array
			String[] student = {"Ng V A", "Ng V B"};
			Integer[] point = {1,3,9};
	}

}
