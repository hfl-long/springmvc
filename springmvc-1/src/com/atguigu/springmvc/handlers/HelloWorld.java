package com.atguigu.springmvc.handlers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hfl on 2017/2/21.
 *
 * 1.使用@RequestMapping注釋來映射請求的url
 * 2.返回值會通過試圖解析器解析為實際的物理視圖，對於InternalResourceViewResolver試圖解析器，會做如下的解析：
 * 通過prefix + returnVal + 後綴 這樣的方式的到時記得物理視圖，然後做轉發操作
 */
@Controller
public class HelloWorld {
    @RequestMapping("/helloworld")
    public String hello(){
        System.out.println("hello world");
        return "success";
    }
}
