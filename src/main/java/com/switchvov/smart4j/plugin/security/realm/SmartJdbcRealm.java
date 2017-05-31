package com.switchvov.smart4j.plugin.security.realm;

import com.switchvov.smart4j.framework.helper.DatabaseHelper;
import com.switchvov.smart4j.plugin.security.SecurityConfig;
import com.switchvov.smart4j.plugin.security.password.Md5CredentialsMatcher;
import org.apache.shiro.realm.jdbc.JdbcRealm;

/**
 * 基于Smart的JDBC Realm(需要提供相关smart.plugin.security.jdbc.*配置项)
 * Created by Switch on 2017/5/31.
 */
public class SmartJdbcRealm extends JdbcRealm {

    public SmartJdbcRealm() {
        super.setDataSource(DatabaseHelper.getDataSource());
        super.setAuthenticationQuery(SecurityConfig.getJdbcAuthcQuery());
        super.setUserRolesQuery(SecurityConfig.getJdbcRolesQuery());
        super.setPermissionsQuery(SecurityConfig.getJdbcPermissionsQuery());
        super.setPermissionsLookupEnabled(true);
        // 使用MD5加密算法
        super.setCredentialsMatcher(new Md5CredentialsMatcher());
    }
}
