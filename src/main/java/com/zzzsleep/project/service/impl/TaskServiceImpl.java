package com.zzzsleep.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.zzzsleep.project.model.entity.Task;
import com.zzzsleep.project.service.TaskService;
import com.zzzsleep.project.mapper.TaskMapper;
import org.springframework.stereotype.Service;

/**
* @author 29204
* @description 针对表【task】的数据库操作Service实现
* @createDate 2023-07-29 18:41:02
*/
@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task>
    implements TaskService{

}




