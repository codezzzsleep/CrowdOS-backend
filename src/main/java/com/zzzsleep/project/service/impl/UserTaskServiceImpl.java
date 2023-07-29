package com.zzzsleep.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.UserTask;
import com.zzzsleep.project.service.UserTaskService;
import com.zzzsleep.project.mapper.UserTaskMapper;
import org.springframework.stereotype.Service;

/**
* @author 29204
* @description 针对表【user_task】的数据库操作Service实现
* @createDate 2023-07-29 18:41:22
*/
@Service
public class UserTaskServiceImpl extends ServiceImpl<UserTaskMapper, UserTask>
    implements UserTaskService{

}




