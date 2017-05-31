package com.switchvov.smart4j.plugin.security;


import com.switchvov.smart4j.framework.helper.ConfigHelper;
import com.switchvov.smart4j.framework.utils.ReflectionUtils;

/**
 * 从配置文件中获取相关属性
 * Created by Switch on 2017/5/31.
 */
public final class SecurityConfig {

    public static String getRealms() {
        return ConfigHelper.getString(SecurityConstant.REALMS);
    }

    public static SmartSecurity getSmartSecurity() {
        String className = ConfigHelper.getString(SecurityConstant.SMART_SECURITY);
        return (SmartSecurity) ReflectionUtils.newInstance(className);
    }

    public static String getJdbcAuthcQuery() {
        return ConfigHelper.getString(SecurityConstant.JDBC_AUTHC_QUERY);
    }

    public static String getJdbcRolesQuery() {
        return ConfigHelper.getString(SecurityConstant.JDBC_ROLES_QUERY);
    }

    public static String getJdbcPermissionsQuery() {
        return ConfigHelper.getString(SecurityConstant.JDBC_PERMISSIONS_QUERY);
    }

    public static boolean isCache() {
        return ConfigHelper.getBoolean(SecurityConstant.CACHE);
    }
}
