package cn.zzcai.dao;

import org.apache.ibatis.annotations.Param;

import cn.zzcai.pojo.DevUser;

/**
 * @author zzcai
 * @version 1.0
 * @date 2019年3月5日 下午1:55:58
 * @remark TODO
 */
public interface DevUserMapper {
	DevUser findByDevCode(@Param("devCode")String devCode);
}
