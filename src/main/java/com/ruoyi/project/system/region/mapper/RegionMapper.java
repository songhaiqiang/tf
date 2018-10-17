package com.ruoyi.project.system.region.mapper;

import com.ruoyi.project.system.region.domain.Region;
import java.util.List;	

/**
 * 省市区行政 数据层
 * 
 * @author taifu
 * @date 2018-10-16
 */
public interface RegionMapper 
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
     * 删除省市区行政
     * 
     * @param id 省市区行政ID
     * @return 结果
     */
	public int deleteRegionById(Integer id);
	
	/**
     * 批量删除省市区行政
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteRegionByIds(String[] ids);
	
}