package com.zhiyun.shiro.entity;/**
 * @Title: SysPermission
 * @ProjectName: shiro
 * @Description: TODO
 * @author: jiangxing
 * @date 2019/5/2911:03
 */

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Classname SysPermission
 * @Description TODO
 * @Date 2019/5/29 11:03
 * @Created by jiangxing
 */
@Entity
@Data
@Table(name = "sys_permission")
public class SysPermission implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;// 主键.

    private String name;// 名称.

    @Column(columnDefinition = "enum('menu','button')")
    private String resourceType;// 资源类型，[menu|button]

    private String url;// 资源路径.
    private String permission; // 权限字符串,menu例子：role:*，button例子：role:create,role:update,role:delete,role:view
    private Long parentId; // 父编号
    private String parentIds; // 父编号列表
    private Boolean available = Boolean.FALSE;




}