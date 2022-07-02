package com.lighthouse.gateway.component;

import cn.dev33.satoken.stp.StpInterface;
import cn.dev33.satoken.stp.StpUtil;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author gjk
 * <p> 2022-07-02 </p>
 * <p> 自定义权限验证接口拓展 </p>
 */
@Component
public class StpInterfaceImpl implements StpInterface {


    @Override
    public List<String> getPermissionList(Object loginId, String loginType) {
        // 返回此 loginId 拥有的权限码列表
//        UserDTO userDTO = (UserDTO) StpUtil.getSession().get("userInfo");
//        return userDTO.getPermissionList();
        return null;
    }

    @Override
    public List<String> getRoleList(Object o, String s) {
        // 返回此 loginId 拥有的角色码列表
        return null;
    }
}
