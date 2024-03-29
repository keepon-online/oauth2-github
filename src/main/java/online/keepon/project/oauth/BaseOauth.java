package online.keepon.project.oauth;

/**
 * @author fujie
 * @ 日期 2019-12-03 17:00
 */
public interface BaseOauth {

    /**
     * 授权地址
     *
     * @return 授权地址
     */
    public String authorize();

    /**
     * 获取accessToken
     *
     * @param code 请求编码
     * @return accessToken
     */
    public String accessToken(String code);

    /**
     * 获取用户信息
     *
     * @param accessToken token
     * @return user
     */
    public String userInfo(String accessToken);
}
