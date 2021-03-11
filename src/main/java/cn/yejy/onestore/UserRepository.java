package cn.yejy.onestore;

/**
 * 存储个人信息
 */
public class UserRepository {

    public static boolean save(User user) {
        System.out.println(user);
        System.out.println("保存成功");
        return true;
    }
}
