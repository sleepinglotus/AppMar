package cn.zzcai.service;

import cn.zzcai.pojo.DevUser;

/**
 * @author zzcai
 * @version 1.0
 * @date 2019��3��5�� ����3:54:58
 * @remark TODO
 */
public interface DevUserService {
	public DevUser doLogin(String userCode, String userPassword);
}
