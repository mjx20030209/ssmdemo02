package cn.js.ccit.controller;

import cn.js.ccit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/getById")
    public ModelAndView getById(Integer id){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("user", userService.getById(id));
        modelAndView.setViewName("t1");
        return modelAndView;
    }
}
