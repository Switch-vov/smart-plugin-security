package com.switchvov.smart4j.plugin.security.password;

import com.switchvov.smart4j.framework.utils.CodeUtils;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.CredentialsMatcher;

/**
 * MD5密码匹配器
 * Created by Switch on 2017/5/31.
 */
public class Md5CredentialsMatcher implements CredentialsMatcher {
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        // 获取从表单提交过来的密码、明文，尚未通过MD5加密
        String submitted = String.valueOf(((UsernamePasswordToken) token).getPassword());
        // 获取数据库中存储的密码，已通过MD5加密
        String encrypted;
        Object credentials = info.getCredentials();
        if (credentials instanceof char[]) {
            encrypted= String.valueOf((char[])info.getCredentials());
        } else {
            encrypted= String.valueOf(info.getCredentials());
        }
        return CodeUtils.md5(submitted).equals(encrypted);
    }
}
