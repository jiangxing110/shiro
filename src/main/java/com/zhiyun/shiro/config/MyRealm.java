package com.zhiyun.shiro.config;/**
 * @Title: MyRealm
 * @ProjectName: shiro
 * @Description: TODO
 * @author: jiangxing
 * @date 2019/5/2910:07
 */

import com.zhiyun.shiro.dao.UserDao;
import com.zhiyun.shiro.entity.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Classname MyRealm
 * @Description TODO
 * @Date 2019/5/29 10:07
 * @Created by jiangxing
 */
public class MyRealm extends AuthorizingRealm {
    @Autowired
    private UserDao userDao;

    // 授权处理
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    // 认证处理
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // 编写Shiro判断逻辑，判断账号和密码
        // 1、判断账号
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

        User user = userDao.findByUsername(token.getUsername());
        if (user == null) {
            // 账号错误，Shiro底层会抛出UnknownAccountException异常
            return null;
        }

        // 2、判断密码
        return new SimpleAuthenticationInfo("", user.getPassword(), "");
    }
}
