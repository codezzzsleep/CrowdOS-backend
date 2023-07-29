package com.zzzsleep.project.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.models.auth.In;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@TableName("task")
@Data
public class Task implements Serializable {
    /**
     * 任务id
     */
    @TableId(type = IdType.AUTO)
    private Integer taskId;
    /**
     * 任务名称
     */
    private String taskName;
    /**
     * 任务发布时间
     */
    @JsonFormat(pattern = "yyyy.MM.dd")
    private Date postTime;
    /**
     * 任务截至时间
     */
    @JsonFormat(pattern = "yyyy.MM.dd")
    private Date deadLine;
    /**
     * 任务发布者的id
     */
    private Integer userId;
    /**
     * 任务发布者的昵称
     */
    private String userName;
    /**
     * 本次任务的总积分
     */
    private Integer points;
    /**
     * 任务描述
     */
    private String taskDescribe;
    /**
     * 任务执行总人数
     */
    private Integer totalNum;
    /**
     * 任务执行状态
     */
    private Integer taskStatus;
    /**
     * 任务的类型
     * 通过整数型和对应的约定映射表来规定任务类型,数值范围0、1、2、3、4
     * 公共安全、环境调研、民生日常、商业应用、普通任务
     */
    private Integer taskKind;
    /**
     * 任务是否可执行
     */
    private Integer temp;
    /**
     * 地理位置需要：经度
     */
    private Float longitude;
    /**
     * 地理位置需要：维度
     */
    private Float latitude;
    /**
     * 任务类型
     */
    private String sensorTypes;
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
