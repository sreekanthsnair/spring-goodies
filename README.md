spring-goodies
==============

This contains collection of API's which can be used with Spring Framework MVC 3

-------------------------------------------------------------------------------------------------------------------------------------------------
Goodie No : 1 [Duplicate Form Submission Interceptor]
-------------------------------------------------------------------------------------------------------------------------------------------------
Usage
---------------------------------------------------------------------------------
1) Annote the form view method with @AddToken
2) Annote the submit method with @CheckToken
3) Include spring-form-token.tld in WEB-INF/ and point the same in web.xml
4) Add <%@ taglib prefix="token" uri="/WEB-INF/spring-form-token.tld" %> in jsp
5) Add <token:token/> inside that jsp's form tag
6) Add FormTokenInterceptor  bean reference to the interceptor stack
-------------------------------------------------------------------------------------------------------------------------------------------------
