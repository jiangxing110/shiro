package com.zhiyun.shiro.dao;

import com.zhiyun.shiro.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @Title: UserDao
 * @ProjectName: shiro
 * @Description: TODO
 * @author: jiangxing
 * @date 2019/5/2910:08
 */
public interface UserDao extends JpaRepository<User, Integer> {
    // 根据账号查询用户
    @Query(value = "SELECT * FROM sys_user WHERE username=:username", nativeQuery = true)
    User findByUsername(@Param("username") String username);
}