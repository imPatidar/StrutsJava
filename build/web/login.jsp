<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib  uri="http://struts.apache.org/tags-html" prefix="h" %>


<html>
    <head>
        <style type="text/css">
        #b
        {
         alignment-adjust: central;
        }
        
            
        </style>
        
        
        
    </head>
    
    <body>
        <h:errors/> 
        
        
        <h:form action="/login">
            <table border="1">
                <tr><td><b>UserName</b></td>       
                    <td><h:text property="name"/></td></tr>
                <tr><td><b>Password</b></td>
                    <td><h:password property="pass"/></td></tr>
                <tr > <td colspan="2" id="b">
                        <h:submit value="login"/>
                        
                    </td>
                    
            </table>
            
        </h:form>
        
    </body>
    
    
    
</html>