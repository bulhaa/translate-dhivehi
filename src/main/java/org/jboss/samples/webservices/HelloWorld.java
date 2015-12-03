package org.jboss.samples.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.gmail.freestyle_reunion.Translator;

@WebService()
public class HelloWorld {

	@WebMethod()
	public String sayHello(String eText) {
   	 String dText = Translator.translate(eText.split("\\s"), -1).getTranslatedText();
   	 return "test"+ dText;
	}
}
