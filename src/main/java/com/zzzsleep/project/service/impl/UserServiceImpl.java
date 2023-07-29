package com.zzzsleep.project.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzzsleep.project.model.entity.User;

import com.zzzsleep.project.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author 29204
 * @description 针对表【user】的数据库操作Service实现
 * @createDate 2023-07-29 18:41:13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements IService<User> {

}




