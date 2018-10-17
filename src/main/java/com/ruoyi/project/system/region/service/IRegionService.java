package com.ruoyi.project.system.region.service;

import com.ruoyi.project.system.region.domain.Region;
import java.util.List;
import java.util.Map;

/**
 * 省市区行政 服务层
 * 
 * @author taifu
 * @date 2018-10-16
 */
public interface IRegionService 
{
	/**
     * 查询省市区行政信息
     * 
     * @param id 省市区行政ID
     * @return 省市区行政信息
     */
	public Region selectRegionById(Integer id);
	
	/**
     * 查询省市区行政列表
     * 
     * @param region 省市区行政信息
     * @return 省市区行政集合
     */
	public List<Region> selectRegionList(Region region);
	
	/**
     * 新增省市区行政
     * 
     * @param region 省市区行政信息
     * @return 结果
     */
	public int insertRegion(Region region);
	
	/**
     * 修改省市区行政
     * 
     * @param region 省市区行政信息
     * @return 结果
     */
	public int updateRegion(Region region);
		
	/**
     * 删除省市区行政信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteRegionByIds(String ids);

	/**
	 * 搜索地区树
	 *
	 * @return 结果
	 */
	public List<Map<String,Object>> selectDeptTree();
}
