package com.dubo.controller;

import com.dubo.entity.ZhiHuUserBean;
import com.dubo.service.ZhiHuUserBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/12/2 0002.
 */
@RequestMapping("/test")
@Controller
public class ZhiHuUserBeanController {
    @Autowired
    ZhiHuUserBeanService zhiHuUserBeanService;

    public void setZhiHuUserBeanService(ZhiHuUserBeanService zhiHuUserBeanService) {
        this.zhiHuUserBeanService = zhiHuUserBeanService;
    }
    @RequestMapping("/t.action")
    public void insert(){
        zhiHuUserBeanService.insertData(new ZhiHuUserBean());
    }
}
