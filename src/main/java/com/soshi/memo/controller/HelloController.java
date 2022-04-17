package com.soshi.memo.controller;

import com.soshi.memo.dao.SoshiDao;
import com.soshi.memo.dto.SoshiDto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    private final SoshiDao soshiDao;
    
	public HelloController(SoshiDao soshiDao) {
		this.soshiDao = soshiDao;
	}

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("helloWorld", "Hello Thymeleaf!!!!!!!!!!");
        return "hello";
    }

    @RequestMapping("/memo")
    public String memo(Model model) {
        model.addAttribute("memo", "memo");
        return "memo/memo";
    }

    @RequestMapping("/soshi")
    public String soshi(Model model) {
		
		SoshiDto testData = soshiDao.selectAll();
        model.addAttribute("soshi", testData.getTestName());
        return "soshi";
    }
}