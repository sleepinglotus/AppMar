package cn.zzcai.dao;

import org.apache.ibatis.annotations.Param;

import cn.zzcai.pojo.BackendUser;

/**
 * @author zzcai
 * @version 1.0
 * @date 2019��3��5�� ����11:45:14
 * @remark TODO
 */
public interface BackendUserMapper {
	BackendUser findByUserCode(@Param("userCode")String userCode);
}
