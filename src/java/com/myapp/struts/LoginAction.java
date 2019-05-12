package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String ERROR = "error";
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        LoginActionForm l=(LoginActionForm)form;
        String name1=l.getName();
        String pass1=l.getPass();
        
        
        if(name1.equals("pankaj")&& pass1.equals("patidar"))
            return mapping.findForward(SUCCESS);
        else
            return mapping.findForward(ERROR);
        
        
     }
}
