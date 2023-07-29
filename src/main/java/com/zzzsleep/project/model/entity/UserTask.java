package com.zzzsleep.project.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@TableName("user_task")
@Data
public class UserTask implements Serializable {
    /**
     * 用户-任务id
     */
    @TableId(type = IdType.AUTO)
    private Integer userTaskId;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 任务id
     */
    private Integer taskId;
    /**
     * 任务执行状态：0接受未执行，1接受并执行
     */
    private Integer userTaskStatus;
    /**
     * 任务内容
     */
    private String content;
    /**
     * 任务类型
     */
    private Integer type;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy.MM.dd")
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy.MM.dd")
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}
