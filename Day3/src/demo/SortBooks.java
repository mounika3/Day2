package demo;
import java.util.Arrays;

import marlabs.Book;
public class SortBooks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book arr[]=new Book[5];
		arr[0]=new Book(101,"Core JAVA",50);
		arr[1]=new Book(102,"JSP",150);
		arr[2]=new Book(90,"Servlets",330);
		arr[3]=new Book(11,"JDBC",180);
		arr[4]=new Book(191,"HTML",210);
		Arrays.sort(arr);
		for(Book temp:arr){
			System.out.println(temp);
		}


	}

}
