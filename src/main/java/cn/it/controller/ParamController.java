package cn.it.controller;

import cn.it.domain.Account;
import cn.it.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping("/testParam")
    public String testParam(String username, String password) {
        System.out.println("执行了...");
        System.out.println("用户名" + username);
        System.out.println("密码" + password);
        return "success";
    }

    /**
     * 请求参数绑定把数据封装到JavaBean的类当中
     *
     * @param account
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account) {
        System.out.println("执行了...");
        return "success";
    }


    /**
     * 自定义类型转换器
     *
     * @param user
     * @return
     */


    @RequestMapping("/saveUser")
    public String saveUser(User user) {
        System.out.println("执行了...");
        System.out.println(user);
        return "success";

    }

    /**
     * 原生的servlet API获取
     * @return
     */

    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("执行了...");
        System.out.println(request);

        HttpSession session=request.getSession();
        System.out.println(session);

        ServletContext servletContext = session.getServletContext();
        System.out.println(response);
        return "success";
    }
}
