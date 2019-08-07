package cn.it.controller;

import cn.it.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 常用的注解
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username) {
        System.out.println(username);
        return "success";
    }

    /**
     * PathVariable注解
     *
     * @return
     */

    @RequestMapping(value = "/testPathVariable/{sid}", method = RequestMethod.POST)
    public String testPathVariable(@PathVariable(name = "sid") String id) {
        System.out.println(id);
        return "success";
    }

    /**
     * 获取请求头信息
     *
     * @param header
     * @return
     */

    @RequestMapping(value = "/testRequestHeader/{sid}")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header) {
        System.out.println(header);
        return "success";
    }
}