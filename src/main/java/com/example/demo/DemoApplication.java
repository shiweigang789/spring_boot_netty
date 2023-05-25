package com.example.demo;

import com.example.demo.server.NettyServer;
import io.netty.channel.ChannelFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.net.InetSocketAddress;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class DemoApplication implements CommandLineRunner {

    @Value("${netty.host}")
    private String host;
    @Value("${netty.port}")
    private int port;
    @Autowired
    private NettyServer nettyServer;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        InetSocketAddress address = new InetSocketAddress(host, port);
//        ChannelFuture channelFuture = nettyServer.bing(address);
//        Runtime.getRuntime().addShutdownHook(new Thread(() -> nettyServer.destroy()));
//        channelFuture.channel().closeFuture().syncUninterruptibly();
    }

}
