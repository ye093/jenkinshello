package cn.yejy.onestore;

/**
 * 会员中心
 */
public class MemberRepository {

    public String member(String id) {
        return String.format("当前会员信息为：%s", id);
    }
}
