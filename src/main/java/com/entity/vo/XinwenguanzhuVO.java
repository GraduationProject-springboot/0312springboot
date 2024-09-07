package com.entity.vo;

import com.entity.XinwenguanzhuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 防治知识
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xinwenguanzhu")
public class XinwenguanzhuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 新闻标题
     */

    @TableField(value = "xinwenguanzhu_name")
    private String xinwenguanzhuName;


    /**
     * 防治知识类型
     */

    @TableField(value = "xinwenguanzhu_types")
    private Integer xinwenguanzhuTypes;


    /**
     * 防治知识图片
     */

    @TableField(value = "xinwenguanzhu_photo")
    private String xinwenguanzhuPhoto;


    /**
     * 防治知识视频
     */

    @TableField(value = "xinwenguanzhu_video")
    private String xinwenguanzhuVideo;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 防治知识详情
     */

    @TableField(value = "xinwenguanzhu_content")
    private String xinwenguanzhuContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：新闻标题
	 */
    public String getXinwenguanzhuName() {
        return xinwenguanzhuName;
    }


    /**
	 * 获取：新闻标题
	 */

    public void setXinwenguanzhuName(String xinwenguanzhuName) {
        this.xinwenguanzhuName = xinwenguanzhuName;
    }
    /**
	 * 设置：防治知识类型
	 */
    public Integer getXinwenguanzhuTypes() {
        return xinwenguanzhuTypes;
    }


    /**
	 * 获取：防治知识类型
	 */

    public void setXinwenguanzhuTypes(Integer xinwenguanzhuTypes) {
        this.xinwenguanzhuTypes = xinwenguanzhuTypes;
    }
    /**
	 * 设置：防治知识图片
	 */
    public String getXinwenguanzhuPhoto() {
        return xinwenguanzhuPhoto;
    }


    /**
	 * 获取：防治知识图片
	 */

    public void setXinwenguanzhuPhoto(String xinwenguanzhuPhoto) {
        this.xinwenguanzhuPhoto = xinwenguanzhuPhoto;
    }
    /**
	 * 设置：防治知识视频
	 */
    public String getXinwenguanzhuVideo() {
        return xinwenguanzhuVideo;
    }


    /**
	 * 获取：防治知识视频
	 */

    public void setXinwenguanzhuVideo(String xinwenguanzhuVideo) {
        this.xinwenguanzhuVideo = xinwenguanzhuVideo;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：防治知识详情
	 */
    public String getXinwenguanzhuContent() {
        return xinwenguanzhuContent;
    }


    /**
	 * 获取：防治知识详情
	 */

    public void setXinwenguanzhuContent(String xinwenguanzhuContent) {
        this.xinwenguanzhuContent = xinwenguanzhuContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
