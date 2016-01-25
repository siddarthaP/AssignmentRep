package com.tags.classes;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;
public class CustomTags extends SimpleTagSupport {
	private String message;

	   public void setMessage(String msg) {
	      this.message = msg;
	   }

	   StringWriter sw = new StringWriter();
	   StringWriter swbody = new StringWriter();
	   public void doTag()
	      throws JspException, IOException
	    {
	       if (message != null) {
	          /* Use message from attribute */
	          JspWriter out = getJspContext().getOut();
	          
	          out.println("Hello Custom Tag!");
	          getJspBody().invoke(swbody);
		      getJspContext().getOut().println(swbody.toString());
	          out.println( message );
	       }
	       else {
	          /* use message from the body */
	          getJspBody().invoke(sw);
	          getJspContext().getOut().println(sw.toString());
	       }
	   }
	
}
