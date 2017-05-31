package com.switchvov.smart4j.plugin.security;

import java.util.Set;

/**
 * Smart Security接口
 * <br/>
 * 可在应用中实现该接口，然后在'smart.properties'配置文件中提供以下配置项：
 * <ul>
 * <li>smart.plugin.security.realms=custom</li>
 * <li>smart.plugin.security.custom.class=自定义接口实现类全限定名，例如："com.switchvov.chapter3.AppSecurity"</li>
 * </ul>
 * 或者是在'smart.properties'配置文件中提供以下配置项：
 * <ul>
 * <li>smart.plugin.security.realms=jdbc</li>
 * <li>smart.plugin.security.jdbc.authc_query=根据用户名获取密码的SQL，例如："SELECT password FROM user WHERE username = ?"</li>
 * <li>smart.plugin.security.jdbc.roles_query=根据用户名获取角色名集合，例如："SELECT r.role_name FROM user u, user_role ur, role r WHERE u.id = ur.user_id AND  r.id = ur.role_id AND u.username = ?"</li>
 * <li>smart.plugin.security.jdbc.permissions_query=根据角色名获取权限名集合，例如："SELECT p.permission_name FROM role r, role_permission rp, permission p WHERE r.id = rp.role_id AND p.id = rp.permission_id AND r.role_name = ?"</li>
 * </ul>
 * Created by Switch on 2017/5/31.
 */
public interface SmartSecurity {

    /**
     * 根据用户名获取密码
     *
     * @param username 用户名
     * @return 密码
     */
    String getPassword(String username);

    /**
     * 根据用户名获取角色名集合
     *
     * @param username 用户名
     * @return 角色名集合
     */
    Set<String> getRoleNameSet(String username);

    /**
     * 根据角色名获取权限名集合
     *
     * @param roleName 角色名
     * @return 权限名集合
     */
    Set<String> getPermissionNameSet(String roleName);
}
