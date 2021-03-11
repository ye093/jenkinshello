package cn.yejy.hello;

import cn.yejy.config.ApplicationConfig;
import cn.yejy.onestore.MemberRepository;
import cn.yejy.onestore.User;
import cn.yejy.onestore.UserRepository;

public class App {

    public static void main(String[] args) {
        System.out.println(ApplicationConfig.HOST);
        System.out.println(ApplicationConfig.HOST_NAME);
    }
}
