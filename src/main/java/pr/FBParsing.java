package pr;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class FBParsing {

	public static void main(String[] args) throws URISyntaxException, JSONException, MalformedURLException, IOException {
		
		
		URI uri = new URI("https://graph.facebook.com/v2.5/160558090672531/feed?limit=1000&access_token=CAACEdEose0cBAKD2mCLSxxC8r1XuBPZBNYGrw0vHj9d5voZBuAUvKRHZAPR3iQKsq3D5qnwsJczuH0cn703nhQLyllf6rNGiVF2NmNpbkdZAn53NmJDHOdAw9ZCfud3JAuA4LkxvZAjdaj8ZCptTZC2HDnpMG7ad1OR5MPZCK1izI6bgUC31BRloBSsPfU6DYtp9WIE9jbiDbCIakd5FnP90Y");
		
		String content = new String(Files.readAllBytes(Paths.get("response.json")));
		System.out.println(content);
		FileReader n = new FileReader("response.json");
		
		 
		JSONObject o = new JSONObject(content);
		JSONArray t =  o.getJSONArray("data");
		
		
		
		

	

	

	}

}
