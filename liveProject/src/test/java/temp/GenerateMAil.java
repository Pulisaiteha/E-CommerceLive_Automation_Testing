package temp;

import java.util.Date;

public class GenerateMAil {

	public static void main(String[] args) {
		
		Date date=new Date();
		
		String str = date.toString();
		String str2=str.replaceAll("\\s","");
		String str3=str2.replaceAll("\\:", "");
		
		String emailtime= str3+"@gmail.com";
		
		System.out.print(emailtime);
	}

}
