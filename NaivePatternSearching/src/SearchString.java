
public class SearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String search = "sssyttyssyttysyts";
		String pattern = "tt";
		searchString(pattern, search);
	}

	public static void searchString(String pattern, String string){
		if(pattern.length() > string.length()){
			return;
		}
		for(int i = 0; i <= string.length() 
				- pattern.length(); i++){
			for(int j = 0; j < pattern.length(); j++){
				if(string.charAt(i+j) != pattern.charAt(j)){
					break;
				}
				if(j + 1 == pattern.length()){
					System.out.println("Pattern found at index" + i);
				}
			}
		}
		return;
	}
}
