package com.atguigu.springmvc.handlers;


import com.atguigu.springmvc.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by hfl on 2017/2/22.
 */
@RequestMapping("/springmvc")
@Controller
public class SpringMVCTest {

    private static final String SUCCESS = "success";





   @RequestMapping("/testServletAPI")
   public String testServletAPI(HttpServletRequest request, HttpServletResponse response){
        System.out.println("testServletAPI,");
        return SUCCESS;
    }

    /*
    * Spring MVC 会按请求参数名和POJO 属性名进行自动匹配，
    * 自动为该对象填充属性值。支持级联属性。
    * 如：dept.deptId、dept.address.tel等
    *
    * */
    @RequestMapping("/testPojo")
    public String testPojo(User user){
        System.out.println("testPojo:" + user);
        return SUCCESS;
    }

    /*
    * 了解：
    * @CookieValue： 映射一个Cookie值，属性同@RequestParam
    * */


    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String sessionId){
        System.out.println("testCookieValue:sessionId:" + sessionId);
        return SUCCESS;
   }

    /*
    * 了解：
    * 映射请求头信息
    * 用法同@RequestParam
    *
    * */

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestParam(value = "Accept-Language") String al){
        System.out.println("testRequestHeader,Accept-Language:" + al);
        return SUCCESS;
    }



    /*
    * @RequestParam 来映射请求参数
    * value值即请求参数的参数名
    * required该参数是否必须，默认为true
    * defaultValue请求参数的默认值
    * */
    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(@RequestParam(value = "username") String un ,
            @RequestParam(value = "age", required = false, defaultValue = "0") int age){
        System.out.println("testRequestParam, username:" + un + ", age:" + age);
        return SUCCESS;
    }



    /*
    * Rest  风格的URL。
    * 以CRUD 为例：
    * 新增：/order POST
    * 修改：/order/1 PUT      update?id=1
    * 获取：/order/1 GET      get?id=1
    * 删除：/order/1 DELETE   delete?id=1
    *
    * 如何发送PUT请求和DELETE请求？
    * 1.需要配置HiddenHttpMethodFilter
    * 2.需要发送POST请求
    * 3.需要在发送POST 请求时携带一个name=“_method”的隐藏域，值为DELETE或PUT
    *
    *
    * 在SpringMVC的目标方法中如何得到id?
    * 使用@PathVariable注解
    * */


    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
    public String testRestPut(@PathVariable Integer id){
        System.out.println("testRest Put:" + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}", method= RequestMethod.DELETE)
    public String testRestDelete(@PathVariable Integer id){
        System.out.println("testRest Delete:" + id);
        return SUCCESS;
    }





    @RequestMapping(value = "/testRest", method = RequestMethod.POST)
    public String testRest(){
        System.out.println("testRest POST");
        return SUCCESS;
    }




    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.GET)
    public String testRest(@PathVariable Integer id){
        System.out.println("testRest GET:" + id);
        return SUCCESS;
    }
    /*
    * @PathVariable 可以来映射URL 中的占位符到目标方法的参数中。
    * @param id
    * @return
    *
    * */
    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") Integer id){
        System.out.println("testPathVariable:" + id);
        return SUCCESS;
    }

    @RequestMapping("/testAntPath/*/abc")
    public String testAntPath(){
        System.out.println("testAntPath");
        return SUCCESS;
    }

    /*
    * 了解：可以使用params 和headers 来更加精确的映射请求，params 和 headers 支持简单的表达式。
    *
    * */
    @RequestMapping(value = "testParamsAndHeaders",
            params = {"username", "age!=10"})
    public String testParamsAndHeaders(){
        System.out.println("testParamsAndHeaders");
        return SUCCESS;
    }
    /*
    * 常用：使用method属性来指定请求方式
    *
    * */

    @RequestMapping(value = "/testMethod", method = RequestMethod.POST)
    public String testMethod(){
        System.out.println("testMethod");
        return SUCCESS;
    }

    /*
    * 1.@RequestMapping 除了修饰方法，还可以修饰类
    * 2.
    * 1）.类定义处，提供初步的请求映射信息。相对于WEB应用的更目录
    * 2）.方法处，提供进一步的细分映射信息。相对于类定义处的URL。若类定义处未标注@RequestMapping，
    * 则方法标记的URl相对于WEB应用的根目录
    * */

    @RequestMapping("/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("testRequestMapping");
        return SUCCESS;
    }
}
