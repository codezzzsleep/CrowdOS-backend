package com.zzzsleep.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zzzsleep.project.common.BaseResponse;
import com.zzzsleep.project.model.entity.User;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 29204
 * @description 针对表【user】的数据库操作Service
 * @createDate 2023-07-29 18:41:13
 */

public interface UserService extends IService<User> {
    long userRegister(String userAccount, String userPassword, String checkPassword);

    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    User getLoginUser(HttpServletRequest request);

    boolean userLogout(HttpServletRequest request);
    boolean isAdmin(HttpServletRequest request);
}
