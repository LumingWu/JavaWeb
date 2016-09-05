package Handler;

import Component.Bean;
import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class HW7Handler extends SimpleTagSupport {

    private Bean bean;

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        JspFragment frag = getJspBody();

        Enumeration<String> e = bean.getPropertyNames();
        while (e.hasMoreElements()) {
            String name = e.nextElement();
            getJspContext().setAttribute("name", name);
            getJspContext().setAttribute("value", bean.getProperty(name));
            if (frag != null) {
                frag.invoke(out);
            }
        }
    }

    public void setBean(Bean b) {
        this.bean = b;
    }
}
