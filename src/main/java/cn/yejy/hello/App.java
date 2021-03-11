package cn.yejy.hello;

import cn.yejy.onestore.MemberRepository;
import cn.yejy.onestore.User;
import cn.yejy.onestore.UserRepository;

public class App {

    public static void main(String[] args) {
        System.out.println("你好啊");
        System.out.println("1111");
        System.out.println("2222");
        System.out.println("4444");
        System.out.println("555");
        System.out.println("666");

        System.out.println("User start saving...");

        User user = new User("叶", 18);

        System.out.printf("store result %b%n", UserRepository.save(user));

        MemberRepository memberRepository = new MemberRepository();
        System.out.println(memberRepository.member("abc13232"));
    }
}
