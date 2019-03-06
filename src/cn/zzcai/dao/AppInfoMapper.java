package cn.zzcai.dao;

import cn.zzcai.pojo.AppInfo;

/**
 * @author zzcai
 * @version 1.0
 * @date 2019年3月6日 下午1:25:57
 * @remark TODO
 */
public interface AppInfoMapper {
	AppInfo findByPage(String softwareName, String statusName, String categoryLevel3Name, String devName, Integer from,
			Integer pageSize);
}
