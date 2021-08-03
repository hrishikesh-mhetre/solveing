import java.util.regex.*;
import java.util.*;
public class extractor {
    public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			Boolean matchfound=false;
            Pattern pattern=Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher match =pattern.matcher(line);
            while(match.find()){
                System.out.println(match.group(2));
             matchfound=true;

            }
            if(!matchfound)
			{
                System.out.println("None");
            }
			testCases--;
		}
	}
}
