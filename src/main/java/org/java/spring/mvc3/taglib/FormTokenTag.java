package org.egov.pgr.web.support.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class FormTokenTag extends BodyTagSupport {

	private static final long serialVersionUID = 1L;

	public int doStartTag() throws JspException {
		 try {
			JspWriter out = pageContext.getOut();
			final String tokenName = (String)pageContext.getRequest().getAttribute("tokenName");
			if (tokenName != null) {
				final String tokenValue = (String)pageContext.getRequest().getAttribute(tokenName);
				out.println("<input type='hidden' name='tokenName' value='"+tokenName+"'/>");
				out.println("<input type='hidden' name='"+tokenName+"' value='"+tokenValue+"'/>");
			}
		} catch (IOException e) {
			
		}

        return SKIP_BODY;
    }

}
