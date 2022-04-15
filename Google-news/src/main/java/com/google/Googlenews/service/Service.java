package com.google.Googlenews.service;

import java.util.List;

public class Service {
// external api should hit q=?(controller)
	//q, qInTitle, sources, domains."

	
	public static String prepareUrl(String id, String apikey) {
	    String endpoint = "https://newsapi.org/v2";
	    String path = "/everything?";
	    StringBuilder str = new StringBuilder(endpoint);
	    str.append(path);
	    str.append("qInTitle="+id);
	    str.append("&apiKey=" + apikey);
	    return str.toString();
	  }
}
