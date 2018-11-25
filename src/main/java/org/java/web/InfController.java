package org.java.web;

import org.java.service.InfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @Author: 马果
 * @Date: 2018/11/23 08:50
 * @Description:
 */
@Controller
public class InfController {

    @Autowired
    private InfService infService;

    @RequestMapping("/init")
    public String load(Model model){
        System.out.println("@@@@@@@@@@@@@@@@@@@123@@@@@@@@@@@@@@@@@@@@@@@@");
        List<Map<String,Object>> list = infService.getList();
        System.out.println("111111111111111111111");
        model.addAttribute("list",list );
        return "/show";
    }

}
