<%--
  Created by IntelliJ IDEA.
  User: hfl
  Date: 2017/2/21
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>


      <a href="/springmvc/testServletAPI"> Test ServletAPI</a>
      <br><br>


      <form action="/springmvc/testPojo" method="post">
          username: <input type="text" name="username"/>
          <br>
          password: <input type="password" name="password"/>
          <br>
          email: <input type="text" name="email"/>
          <br>
          age: <input type="text" name="age"/>
          <br>
          city: <input type="text" name="address.city"/>
          <br>
          province:<input type="text" name="address.province"/>
          <br>
          <input type="submit" value="Submit"/>
      </form>
      <br><br>


      <a href="/springmvc/testCookieValue">Test CookieValue</a>
      <br><br>

      <a href="/springmvc/testRequestHeader">Test RequestHeader</a>
      <br><br>
      <a href="/springmvc/testRequestParam?username=atguigu&age=11">Test testRequestParam</a>
      <br><br>
      <form action="/springmvc/testRest/1" method="post">
          <input type="hidden" name="_method" value="PUT"/>
          <input type="submit" value="TestRest PUT"/>
      </form>
      <br><br>
      <form action="/springmvc/testRest/1" method="post">
          <input type="hidden" name="_method" value="DELETE"/>
          <input type="submit" value="TestRest DELETE"/>
      </form>
      <br><br>
      <form action="/springmvc/testRest" method="post">
          <input type="submit" value="TestRest POST"/>
      </form>
      <br><br>
      <a href="/springmvc/testRest/1">Test Rest Get</a>
      <br><br>

      <a href="/springmvc/testPathVariable/1">Test testPathVariable</a>
      <br><br>
      <a href="/springmvc/testAntPath/mnxyz/abc">Test testAntPath</a>
      <br><br>
      <a href="/springmvc/testParamsAndHeaders?username=atguigu&age=10">Test ParamsAndHeaders</a>
      <br><br>
      <form action="/springmvc/testMethod" method="POST">
          <input type="submit" value="submit"/>
      </form>


      <a href="/springmvc/testMethod">Test Method</a>
      <br><br>
      <a href="/springmvc/testRequestMapping">Test RequestMapping</a>
      <br><br>
      <a href="/helloworld">Hello World</a>
  </body>
</html>
