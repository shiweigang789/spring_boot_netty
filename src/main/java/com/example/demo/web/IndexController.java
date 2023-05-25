package com.example.demo.web;

import com.example.demo.server.NettyServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/nettyserver", method = RequestMethod.GET)
public class IndexController {

    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(String msg) {
        return "hi " + msg;
    }

    @Resource
    private NettyServer nettyServer;

//    @RequestMapping(value = "/localAddress")
//    @ResponseBody
//    public String localAddress() {
//        return "nettyServer localAddress " + nettyServer.getChannel().localAddress();
//    }
//
//    @RequestMapping(value = "/isOpen")
//    @ResponseBody
//    public String isOpen() {
//        return "nettyServer isOpen " + nettyServer.getChannel().isOpen();
//    }

}
